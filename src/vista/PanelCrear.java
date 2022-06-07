package vista;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelCrear extends JPanel {
    private JLabel e_CrearProducto;
    private JLabel e_Vacio;
    private JTextField t_Nombre;
    private JTextField t_Codigo;
    private JTextField t_Categoria;
    private JTextField t_ValorCompra;
    private JTextField t_ValorVenta;
    private JTextField t_Cantidad;
    private JButton b_Crear_PCrear;
    private JButton b_Volver_PCrear;
            
    public PanelCrear() {
        setLayout(new GridLayout(6, 3, 40, 20));
        setBackground(new Color(10,148,100));
        
        inicializarComponentes();

        setVisible(true);
    }
    public void inicializarComponentes(){
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        e_CrearProducto = new JLabel("Crear Producto",SwingConstants.CENTER);
        add(e_CrearProducto);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        //2
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        //3
        t_Nombre = new JTextField();
        add(t_Nombre);
        t_Codigo = new JTextField();
        add(t_Codigo);
        t_Categoria = new JTextField();
        add(t_Categoria);
        //4
        t_ValorCompra = new JTextField();
        add(t_ValorCompra);
        t_Cantidad = new JTextField();
        add(t_Cantidad);
        t_ValorVenta = new JTextField();
        add(t_ValorVenta);
        //5
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        //6
        b_Crear_PCrear = new JButton("Crear");
        b_Crear_PCrear.setActionCommand("crear_PanelCrear");//label para accion
        add(b_Crear_PCrear);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        b_Volver_PCrear = new JButton("Volver");
        b_Volver_PCrear.setActionCommand("volver_PanelCrear");//label para accion
        add(b_Volver_PCrear);
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

    public JTextField getT_Nombre() {
        return t_Nombre;
    }

    public void setT_Nombre(JTextField t_Nombre) {
        this.t_Nombre = t_Nombre;
    }

    public JTextField getT_Codigo() {
        return t_Codigo;
    }

    public void setT_Codigo(JTextField t_Codigo) {
        this.t_Codigo = t_Codigo;
    }

    public JTextField getT_Categoria() {
        return t_Categoria;
    }

    public void setT_Categoria(JTextField t_Categoria) {
        this.t_Categoria = t_Categoria;
    }

    public JTextField getT_ValorCompra() {
        return t_ValorCompra;
    }

    public void setT_ValorCompra(JTextField t_ValorCompra) {
        this.t_ValorCompra = t_ValorCompra;
    }

    public JTextField getT_ValorVenta() {
        return t_ValorVenta;
    }

    public void setT_ValorVenta(JTextField t_ValorVenta) {
        this.t_ValorVenta = t_ValorVenta;
    }

    public JTextField getT_Cantidad() {
        return t_Cantidad;
    }

    public void setT_Cantidad(JTextField t_Cantidad) {
        this.t_Cantidad = t_Cantidad;
    }

    public JButton getB_Crear_PCrear() {
        return b_Crear_PCrear;
    }

    public void setB_Crear_PCrear(JButton b_Crear_PCrear) {
        this.b_Crear_PCrear = b_Crear_PCrear;
    }

    public JButton getB_Volver_PCrear() {
        return b_Volver_PCrear;
    }

    public void setB_Volver_PCrear(JButton b_Volver_PCrear) {
        this.b_Volver_PCrear = b_Volver_PCrear;
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
