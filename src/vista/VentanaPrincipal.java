package vista;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

    private PanelPrincipal PanelPrincipal;
    
    public VentanaPrincipal() throws SQLException {
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
        PanelPrincipal = new PanelPrincipal();
        PanelPrincipal.setBounds(25, 25, 650, 400);
        getContentPane().add(PanelPrincipal);     
    }

    public PanelPrincipal getPanelPrincipal() {
        return PanelPrincipal;
    }

    public void setPanelPrincipal(PanelPrincipal PanelPrincipal) {
        this.PanelPrincipal = PanelPrincipal;
    }

}