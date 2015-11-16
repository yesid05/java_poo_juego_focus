
package interfaz.dialogos.jugadorA;

import interfaz.util.EstiloBoton;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelInferior extends JPanel implements ActionListener {

    private DialogoInicioA dialogoInicioA;

    private JLabel lblNombre;

    private JTextField txtNombe;

    private JButton btnIngresar;

    private JButton btnSalir;

    public PanelInferior(DialogoInicioA win) {

        dialogoInicioA = win;

        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        lblNombre = new JLabel("Nombre del jugador:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 5, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;
        add(lblNombre, gbc);

        txtNombe = new JTextField(15);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = 2;
        add(txtNombe, gbc);

        btnIngresar = new JButton("Ingresar");
        btnIngresar.setBackground(EstiloBoton.darColorSucces());
        btnIngresar.setFont(EstiloBoton.darFuenteEstilo());
        btnIngresar.addActionListener(this);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.insets = new Insets(0, 0, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;
        add(btnIngresar, gbc);

        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(this);
        btnSalir.setBackground(EstiloBoton.darColorDanger());
        btnSalir.setFont(EstiloBoton.darFuenteEstilo());
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.insets = new Insets(0, 5, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;
        add(btnSalir, gbc);
    }

    public String darNombreJugador1() {
        return txtNombe.getText();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnIngresar) {
            if (!(txtNombe.getText().isEmpty())) {
                dialogoInicioA.mostrarVentanaJugador();
            } else {
                JOptionPane.showMessageDialog(null, "Existe un error", "Juego-focus", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource() == btnSalir) {
            dialogoInicioA.salir();
        }
    }

}
