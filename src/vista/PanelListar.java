package vista;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelListar extends JPanel {
    private JLabel e_ListarProducto;
    private JLabel e_Vacio;
    private JButton b_Ver_PListar;
    private JButton b_Volver_PListar;
    
    public PanelListar() {
        setLayout(new GridLayout(5, 3, 40, 20));
        setBackground(new Color(10,148,100));
        
        inicializarComponentes();

        setVisible(true);
    }
    public void inicializarComponentes(){
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        e_Vacio =  new JLabel("Listar Productos", SwingConstants.CENTER);
        add(e_Vacio);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        //2
        e_Vacio =  new JLabel("ACA",SwingConstants.CENTER);
        add(e_Vacio);
        e_Vacio =  new JLabel("VA",SwingConstants.CENTER);
        add(e_Vacio);
        e_Vacio =  new JLabel("LA",SwingConstants.CENTER);
        add(e_Vacio);
        //3
        e_Vacio =  new JLabel("BASE",SwingConstants.CENTER);
        add(e_Vacio);
        e_Vacio =  new JLabel("DE",SwingConstants.CENTER);
        add(e_Vacio);
        e_Vacio =  new JLabel("DATOS",SwingConstants.CENTER);
        add(e_Vacio);
        //4
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        //5
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        b_Volver_PListar = new JButton("Volver");
        b_Volver_PListar.setActionCommand("volver_PanelListar");//label para accion
        add(b_Volver_PListar);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        
    }

    public JLabel getE_ListarProducto() {
        return e_ListarProducto;
    }

    public void setE_ListarProducto(JLabel e_ListarProducto) {
        this.e_ListarProducto = e_ListarProducto;
    }

    public JLabel getE_Vacio() {
        return e_Vacio;
    }

    public void setE_Vacio(JLabel e_Vacio) {
        this.e_Vacio = e_Vacio;
    }
    

    public JButton getB_Volver_PListar() {
        return b_Volver_PListar;
    }

    public void setB_Volver_PListar(JButton b_Volver_PListar) {
        this.b_Volver_PListar = b_Volver_PListar;
    }
    
}

