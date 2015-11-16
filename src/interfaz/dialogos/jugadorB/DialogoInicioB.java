
package interfaz.dialogos.jugadorB;

import interfaz.InterfazFocus;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class DialogoInicioB extends JFrame{
    
    private InterfazFocus interfazFocus;
    
    private PanelSuperior panelSuperior;
    
    private PanelInferior panelInferior;
    

    public DialogoInicioB(InterfazFocus win) {
        
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
    
    public String darNombreJugador2(){
        return panelInferior.darNombreJugador2();
    }
    
    public void mostrarVentanaJuego(){
        dispose();
        interfazFocus.visible();
    }
    
    public void salir(){
        interfazFocus.salir();
    }
    
    
    
    
}
