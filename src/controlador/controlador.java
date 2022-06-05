package controlador;

//import java.sql.ResultSet;
import modelo.BaseDatos;

public class controlador {
    public static void main(String[] args) {
        BaseDatos database; //creo un objeto de tipo control
        database = new BaseDatos();
        
        database.EstableciendoConexion();
        //System.out.print(database.Crear(140, "Rastrillo", 12000, 30000, 50, "Jardin"));
        //database.Listar();
        database.Modificar("Hombre solo", 45, 13000, 30);
    }
}
