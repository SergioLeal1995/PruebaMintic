package vista;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelModificar extends JPanel{
    private JLabel e_ModificarProducto;
    private JLabel e_Vacio;
    private JTextField t_Nombre_PM;
    private JTextField t_Vcompra_PM;
    private JTextField t_Vventa_PM;
    private JTextField t_Cantidad_PM;
    private JButton b_Cargar_PM;
    private JButton b_Modificar_PM;
    private JButton b_Volver_PM;
    
    public PanelModificar() {
        setLayout(new GridLayout(7, 3, 40, 20));
        setBackground(new Color(10,148,100));
        
        inicializarComponentes();

        setVisible(true);
    }
    
    public void inicializarComponentes(){
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        e_ModificarProducto = new JLabel("Modificar Producto",SwingConstants.CENTER);
        add(e_ModificarProducto);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        // 
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        e_Vacio =  new JLabel("Filtrar por nombre",SwingConstants.CENTER);
        add(e_Vacio);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        //3
        e_Vacio =  new JLabel("Nombre: ",SwingConstants.CENTER);
        add(e_Vacio);
        t_Nombre_PM = new JTextField();
        add(t_Nombre_PM);
        b_Cargar_PM = new JButton("Cargar Registro(s)");
        b_Cargar_PM.setActionCommand("cargarregistro_pm");
        add(b_Cargar_PM);
        //4
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        e_Vacio =  new JLabel("Campos a modificar", SwingConstants.CENTER);
        add(e_Vacio);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        //5
        e_Vacio =  new JLabel("Valor Compra:", SwingConstants.CENTER);
        add(e_Vacio);
        e_Vacio =  new JLabel("Cantidad:", SwingConstants.CENTER);
        add(e_Vacio);
        e_Vacio =  new JLabel("Valor Venta:", SwingConstants.CENTER);
        add(e_Vacio);
        //6
        t_Vcompra_PM = new JTextField();
        add(t_Vcompra_PM);
        t_Vventa_PM = new JTextField();
        add(t_Vventa_PM);
        t_Cantidad_PM = new JTextField();
        add(t_Cantidad_PM);
        //7
        b_Modificar_PM = new JButton("Modificar");
        b_Modificar_PM.setActionCommand("modificar_PM");//label para accion
        add(b_Modificar_PM);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        b_Volver_PM = new JButton("Volver");
        b_Volver_PM.setActionCommand("volver_PanelModificar");//label para accion
        add(b_Volver_PM);
    }

    public JLabel getE_ModificarProducto() {
        return e_ModificarProducto;
    }

    public void setE_ModificarProducto(JLabel e_ModificarProducto) {
        this.e_ModificarProducto = e_ModificarProducto;
    }

    public JLabel getE_Vacio() {
        return e_Vacio;
    }

    public void setE_Vacio(JLabel e_Vacio) {
        this.e_Vacio = e_Vacio;
    }

    public JTextField getT_Nombre_PM() {
        return t_Nombre_PM;
    }

    public void setT_Nombre_PM(JTextField t_Nombre_PM) {
        this.t_Nombre_PM = t_Nombre_PM;
    }

    public JTextField getT_Vcompra_PM() {
        return t_Vcompra_PM;
    }

    public void setT_Vcompra_PM(JTextField t_Vcompra_PM) {
        this.t_Vcompra_PM = t_Vcompra_PM;
    }

    public JTextField getT_Vventa_PM() {
        return t_Vventa_PM;
    }

    public void setT_Vventa_PM(JTextField t_Vventa_PM) {
        this.t_Vventa_PM = t_Vventa_PM;
    }

    public JTextField getT_Cantidad_PM() {
        return t_Cantidad_PM;
    }

    public void setT_Cantidad_PM(JTextField t_Cantidad_PM) {
        this.t_Cantidad_PM = t_Cantidad_PM;
    }

    public JButton getB_Cargar_PM() {
        return b_Cargar_PM;
    }

    public void setB_Cargar_PM(JButton b_Cargar_PM) {
        this.b_Cargar_PM = b_Cargar_PM;
    }

    public JButton getB_Modificar_PM() {
        return b_Modificar_PM;
    }

    public void setB_Modificar_PM(JButton b_Modificar_PM) {
        this.b_Modificar_PM = b_Modificar_PM;
    }

    public JButton getB_Volver_PM() {
        return b_Volver_PM;
    }

    public void setB_Volver_PM(JButton b_Volver_PM) {
        this.b_Volver_PM = b_Volver_PM;
    }
    
}
