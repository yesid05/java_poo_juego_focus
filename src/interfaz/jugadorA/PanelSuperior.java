
package interfaz.jugadorA;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelSuperior extends JPanel{
    
    private JLabel lblTitulo;

    public PanelSuperior() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        lblTitulo = new JLabel("Jugador 1");
        lblTitulo.setFont(new Font("Comic Sans MS", 1, 20));
        lblTitulo.setForeground(new Color(173, 116, 57));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;
        add(lblTitulo,gbc);
    }
    
    
    
}
