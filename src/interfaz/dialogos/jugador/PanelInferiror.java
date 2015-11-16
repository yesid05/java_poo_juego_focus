

package interfaz.dialogos.jugador;

import interfaz.util.EstiloBoton;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelInferiror extends JPanel implements ActionListener{
    
    private DialogoJugador dialogoJugador;
    
    private JLabel lblJugador;
    
    private JComboBox jcbJugador;
    
    private JButton btnAceptar;
    
    private JButton btnSalir;

    public PanelInferiror(DialogoJugador win) {
        
        dialogoJugador = win;
        
        setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        lblJugador = new JLabel("Jugador rival:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.NONE;
        add(lblJugador,gbc);
        
        String [] jugadores = {"PC","Jugador 2"};
        jcbJugador = new JComboBox(jugadores);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 5, 5, 0);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = 2;
        add(jcbJugador,gbc);
        
        btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(this);
        btnAceptar.setBackground(EstiloBoton.darColorSucces());
        btnAceptar.setFont(EstiloBoton.darFuenteEstilo());
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.insets = new Insets(0, 5, 5, 0);
        add(btnAceptar,gbc);
        
        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(this);
        btnSalir.setBackground(EstiloBoton.darColorDanger());
        btnSalir.setFont(EstiloBoton.darFuenteEstilo());
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.insets = new Insets(0, 5, 5, 0);
        add(btnSalir,gbc);
        
    }
    
    public int darJugadorSeleccionado(){
        return jcbJugador.getSelectedIndex();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnAceptar){
            dialogoJugador.mostrarVentanaJugadorB();
        }
        if(e.getSource() == btnSalir){
            dialogoJugador.salir();
        }
    }
    
    
    
}
