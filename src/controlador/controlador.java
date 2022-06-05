package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.BaseDatos;

public class controlador {
    public static void main(String[] args) {
        BaseDatos database; //creo un objeto de tipo control
        database = new BaseDatos();
        
        database.EstableciendoConexion();
        //System.out.print(database.Crear(140, "Rastrillo", 12000, 30000, 50, "Jardin"));
        //database.Listar();
        //System.out.print(database.Modificar("Hombre solo", "0", "4", "100"));
        ResultSet rs = database.Consultar("2", "Hombre solo");
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
        }

    }
}