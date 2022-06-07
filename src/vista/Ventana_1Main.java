package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.accessibility.AccessibleContext;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JRootPane;

public class Ventana_1Main extends JFrame {
    private PanelBienvenido PanelBien; // pinicio
    private JLayeredPane lpane; // contenedor
    
    public Ventana_1Main(){
        setTitle("Ferreteria Dinamita");
        setPreferredSize(new Dimension(720, 320));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());

        inicializarComponentes();
        pack();
        setVisible(true);
    }
    
    public void inicializarComponentes(){
        lpane = new JLayeredPane();
        getContentPane().add(lpane, BorderLayout.CENTER);
        lpane.setBounds(0, 0, 720, 320);
        
        PanelBien =  new PanelBienvenido();
        PanelBien.setBounds(20, 20, 200, 160);
        PanelBien.setOpaque(true);
        
        lpane.add(PanelBien, new Integer(0), 0);
    }

    public PanelBienvenido getPanel() {
        return PanelBien;
    }

    public PanelBienvenido getPanelBien() {
        return PanelBien;
    }

    public void setPanelBien(PanelBienvenido PanelBien) {
        this.PanelBien = PanelBien;
    }
    
    public void setPanel(PanelBienvenido panel) {
        this.PanelBien = panel;
    }
   

    public JLayeredPane getLpane() {
        return lpane;
    }

    public void setLpane(JLayeredPane lpane) {
        this.lpane = lpane;
    }

    public JRootPane getRootPane() {
        return rootPane;
    }

    public void setRootPane(JRootPane rootPane) {
        this.rootPane = rootPane;
    }

    public boolean isRootPaneCheckingEnabled() {
        return rootPaneCheckingEnabled;
    }

    public void setRootPaneCheckingEnabled(boolean rootPaneCheckingEnabled) {
        this.rootPaneCheckingEnabled = rootPaneCheckingEnabled;
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }
    
}
