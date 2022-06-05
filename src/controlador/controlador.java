package controlador;

//import java.sql.ResultSet;
import modelo.BaseDatos;

public class controlador {
    public static void main(String[] args) {
        BaseDatos database; //creo un objeto de tipo control
        database = new BaseDatos();
        
        database.EstableciendoConexion();
       
    }
}
