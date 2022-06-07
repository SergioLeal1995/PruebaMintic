package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import vista.VentanaPrincipal;
import vista.VentanaCrear;
import vista.VentanaListar;

import modelo.BaseDatos;

public class ControlesVentanas implements ActionListener {
    private VentanaPrincipal VentanaBienvenido;
    private VentanaCrear VentanaCrear;
    private VentanaListar VentanaListar;
    private BaseDatos bd;
    
    public ControlesVentanas() throws SQLException {
        VentanaBienvenido  = new VentanaPrincipal();
        VentanaCrear = new VentanaCrear();
        VentanaListar = new VentanaListar();
        
        asignarOyentes();
        VentanaBienvenido.setVisible(true);
        VentanaCrear.setVisible(false);
        VentanaListar.setVisible(false);
    }
    public void asignarOyentes(){
        // VentanaPrincipal (PanelPrincipal)
        VentanaBienvenido.getPanelPrincipal().getB_Crear().addActionListener(this);
        VentanaBienvenido.getPanelPrincipal().getB_Modificar().addActionListener(this);
        VentanaBienvenido.getPanelPrincipal().getB_Eliminar().addActionListener(this);
        VentanaBienvenido.getPanelPrincipal().getB_Modificar().addActionListener(this);
        VentanaBienvenido.getPanelPrincipal().getB_Listar().addActionListener(this);
        // VentanaCrear (PanelCrear)
        VentanaCrear.getPanelCrear().getT_Cantidad().addActionListener(this);
        VentanaCrear.getPanelCrear().getT_Categoria().addActionListener(this);
        VentanaCrear.getPanelCrear().getT_Codigo().addActionListener(this);
        VentanaCrear.getPanelCrear().getT_Nombre().addActionListener(this);
        VentanaCrear.getPanelCrear().getT_ValorCompra().addActionListener(this);
        VentanaCrear.getPanelCrear().getT_ValorVenta().addActionListener(this);
        VentanaCrear.getPanelCrear().getB_Crear_PCrear().addActionListener(this);
        VentanaCrear.getPanelCrear().getB_Volver_PCrear().addActionListener(this);
        // VentanListar (PanelListar)
        VentanaListar.getPanelListar().getB_Volver_PListar().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //bd = new BaseDatos();
        /*
        *********Ventana principal********
        crear,modificar,eliminar,consultar y listar
        Solo son vinculos para la siguientes Ventanas
        */
        if (e.getActionCommand().equals("crear")) { 
            // "Ventana Principal"->"Ventana Crear"
            try {
                //
                VentanaBienvenido.setVisible(false);
                System.out.println("Vinculo para ir a ventana crear");
                //poner Visible la Ventanar crear
                VentanaCrear.setVisible(true);
                
            } catch (Exception ex) {
                System.out.println("Problema al insertar la información.");
            }
            //bd.closeConnection();  
        }
        // "Ventana Principal"->"Ventana modificar"
        else if (e.getActionCommand().equals("modificar")){ 
            VentanaBienvenido.setVisible(false);
            System.out.println("Vinculo para ir a ventana modificar");
            //VentanaModificar.setVisible(true);
        }
        // "Ventana Principal"->"Ventana listar"
        else if (e.getActionCommand().equals("listar")){
            VentanaBienvenido.setVisible(false);
            VentanaListar.setVisible(true);
        }
        
         /*
         **********Ventana Crear*********
         Crear nuevos productos y volver a la principal
         t_Nombre, t_Codigo, t_Categoria, t_ValorCompra, t_ValorVenta, t_Cantidad
         cajas de texto para enlazar con la base
        */
        // "Ventana Crear" -> "Crear nuevo producto" (BOTON)
        else if (e.getActionCommand().equals("crear_PanelCrear")){
            // VentanaCrear -> Crear Registro
            System.out.println("Boton Crear, añadir a base de datos");
            //update
            
        }
        // "Ventana Crear" -> "Volver al principal" (BOTON)
        else if (e.getActionCommand().equals("volver_PanelCrear")){
            VentanaCrear.setVisible(false);
            VentanaBienvenido.setVisible(true);
        }
        
        /*
         **********Ventana Listar*********
         lISTAR LOS PRODUCTOS Y VOLVER
         Ver Base al entrar y Volver a la princiapl
        */
        else if (e.getActionCommand().equals("volver_PanelListar")){
            VentanaListar.setVisible(false);
            VentanaBienvenido.setVisible(true);
        }
    }
    
}
