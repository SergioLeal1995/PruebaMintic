package vista;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

public class PanelCrear extends JPanel {
    private JLabel e_CrearProducto;
    private JLabel e_Vacio;
    public PanelCrear() {
        setLayout(new GridLayout(6, 3, 40, 20));
        setBackground(Color.GREEN);
        
        //inicializarComponentes();

        setVisible(true);
    }
    public void inicializarComponentes(){
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        e_CrearProducto = new JLabel("Crear Producto");
        add(e_CrearProducto);
    }

    public JLabel getE_CrearProducto() {
        return e_CrearProducto;
    }

    public void setE_CrearProducto(JLabel e_CrearProducto) {
        this.e_CrearProducto = e_CrearProducto;
    }

    public JLabel getE_Vacio() {
        return e_Vacio;
    }

    public void setE_Vacio(JLabel e_Vacio) {
        this.e_Vacio = e_Vacio;
    }

    public ComponentUI getUi() {
        return ui;
    }

    public void setUi(ComponentUI ui) {
        this.ui = ui;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }
    
    
}
