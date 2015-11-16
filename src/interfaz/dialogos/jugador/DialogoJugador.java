
package interfaz.dialogos.jugador;

import interfaz.InterfazFocus;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;


public class DialogoJugador extends JFrame {

    private InterfazFocus interfazFocus;

    private PanelSuperior panelSuperior;

    private PanelInferiror panelInferiror;

    public DialogoJugador(InterfazFocus win) {

        interfazFocus = win;

        setTitle("Juego-focus");
        setLayout(new BorderLayout(5, 5));
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panelSuperior = new PanelSuperior();
        panelInferiror = new PanelInferiror(this);

        add(panelSuperior, BorderLayout.NORTH);
        add(panelInferiror, BorderLayout.SOUTH);
    }

    public void mostrarVentanaJugadorB() {
        dispose();
        switch (panelInferiror.darJugadorSeleccionado()) {
            case 0:
                interfazFocus.visiblePC();
                break;
            case 1:
                interfazFocus.mostrarVentanaJugadorB();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Existe un error", "Juego-focu", JOptionPane.ERROR_MESSAGE);
                interfazFocus.mostrarVentanaJugadorA();
                break;
        }
    }

    public void salir() {
        interfazFocus.salir();
    }

}
