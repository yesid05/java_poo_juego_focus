
package interfaz.jugadorA;

import interfaz.InterfazFocus;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JPanel;

public class PanelJugadorA extends JPanel{
    
    private InterfazFocus interfazFocus;
    
    private PanelSuperior panelSuperior;
    
    private PanelCentral panelCentral;
    
    private PanelInferior panelInferior;

    public PanelJugadorA(InterfazFocus win) {
        
        interfazFocus = win;
        
        setLayout(new GridBagLayout());        
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        panelSuperior = new PanelSuperior();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;
        add(panelSuperior,gbc);
        
        panelCentral = new PanelCentral();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 5, 0, 5);
        gbc.fill = GridBagConstraints.BOTH;
        add(panelCentral,gbc);
        
        panelInferior = new PanelInferior(this);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets(5,5,5,5);
        gbc.fill = GridBagConstraints.BOTH;
        add(panelInferior,gbc);
    }
    
    public void jugar(){
        interfazFocus.jugarA();
    }
    
    public void salir(){
        interfazFocus.salir();
    }
    
    public void desabilitarBotones(){
        panelInferior.desabilitarBotones();
    }
    
    public void habilitarBotones(){
        panelInferior.habilitarBotones();
    }
    
    public void escribirNombreJugador(String unNombre){
        panelCentral.escribirNombreJugador(unNombre);
    }
    
    public void escribirPuntaje(String unPuntaje){
        panelCentral.escribirPuntaje(unPuntaje);
    }
    
    public void dibujarCarta1(String url){
        panelCentral.dibujarCarta1(url);   
    }
    
    public void dibujarCarta2(String url){
        panelCentral.dibujarCarta2(url); 
    }
    
    public void dibujarCarta3(String url){
        panelCentral.dibujarCarta3(url);   
    }
    
}
