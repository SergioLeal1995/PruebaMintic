package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.BaseDatos;

public class controlador {
    public static void main(String[] args) throws SQLException {
        //BaseDatos database; //creo un objeto de tipo control
        //database = new BaseDatos();
        
        // Método de establecer conexión
        //database.EstableciendoConexion();
        
        // Método de cerrar conexión
        //database.closeConnection();
        
        // Método para consultar todos los registros
        /*ResultSet rs = database.Listar();
        try {
            while (rs.next()) {
                int codigo = rs.getInt(1);
                String nombre = rs.getString(2);
                int valorCompra = rs.getInt(3);
                int valorVenta = rs.getInt(4);
                int Cantidad = rs.getInt(5);
                String categoria = rs.getString(6);
                System.out.println("Código : " + codigo + " Nombre: " + nombre + " Valor Compra: " + valorCompra + " Valor Venta: " + valorVenta + " Cantidad: " + Cantidad + " Categoria: " + categoria);
            }
            System.out.print("Contar OK!");
        }catch (SQLException e){
            System.out.print("Something were wrong");
        }*/
        
        // Método para consultar un registro filtrado por nombre y código
        /*ResultSet rs = database.Consultar("2", "Hombre solo");
        try {
            while (rs.next()) {
                int codigo = rs.getInt(1);
                String nombre = rs.getString(2);
                int valorCompra = rs.getInt(3);
                int valorVenta = rs.getInt(4);
                int Cantidad = rs.getInt(5);
                String categoria = rs.getString(6);
                System.out.println("Código : " + codigo + " Nombre: " + nombre + " Valor Compra: " + valorCompra + " Valor Venta: " + valorVenta + " Cantidad: " + Cantidad + " Categoria: " + categoria);
            }
            System.out.print("Contar OK!");
        }catch (SQLException e){
            System.out.print("Something were wrong");
        }*/
        
        // Método para crear un nuevo registro
        //System.out.print(database.Crear(140, "Rastrillo", 12000, 30000, 50, "Jardin"));
        
        // Método para traer valor de compra, venta y cantidad
        /*ResultSet rs = database.traerCamposPruducto("Hombre solo");
        try {
            while (rs.next()) {
                int valorCompra = rs.getInt(1);
                int valorVenta = rs.getInt(2);
                int Cantidad = rs.getInt(3);
                System.out.println("Valor Compra: " + valorCompra + " Valor Venta: " + valorVenta + " Cantidad: " + Cantidad);
            }
            System.out.print("OK!");
        }catch (SQLException e){
            System.out.print("Something were wrong");
        }*/
        
        // Método para modificar registro
        //System.out.print(database.Modificar("Hombre solo", "0", "4", "100"));
        
        /*
        Pruebas de interface
        */
        ControlesVentanas control = new ControlesVentanas();
        
        //Controller control = new Controller();
        
    }
}