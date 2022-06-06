package modelo;

import java.util.Optional;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDatos {
    private Connection conexion;
    private Properties mispropiedades;

    public BaseDatos() {
        mispropiedades = new Properties();
        conexion = null;
        try {
            mispropiedades.load(new FileReader("data/config.properties"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void EstableciendoConexion() {//OK
        String db = mispropiedades.getProperty("database");
        String iploc = mispropiedades.getProperty("IPLocal");
        String user = mispropiedades.getProperty("usuario");
        String pass = mispropiedades.getProperty("pass");
        String url = "jdbc:mysql://" + iploc + ":3306/" + db + "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(url, user, pass);
            System.out.println("Conexion establecida");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            conexion.close();
            System.out.println("Conexion cerrada");
        } catch (SQLException e) {
            System.out.println("Problema al cerrar la conexion de la Base de Datos");
        }
    }

    public ResultSet Listar() {//ResultSet OK

        PreparedStatement ps;
        ResultSet rs = null;
        String sql = "SELECT * FROM Producto";
        try {
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            /*while (rs.next()) {
                int codigo = rs.getInt(1);
                String nombre = rs.getString(2);
                int valorCompra = rs.getInt(3);
                int valorVenta = rs.getInt(4);
                int Cantidad = rs.getInt(5);
                String categoria = rs.getString(6);
                System.out.println("Código : " + codigo + " Nombre: " + nombre + " Valor Compra: " + valorCompra + " Valor Venta: " + valorVenta + " Cantidad: " + Cantidad + " Categoria: " + categoria);
            }*/
        } catch (SQLException e) {
            System.out.println("Problema Buscando La Base de Datos");
        }

        return rs;
    }

    public ResultSet Consultar(String code, String nombre) {
        int codigo = Integer.parseInt(code);
        PreparedStatement ps;
        ResultSet rs = null;
        String sql = "SELECT * FROM Producto WHERE codigo=? AND nombre =?";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            rs = ps.executeQuery();
        } catch (SQLException e) {
            System.out.println("Problema Buscando La Base de Datos " + e + " conexion: "+ conexion);
        }
        return rs;
    }

    public String Crear(int Codigo, String Nombre, int valorCompra, int valorVenta, int Cantidad, String Categoria) {//OK
        PreparedStatement ps;
        String sql = "INSERT INTO Producto(codigo,nombre,valor_compra,valor_venta,cantidad,categoria) VALUES (?,?,?,?,?,?)";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, Codigo);
            ps.setString(2, Nombre);
            ps.setInt(3, valorCompra);
            ps.setInt(4, valorVenta);
            ps.setInt(5, Cantidad);
            ps.setString(6, Categoria);
            int contador = ps.executeUpdate();
            if (contador > 0) {
                return "Se agregó el registro de manera exitosa\n";
            } else {
                return "Ocurrio un problema al agregar el registro\n";

            }
        } catch (SQLException e) {
            return "Problema al crear un nuevo producto\n";
        }

    }
    
    public ResultSet traerCamposPruducto(String Nombre){
        PreparedStatement ps;
        ResultSet rs = null;
        String sql = "SELECT valor_compra, valor_venta, cantidad FROM Producto WHERE nombre = ?";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, Nombre);
            rs = ps.executeQuery();
        } catch (SQLException e) {
            System.out.println("Problema Buscando La Base de Dtos");
        }
        return rs;
    }
    
    public String Modificar(String nombre, String cadena_vc, String cadena_vv, String cadena_c) {
        int valor_compra = Integer.parseInt(cadena_vc);
        int valor_venta = Integer.parseInt(cadena_vv);
        int categoria = Integer.parseInt(cadena_c);
        PreparedStatement ps;
        String sql = " ";    
        sql = "UPDATE Producto SET valor_compra =?, valor_venta =?, cantidad =? WHERE nombre =?";

        try {
            ps = conexion.prepareStatement(sql); 
            ps.setInt(1, valor_compra);
            ps.setInt(2, valor_venta);
            ps.setInt(3, categoria);
            ps.setString(4, nombre);
            int contador = ps.executeUpdate();
            if (contador > 0) {
                System.out.print("Se agregó el registro de manera exitosa\n");
            } else {
                System.out.print("Ocurrio un problema al agregar el registro\n");
            }
        } catch (SQLException e) {
            return "Error la hacer Update\n";
        }
        return "Registro actualizado con éxito\n";
    }
}
