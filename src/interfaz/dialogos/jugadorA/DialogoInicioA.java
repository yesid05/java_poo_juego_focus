
package interfaz.dialogos.jugadorA;

import interfaz.InterfazFocus;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class DialogoInicioA extends JFrame{
    
    private InterfazFocus interfazFocus;
    
    private PanelSuperior panelSuperior;
    
    private PanelInferior panelInferior;
    

    public DialogoInicioA(InterfazFocus win) {
        
        interfazFocus = win;
        
        setTitle("Juego-Focus");
        setLayout(new BorderLayout(5, 5));
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
        
        panelSuperior = new PanelSuperior();
        panelInferior = new PanelInferior(this);
                
        add(panelSuperior,BorderLayout.NORTH);
        add(panelInferior,BorderLayout.SOUTH);
    }
    
    public String darNombreJugador1(){
        return panelInferior.darNombreJugador1();
    }
    
    public void mostrarVentanaJugador(){
        dispose();
        interfazFocus.mostrarVentanaJugadorB();
    }
    
    public void salir(){
        interfazFocus.salir();
    }
    
    
}
