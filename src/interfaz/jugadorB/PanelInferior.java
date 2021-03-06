
package interfaz.jugadorB;

import interfaz.util.EstiloBoton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelInferior extends JPanel implements ActionListener{
    
    private PanelJugadorB panelJugadorB;
     
    private JButton btnJugar;
    
    private JButton btnSalir;

    public PanelInferior(PanelJugadorB win) {
        
        panelJugadorB = win;
        
        setLayout(new GridLayout(1, 2,5,5));
        
        btnJugar = new JButton("Jugar");
        btnJugar.addActionListener(this);
        btnJugar.setBackground(EstiloBoton.darColorSucces());
        btnJugar.setFont(EstiloBoton.darFuenteEstilo());
        
        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(this);
        btnSalir.setBackground(EstiloBoton.darColorDanger());
        btnSalir.setFont(EstiloBoton.darFuenteEstilo());
        
        add(btnJugar);
        add(btnSalir);
    }

    public void desabilitarBotones(){
        btnJugar.setEnabled(false);
        btnSalir.setEnabled(false);
    }
    
    public void habilitarBotones(){
        btnJugar.setEnabled(true);
        btnSalir.setEnabled(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnJugar){
            panelJugadorB.jugar();
        }
        if(e.getSource()== btnSalir){
            panelJugadorB.salir();
        }
    }
    
}
