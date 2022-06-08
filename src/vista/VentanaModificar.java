package vista;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JFrame;

public class VentanaModificar extends JFrame{
    private PanelModificar PanelModificar;
    
    public VentanaModificar() throws SQLException {
        setTitle("Reto 5: Modificar");
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
        PanelModificar = new PanelModificar();
        PanelModificar.setBounds(25, 25, 650, 400);
        getContentPane().add(PanelModificar);     
    }

    public PanelModificar getPanelModificar() {
        return PanelModificar;
    }

    public void setPanelModificar(PanelModificar PanelModificar) {
        this.PanelModificar = PanelModificar;
    }
    
}
