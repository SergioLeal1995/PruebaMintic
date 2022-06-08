package vista;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JFrame;

public class VentanaListar extends JFrame {
    private PanelListar PanelListar;
    
    public VentanaListar() throws SQLException {
        setTitle("Reto 5: Listar");
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
        PanelListar = new PanelListar ();
        PanelListar.setBounds(25, 25, 650, 400);
        getContentPane().add(PanelListar);     
        
    }

    public PanelListar getPanelListar() {
        return PanelListar;
    }

    public void setPanelListar(PanelListar PanelListar) {
        this.PanelListar = PanelListar;
    }
    
    
}
