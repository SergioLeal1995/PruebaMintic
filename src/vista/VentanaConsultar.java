package vista;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JFrame;
public class VentanaConsultar extends JFrame {
    private PanelConsultar PanelConsultar;
    
    public VentanaConsultar()throws SQLException {
        setTitle("Reto 5: Consultar");
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
        PanelConsultar = new PanelConsultar();
        PanelConsultar.setBounds(25, 25, 600, 400);
        getContentPane().add(PanelConsultar);     
    }  

    public PanelConsultar getPanelConsultar() {
        return PanelConsultar;
    }

    public void setPanelConsultar(PanelConsultar PanelConsultar) {
        this.PanelConsultar = PanelConsultar;
    }
    
}
