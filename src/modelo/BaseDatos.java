package modelo;

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

    public void EstableciendoConexion() {
        String db = mispropiedades.getProperty("database");
        String iploc = mispropiedades.getProperty("IPLocal");
        String user = mispropiedades.getProperty("usuario");
        String pass = mispropiedades.getProperty("pass");
        String url = "jdbc:mysql://" + iploc + ":3306/" + db + "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Problema al cerrar la conexion de la Base de Datos");
        }
    }

    public void Listar() {//ResultSet

        PreparedStatement ps;
        ResultSet rs = null;
        String sql = "SELECT * FROM Producto";
        try {
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int codigo = rs.getInt(1);
                String nombre = rs.getString(2);
                int valorCompra = rs.getInt(3);
                int valorVenta = rs.getInt(4);
                int Cantidad = rs.getInt(5);
                String categoria = rs.getString(6);
                System.out.println("Código : " + codigo + " Nombre: " + nombre + " Valor Compra: " + valorCompra + " Valor Venta: " + valorVenta + " Cantidad: " + Cantidad + " Categoria: " + categoria);
            }
        } catch (SQLException e) {
            System.out.println("Problema Buscando La Base de Datos");
        }

        //return rs;
    }

    public ResultSet Consultar(int codigo, String nombre) {
        PreparedStatement ps;
        ResultSet rs = null;
        String cadena_codigo = String.valueOf(codigo);
        int flag = 0;
        String sql = " ";
        if(!" ".equals(cadena_codigo) && " ".equals(nombre)){
            sql = "SELECT * FROM Producto WHERE codigo = ?";
            flag = 1;
        }else if(!" ".equals(nombre) && " ".equals(cadena_codigo)){
            sql = "SELECT * FROM Producto WHERE nombre = ?";
            flag = 2;
        }else if(!" ".equals(cadena_codigo) && !" ".equals(nombre)){
            sql = "SELECT * FROM Poducto WHERE codigo = ? AND nombre = ?";
            flag = 3;
        }else{
            System.out.println("No escribió en ningún campo");
        }
        try {
            ps = conexion.prepareStatement(sql);
            switch (flag) {
                case 1 -> ps.setInt(1, codigo);
                case 2 -> ps.setString(1, nombre);
                case 3 -> {
                            ps.setInt(1, codigo);
                            ps.setString(2, nombre);}
                default -> {
                    System.out.println("No hay argumentos para el query");
                }
            }
            rs = ps.executeQuery();
        } catch (SQLException e) {
            System.out.println("Problema Buscando La Base de Datos");
        }
        return rs;
    }

    public String Crear(int id, String Nombre, int valorCompra, int valorVenta, int Cantidad, String Categoria) {
        PreparedStatement ps;
        String sql = "INSERT INTO Producto(id,nombre,valor_compra,valor_venta,cantidad,categoria) VALUES (?,?,?,?,?,?)";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, Nombre);
            ps.setInt(3, valorCompra);
            ps.setInt(4, valorVenta);
            ps.setInt(5, Cantidad);
            ps.setString(6, Categoria);
            int contador = ps.executeUpdate();
            if (contador > 0) {
                return "Se agregó el registro de manera exitosa";
            } else {
                return "Ocurrio un problema al agregar el registro";

            }
        } catch (SQLException e) {
            return "Problema al crear un nuevo producto";
        }

    }
    
    public String Modificar(String nombre, int valorCompra, int valorVenta, int Cantidad) {
        PreparedStatement ps;
        String sql = " ";
        String cadena_vc = String.valueOf(valorCompra);
        String cadena_vv = String.valueOf(valorVenta);
        String cadena_c = String.valueOf(Cantidad);
        int flag = 0;
        if(!" ".equals(cadena_vc) && " ".equals(cadena_vv) && " ".equals(cadena_c)){
            sql = "UPDATE Producto SET valor_compra =? WHERE nombre = ?";
            flag = 1;
        }else if(!" ".equals(cadena_vv) && " ".equals(cadena_vc) && " ".equals(cadena_c)){
            sql = "UPDATE Producto SET valor_venta =? WHERE nombre = ?";
            flag = 2;
        }else if(!" ".equals(cadena_c) && " ".equals(cadena_vv) && " ".equals(cadena_vc)){
            sql = "UPDATE Producto SET cantidad =? WHERE nombre = ?";
            flag = 3;
        }else if(!" ".equals(cadena_vc) && !" ".equals(cadena_vv) && " ".equals(cadena_c)){
            sql = "UPDATE Producto SET valor_compra = ?, valor_venta =? WHERE nombre = ?";
            flag = 4;
        }else if(!" ".equals(cadena_vv) && " ".equals(cadena_vc) && !" ".equals(cadena_c)){
            sql = "UPDATE Producto SET valor_venta = ?, cantidad =? WHERE nombre = ?";
            flag = 5;
        }else if(!" ".equals(cadena_c) && " ".equals(cadena_vv) && !" ".equals(cadena_vc)){
            sql = "UPDATE Producto SET valor_compra = ?, cantidad =? WHERE nombre = ?";
            flag = 6;
        }else if(!" ".equals(cadena_vc) && " ".equals(cadena_vv) && " ".equals(cadena_c)){
            sql = "UPDATE Producto SET valor_compra = ?, valor_venta = ?, cantidad =? WHERE nombre = ?";
            flag = 7;
        }else{
            System.out.println("No escribió en ningún campo");
        }
        
        try {
            ps = conexion.prepareStatement(sql);
            switch (flag) {
                case 1 -> {
                    ps.setInt(1, valorCompra);
                    ps.setString(2, nombre);
                }
                case 2 -> {
                    ps.setInt(1, valorVenta);
                    ps.setString(2, nombre);
                }
                case 3 -> {
                    ps.setInt(1, Cantidad);
                    ps.setString(2, nombre);
                }
                case 4 -> {
                    ps.setInt(1, valorCompra);
                    ps.setInt(2, valorVenta);
                    ps.setString(3, nombre);
                }
                case 5 -> {
                    ps.setInt(1, valorVenta);
                    ps.setInt(2, Cantidad);
                    ps.setString(3, nombre);
                }
                case 6 -> {
                    ps.setInt(1, valorCompra);
                    ps.setInt(2, Cantidad);
                    ps.setString(3, nombre);
                }
                default -> {
                        ps.setInt(1, valorCompra);
                        ps.setInt(2, valorVenta);
                        ps.setInt(2, Cantidad);
                        ps.setString(3, nombre);
                }
            }
        } catch (SQLException e) {
            return "Error la hacer Update";
        }
        return "Registro actualizado con éxito";
    }
}
