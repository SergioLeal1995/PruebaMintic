package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import vista.VentanaPrincipal;
import vista.VentanaCrear;

import modelo.BaseDatos;

public class ControlesVentanas implements ActionListener {
    private VentanaPrincipal VentanaBienvenido;
    private VentanaCrear VentanaCrear;
    private BaseDatos bd;
    
    public ControlesVentanas() throws SQLException {
        VentanaBienvenido  = new VentanaPrincipal();
        VentanaCrear = new VentanaCrear();
        asignarOyentes();
        VentanaBienvenido.setVisible(true);
        VentanaCrear.setVisible(false);
    }
    public void asignarOyentes(){
        // VentanaPrincipal (PanelPrincipal)
        VentanaBienvenido.getPanelPrincipal().getB_Crear().addActionListener(this);
        VentanaBienvenido.getPanelPrincipal().getB_Modificar().addActionListener(this);
        VentanaBienvenido.getPanelPrincipal().getB_Eliminar().addActionListener(this);
        VentanaBienvenido.getPanelPrincipal().getB_Modificar().addActionListener(this);
        VentanaBienvenido.getPanelPrincipal().getB_Listar().addActionListener(this);
        // VentanaCrear (PanelCrear)
       
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //bd = new BaseDatos();
        if (e.getActionCommand().equals("crear")) {
            try {
                //
                VentanaBienvenido.setVisible(false);
                System.out.println("Sirve el botón CREAR");
                //poner Visible la Ventanar crear
                VentanaCrear.setVisible(true);
                
            } catch (Exception ex) {
                System.out.println("Problema al insertar la información.");
            }
            //bd.closeConnection();  
        }
        else if (e.getActionCommand().equals("modificar")){
            VentanaBienvenido.setVisible(false);
            System.out.println("Boton modificar");
            VentanaCrear.setVisible(true);
        }
    }
}
