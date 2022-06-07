package vista;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class PanelListar extends JPanel {
    private JLabel e_ListarProducto;
    private JLabel e_Vacio;
    private JButton b_Volver_PListar;
    private JTable tablaDatos;
    
    public PanelListar() {
        setLayout(null);
        setBackground(new Color(10,148,100));
        
        inicializarComponentes();
        setVisible(true);
    }
    
    public void inicializarComponentes(){
        e_Vacio =  new JLabel("Listar Productos", SwingConstants.CENTER);
        e_Vacio.setBounds(150,10,150,30);
        add(e_Vacio);
        //2

        tablaDatos = new JTable();      
        DefaultTableModel mod=  new DefaultTableModel();

        mod.addColumn("Codigo del Producto");
        mod.addColumn("Nombre del Producto");
        mod.addColumn("Valor de Compra");
        mod.addColumn("Valor de Venta");
        mod.addColumn("Cantidad");
        mod.addColumn("Categoria");

        tablaDatos.setModel(mod);

        String [] resultados = new String[6]; //String con datos
        
                resultados[0]= "123";
                resultados[1]= "audio";
                resultados[2]= "123";
                resultados[3]= "233";
                resultados[4]= "1323";
                resultados[5]= "es";
                mod.addRow(resultados);
                
        JScrollPane scroll= new JScrollPane(tablaDatos);
        scroll.setBounds(10,100,500,150);
        add(scroll);

        scroll.setVisible(true);        
        
        //5
        
        b_Volver_PListar = new JButton("Volver");
        b_Volver_PListar.setActionCommand("volver_PanelListar");//label para accion
        b_Volver_PListar.setBounds(150, 300, 150, 30);
        add(b_Volver_PListar);
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

