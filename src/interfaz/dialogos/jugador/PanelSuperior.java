

package interfaz.dialogos.jugador;

import interfaz.util.EstiloTitulo;
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
        
        lblTitulo = new JLabel("Jugadores rivales");
        lblTitulo.setFont(EstiloTitulo.darFuenteEstilo());
        lblTitulo.setForeground(EstiloTitulo.darColorTitle());
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 0, 15, 0);
        add(lblTitulo,gbc);
    }
    
    
    
}
