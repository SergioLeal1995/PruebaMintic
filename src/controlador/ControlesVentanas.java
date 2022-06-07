package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import vista.VentanaPrincipal;

import modelo.BaseDatos;

public class ControlesVentanas implements ActionListener {
    private VentanaPrincipal VentanaBienvenido;
    
    private BaseDatos bd;
    
    public ControlesVentanas() throws SQLException {
        VentanaBienvenido  = new VentanaPrincipal();
        asignarOyentes();
        VentanaBienvenido.setVisible(true);
    }
    public void asignarOyentes(){/*
        
    // ELementos en PanelBienvenido (Ventana1)
        
        VentanaBienvenido.getPbienvido().getB_Crear().addActionListener(this);
        VentanaBienvenido.getPbienvido().getB_Modificar().addActionListener(this);
        VentanaBienvenido.getPbienvido().getB_Eliminar().addActionListener(this);
        VentanaBienvenido.getPbienvido().getB_Consultar().addActionListener(this);
        VentanaBienvenido.getPbienvido().getB_Listar().addActionListener(this);
        
        // Elementos de PanelCrear (Ventana2)
        */
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //bd = new BaseDatos();
        if (e.getActionCommand().equals("crear")) {
            try {
                //
                VentanaBienvenido.setVisible(false);
                System.out.println("Sirve el botón CREAR");
                
            } catch (Exception ex) {
                System.out.println("Problema al insertar la información.");
            }
            //bd.closeConnection();  
        }
    }
}
