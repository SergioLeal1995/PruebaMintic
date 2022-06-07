package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Ventana_1Main;
//import vista.Ventana_2Crear;
import modelo.BaseDatos;

public class controlador_ventanas implements ActionListener {
    private Ventana_1Main VentanaBienvenido;
    //private Ventana_2Crear VentanaCrear;
    //private Ventana_2Crear VentanaCrear;
    private BaseDatos bd;
    
    public controlador_ventanas(){
        VentanaBienvenido  = new Ventana_1Main();
        //VentanaCrear = new Ventana_2Crear();
        asignarOyentes();
        
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
