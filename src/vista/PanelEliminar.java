package vista;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelEliminar extends JPanel{
    private JLabel e_EliminarProducto;
    private JLabel e_Vacio;
    private JTextField t_nomre_PE;
    private JTextField t_codigo_PE;
    private JButton b_eliminar_PE;
    private JButton b_volver_PE;
    
    public PanelEliminar(){
        setLayout(new GridLayout(5, 3, 40, 20));
        setBackground(new Color(10,148,100));
        
        inicializarComponentes();

        setVisible(true);
    }
    public void inicializarComponentes(){
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        e_EliminarProducto = new JLabel("Eliminar Producto",SwingConstants.CENTER);
        add(e_EliminarProducto);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        //2
        e_EliminarProducto = new JLabel("Nombre: ",SwingConstants.CENTER);
        add(e_EliminarProducto);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        e_EliminarProducto = new JLabel("Código: ",SwingConstants.CENTER);
        add(e_EliminarProducto);
        //3
        t_nomre_PE = new JTextField();
        add(t_nomre_PE);
        e_Vacio = new JLabel();
        add(e_Vacio);
        t_codigo_PE = new JTextField();
        add(t_codigo_PE);
        //4
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        //5
        b_eliminar_PE = new JButton("Eliminar");
        b_eliminar_PE.setActionCommand("eliminar_PE");//label para accion
        add(b_eliminar_PE);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        b_volver_PE = new JButton("Volver");
        b_volver_PE.setActionCommand("volver_PE");//label para accion
        add(b_volver_PE);
    }

    public JLabel getE_EliminarProducto() {
        return e_EliminarProducto;
    }

    public void setE_EliminarProducto(JLabel e_EliminarProducto) {
        this.e_EliminarProducto = e_EliminarProducto;
    }

    public JLabel getE_Vacio() {
        return e_Vacio;
    }

    public void setE_Vacio(JLabel e_Vacio) {
        this.e_Vacio = e_Vacio;
    }

    public JTextField getT_nomre_PE() {
        return t_nomre_PE;
    }

    public void setT_nomre_PE(JTextField t_nomre_PE) {
        this.t_nomre_PE = t_nomre_PE;
    }

    public JTextField getT_codigo_PE() {
        return t_codigo_PE;
    }

    public void setT_codigo_PE(JTextField t_codigo_PE) {
        this.t_codigo_PE = t_codigo_PE;
    }

    public JButton getB_eliminar_PE() {
        return b_eliminar_PE;
    }

    public void setB_eliminar_PE(JButton b_eliminar_PE) {
        this.b_eliminar_PE = b_eliminar_PE;
    }

    public JButton getB_volver_PE() {
        return b_volver_PE;
    }

    public void setB_volver_PE(JButton b_volver_PE) {
        this.b_volver_PE = b_volver_PE;
    }
    
}
