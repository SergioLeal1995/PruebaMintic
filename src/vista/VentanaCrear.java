package vista;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JFrame;
        
public class VentanaCrear extends JFrame {
    private PanelCrear PanelCrear;
    public VentanaCrear() throws SQLException {
        setTitle("Reto 5: Crear");
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
        PanelCrear = new PanelCrear ();
        PanelCrear.setBounds(25, 25, 650, 400);
        getContentPane().add(PanelCrear);     
    }

    public PanelCrear getPanelCrear() {
        return PanelCrear;
    }

    public void setPanelCrear(PanelCrear PanelCrear) {
        this.PanelCrear = PanelCrear;
    }
    
    
}
