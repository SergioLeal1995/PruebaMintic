package vista;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class PanelConsultar extends JPanel{
    private JLabel e_consultarProducto;
    private JTextField t_nombre_PC;
    private JTextField t_codigo_PC;
    private JButton b_Volver_PC;
    private JButton b_Consultar_PC;
    private JTable tablaDatos_PC;
    
    public PanelConsultar() {
        setLayout(null);
        setBackground(new Color(10,148,100));
        
        inicializarComponentes();
        setVisible(true);
    }
    
    public void inicializarComponentes(){
        e_consultarProducto =  new JLabel("Consultar Productos", SwingConstants.CENTER);
        e_consultarProducto.setBounds(230,10,150,30);
        add(e_consultarProducto);
        //2
        e_consultarProducto = new JLabel("Nombre:",SwingConstants.CENTER);
        e_consultarProducto.setBounds(20, 80, 150, 30);
        add(e_consultarProducto);
        
        e_consultarProducto = new JLabel("Codigo:",SwingConstants.CENTER);
        e_consultarProducto.setBounds(490, 80, 150, 30);
        add(e_consultarProducto);
        
        //Jtexts 3
        t_nombre_PC = new JTextField();
        t_nombre_PC.setBounds(20, 110, 150, 30);
        add(t_nombre_PC);
        
        t_codigo_PC = new JTextField();
        t_codigo_PC.setBounds(490, 110, 150, 30);
        add(t_codigo_PC);
        //4
        tablaDatos_PC = new JTable();      
        DefaultTableModel mod=  new DefaultTableModel();

        mod.addColumn("Codigo del Producto");
        mod.addColumn("Nombre del Producto");
        mod.addColumn("Valor de Compra");
        mod.addColumn("Valor de Venta");
        mod.addColumn("Cantidad");
        mod.addColumn("Categoria");

        tablaDatos_PC.setModel(mod);

        String [] resultados = new String[6]; //String con datos
                resultados[0]= "123";
                resultados[1]= "audio";
                resultados[2]= "123";
                resultados[3]= "233";
                resultados[4]= "1323";
                resultados[5]= "es";
                mod.addRow(resultados);
        JScrollPane scroll= new JScrollPane(tablaDatos_PC);
        scroll.setBounds(20,170,620,150);
        add(scroll);

        scroll.setVisible(true); 
        
        //3
        b_Consultar_PC = new JButton("Consultar");
        b_Consultar_PC.setActionCommand("consultar_PC");//label para accion
        b_Consultar_PC.setBounds(20, 350, 150, 30);
        add(b_Consultar_PC);
        
        b_Volver_PC = new JButton("Volver");
        b_Volver_PC.setActionCommand("volver_PC");//label para accion
        b_Volver_PC.setBounds(490, 350, 150, 30);
        add(b_Volver_PC);
    }

    public JLabel getE_consultarProducto() {
        return e_consultarProducto;
    }

    public void setE_consultarProducto(JLabel e_consultarProducto) {
        this.e_consultarProducto = e_consultarProducto;
    }

    public JTextField getT_nombre_PC() {
        return t_nombre_PC;
    }

    public void setT_nombre_PC(JTextField t_nombre_PC) {
        this.t_nombre_PC = t_nombre_PC;
    }

    public JTextField getT_codigo_PC() {
        return t_codigo_PC;
    }

    public void setT_codigo_PC(JTextField t_codigo_PC) {
        this.t_codigo_PC = t_codigo_PC;
    }

    public JButton getB_Volver_PC() {
        return b_Volver_PC;
    }

    public void setB_Volver_PC(JButton b_Volver_PC) {
        this.b_Volver_PC = b_Volver_PC;
    }

    public JButton getB_Consultar_PC() {
        return b_Consultar_PC;
    }

    public void setB_Consultar_PC(JButton b_Consultar_PC) {
        this.b_Consultar_PC = b_Consultar_PC;
    }

    public JTable getTablaDatos_PC() {
        return tablaDatos_PC;
    }

    public void setTablaDatos_PC(JTable tablaDatos_PC) {
        this.tablaDatos_PC = tablaDatos_PC;
    }
    
    
}
