package vista;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public final class PanelPrincipal extends JPanel {

    private JLabel e_Bienvenido;
    private JLabel e_AccionUsar;
    private JLabel e_Vacio;
    private JButton b_Crear;
    private JButton b_Consultar;
    private JButton b_Modificar;
    private JButton b_Eliminar;
    private JButton b_Listar;
    
    public PanelPrincipal() {
        setLayout(new GridLayout(6, 3, 40, 20));
        setBackground(Color.GREEN);
        
        inicializarComponentes();

        setVisible(true);
    }

    public void inicializarComponentes(){
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        //2
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        e_Bienvenido = new JLabel("Ferreteria Dinamita",SwingConstants.CENTER);
        add(e_Bienvenido);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        //3
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        e_AccionUsar = new JLabel("Seleccione sección a usar",SwingConstants.CENTER);
        add(e_AccionUsar);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        //4
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        //5
        b_Crear = new JButton("Crear");
        b_Crear.setActionCommand("crear");
        add(b_Crear);
        b_Modificar = new JButton("Modificar");
        b_Modificar.setActionCommand("modificar");
        add(b_Modificar);
        b_Eliminar = new JButton("Eliminar");
        b_Eliminar.setActionCommand("modificar");
        add(b_Eliminar);
        //6
        b_Consultar = new JButton("Consultar");
        b_Consultar.setActionCommand("consultar");
        add(b_Consultar);
        e_Vacio =  new JLabel("");
        add(e_Vacio);
        b_Listar = new JButton("Listar");
        b_Listar.setActionCommand("listar");
        add(b_Listar);
    }

    public JLabel getE_Bienvenido() {
        return e_Bienvenido;
    }

    public void setE_Bienvenido(JLabel e_Bienvenido) {
        this.e_Bienvenido = e_Bienvenido;
    }

    public JLabel getE_AccionUsar() {
        return e_AccionUsar;
    }

    public void setE_AccionUsar(JLabel e_AccionUsar) {
        this.e_AccionUsar = e_AccionUsar;
    }

    public JLabel getE_Vacio() {
        return e_Vacio;
    }

    public void setE_Vacio(JLabel e_Vacio) {
        this.e_Vacio = e_Vacio;
    }

    public JButton getB_Crear() {
        return b_Crear;
    }

    public void setB_Crear(JButton b_Crear) {
        this.b_Crear = b_Crear;
    }

    public JButton getB_Consultar() {
        return b_Consultar;
    }

    public void setB_Consultar(JButton b_Consultar) {
        this.b_Consultar = b_Consultar;
    }

    public JButton getB_Modificar() {
        return b_Modificar;
    }

    public void setB_Modificar(JButton b_Modificar) {
        this.b_Modificar = b_Modificar;
    }

    public JButton getB_Eliminar() {
        return b_Eliminar;
    }

    public void setB_Eliminar(JButton b_Eliminar) {
        this.b_Eliminar = b_Eliminar;
    }

    public JButton getB_Listar() {
        return b_Listar;
    }

    public void setB_Listar(JButton b_Listar) {
        this.b_Listar = b_Listar;
    }

    
}
