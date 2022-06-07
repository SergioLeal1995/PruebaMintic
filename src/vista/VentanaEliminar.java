package vista;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JFrame;

public class VentanaEliminar extends JFrame{
    private PanelEliminar PanelEliminar;
    
    public VentanaEliminar() throws SQLException {
        setTitle("Reto 5: Principal");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(new Color(10,148,100));
        getContentPane().setLayout(null);
        inicializarComponentes();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(false);
    }
    public void inicializarComponentes() throws SQLException {
        PanelEliminar = new PanelEliminar();
        PanelEliminar.setBounds(25, 25, 650, 400);
        getContentPane().add(PanelEliminar);     
    }

    public PanelEliminar getPanelEliminar() {
        return PanelEliminar;
    }

    public void setPanelEliminar(PanelEliminar PanelEliminar) {
        this.PanelEliminar = PanelEliminar;
    }
    
    
}
