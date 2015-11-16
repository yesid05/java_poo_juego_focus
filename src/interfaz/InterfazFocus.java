
package interfaz;

import interfaz.dialogos.jugadorA.DialogoInicioA;
import interfaz.dialogos.jugador.DialogoJugador;
import interfaz.dialogos.jugadorB.DialogoInicioB;
import interfaz.jugadorA.PanelJugadorA;
import interfaz.jugadorB.PanelJugadorB;
import interfaz.menu.BarraMenu;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.EtchedBorder;
import modelo.juego.Juego;

/**
 *
 * @author Yesid
 */
public class InterfazFocus extends JFrame {

    private static Juego juego;

    private BarraMenu barraMenu;

    private static DialogoInicioA jugadorA;

    private static DialogoJugador escogerJugador;

    private static DialogoInicioB jugadorB;

    private PanelJugadorA panelJugadorA;

    private PanelJugadorB panelJugadorB;

    public InterfazFocus() throws HeadlessException {

        juego = Juego.getInstance();

        setTitle("Juego-Focus");
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        barraMenu = new BarraMenu(this);
        setJMenuBar(barraMenu);

        panelJugadorA = new PanelJugadorA(this);
        panelJugadorA.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

        panelJugadorB = new PanelJugadorB(this);
        panelJugadorB.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;
        add(panelJugadorA, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;
        add(panelJugadorB, gbc);
    }

    public void visiblePC() {
        juego.crearJugadorA(jugadorA.darNombreJugador1());
        juego.crearJugadorPC();

        panelJugadorA.escribirNombreJugador(juego.darJugadorA().getNombre());
        panelJugadorA.escribirPuntaje("" + juego.darPuntosJugadorA());
        panelJugadorB.escribirNombreJugador(juego.darJugadorPC().getNombre());
        panelJugadorB.escribirPuntaje("" + juego.darPuntosJugadorPC());
        setVisible(true);
//        System.out.println("Jugador 1:"+jugadorA.darNombreJugador1());
//        System.out.println("jUGANDO CONTRA PC");
    }

    public void visible() {
        juego.crearJugadorA(jugadorA.darNombreJugador1());
        juego.crearJugadorB(jugadorB.darNombreJugador2());

        panelJugadorA.escribirNombreJugador(juego.darJugadorA().getNombre());
        panelJugadorA.escribirPuntaje("" + juego.darPuntosJugadorA());

        panelJugadorB.escribirNombreJugador(juego.darJugadorB().getNombre());
        panelJugadorB.escribirPuntaje("" + juego.darPuntosJugadorB());
        setVisible(true);
    }

    public void mostrarVentanaJugadorA() {
        jugadorA.setVisible(true);
    }

    public void mostrarVentanaJugador() {
        escogerJugador.setVisible(true);
    }

    public void mostrarVentanaJugadorB() {
        jugadorB.setVisible(true);
    }

    public void salir() {
        String[] opciones = {"Si", "No"};
        int valor = JOptionPane.showOptionDialog(this, "Seguro que desea salir del juego?", "Juego-Focus", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opciones, opciones[1]);
        if (valor == 0) {
            System.exit(0);
        }
    }

    public void desabilitarBotonesJugadorA() {
        panelJugadorA.desabilitarBotones();
    }

    public void habilitarBotonesJugadorA() {
        panelJugadorA.habilitarBotones();
    }

    public void desabilitarBotonesJugadorB() {
        panelJugadorB.desabilitarBotones();
    }

    public void habilitarBotonesJugadorB() {
        panelJugadorB.habilitarBotones();
    }

    public void jugarA() {
        juego.jugar();
        panelJugadorA.dibujarCarta1(juego.urlImagen1());
        panelJugadorA.dibujarCarta2(juego.urlImagen2());
        panelJugadorA.dibujarCarta3(juego.urlImagen3());
        if (juego.esFocusObjeto()) {
            JOptionPane.showMessageDialog(this, "Focus por cantidad de objetos", "Juego-Focus", JOptionPane.INFORMATION_MESSAGE);
            juego.sumarPuntosJugadorA(2);
            panelJugadorA.escribirPuntaje("" + juego.darPuntosJugadorA());
        }
        if (juego.esFocusCarta()) {
            JOptionPane.showMessageDialog(this, "Focus por cartas iguales", "Juego-Focus", JOptionPane.INFORMATION_MESSAGE);
            juego.sumarPuntosJugadorA(2);
            panelJugadorA.escribirPuntaje("" + juego.darPuntosJugadorA());
        }
        juego.eliminar();
        desabilitarBotonesJugadorA();
        habilitarBotonesJugadorB();
        if (juego.esGanadorJugadorA()) {
            String[] opciones = {"Si", "No"};
            int valor = JOptionPane.showOptionDialog(this, "FELICIDADES GANASTE...!! " + juego.darJugadorA().getNombre() + "\n Volver a jugar", "Juego-Focus", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[1]);
            if (valor == 0) {
                nuevoJuego();
            } else {
                this.dispose();
                mostrarVentanaJugadorA();
            }
        }
    }

    public void jugarB() {

        juego.jugar();
        panelJugadorB.dibujarCarta1(juego.urlImagen1());
        panelJugadorB.dibujarCarta2(juego.urlImagen2());
        panelJugadorB.dibujarCarta3(juego.urlImagen3());
        if (juego.esFocusObjeto()) {
            JOptionPane.showMessageDialog(this, "Focus por cantidad de objetos", "Juego-Focus", JOptionPane.INFORMATION_MESSAGE);
            juego.sumarPuntosJugadorB(2);
            panelJugadorB.escribirPuntaje("" + juego.darPuntosJugadorB());
        }
        if (juego.esFocusCarta()) {
            JOptionPane.showMessageDialog(this, "Focus por cartas iguales", "Juego-Focus", JOptionPane.INFORMATION_MESSAGE);
            juego.sumarPuntosJugadorB(2);
            panelJugadorB.escribirPuntaje("" + juego.darPuntosJugadorB());
        }
        juego.eliminar();
        desabilitarBotonesJugadorB();
        habilitarBotonesJugadorA();
        if (juego.esGanadorJugadorB()) {
            String[] opciones = {"Si", "No"};
            int valor = JOptionPane.showOptionDialog(this, "FELICIDADES GANASTE...!! " + juego.darJugadorB().getNombre() + "\n Volver a jugar", "Juego-Focus", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[1]);
            if (valor == 0) {
                nuevoJuego();
            } else {
                this.dispose();
                mostrarVentanaJugadorA();
            }
        }
    }

    public void nuevoJuego() {
        juego.nuevoJuegoAB(juego.darJugadorA(), juego.darJugadorB());
        panelJugadorA.escribirPuntaje("" + juego.darPuntosJugadorA());
        panelJugadorB.escribirPuntaje("" + juego.darPuntosJugadorB());

        panelJugadorA.dibujarCarta1("");
        panelJugadorA.dibujarCarta2("");
        panelJugadorA.dibujarCarta3("");

        panelJugadorB.dibujarCarta1("");
        panelJugadorB.dibujarCarta2("");
        panelJugadorB.dibujarCarta3("");

        habilitarBotonesJugadorA();
        habilitarBotonesJugadorB();
    }

    public void ayuda() {
//        
    }

    public static void main(String args[]) {
        InterfazFocus m = new InterfazFocus();
//        m.setVisible(true);
        jugadorA = new DialogoInicioA(m);
        jugadorB = new DialogoInicioB(m);
        escogerJugador = new DialogoJugador(m);

        m.pack();
        m.setLocationRelativeTo(null);

        jugadorA.pack();
        jugadorA.setLocationRelativeTo(null);
        jugadorA.setVisible(true);

        jugadorB.pack();
        jugadorB.setLocationRelativeTo(null);

        escogerJugador.pack();
        escogerJugador.setLocationRelativeTo(null);

    }

}
