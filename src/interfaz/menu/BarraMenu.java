
package interfaz.menu;

import interfaz.InterfazFocus;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class BarraMenu extends JMenuBar implements ActionListener {

    private InterfazFocus interfazFocus;

    private JMenu menuArchivo;

    private JMenu menuAyuda;

    private JMenuItem itemNuevoJuego;

    private JMenuItem itemSalir;

    private JMenuItem itemAyuda;

    private JMenuItem itemAcerca;

    public BarraMenu(InterfazFocus win) {

        interfazFocus = win;

        menuArchivo = new JMenu("Archivo");
        menuArchivo.setMnemonic('A');

        menuAyuda = new JMenu("Ayuda");
        menuAyuda.setMnemonic('y');

        itemNuevoJuego = new JMenuItem("Nuevo juego");
        itemNuevoJuego.addActionListener(this);
        itemNuevoJuego.setMnemonic('N');
        itemNuevoJuego.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
        menuArchivo.add(itemNuevoJuego);
        menuArchivo.addSeparator();

        itemSalir = new JMenuItem("Salir");
        itemSalir.addActionListener(this);
        itemSalir.setMnemonic('S');
        itemSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
        menuArchivo.add(itemSalir);

        itemAyuda = new JMenuItem("Ayuda");
        itemAyuda.addActionListener(this);
        itemAyuda.setMnemonic('A');
        itemAyuda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
        menuAyuda.add(itemAyuda);

        itemAcerca = new JMenuItem("Acerca del juego");
        itemAcerca.addActionListener(this);
        itemAcerca.setMnemonic('A');
        itemAcerca.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0));
        menuAyuda.add(itemAcerca);

        add(menuArchivo);
        add(menuAyuda);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == itemNuevoJuego) {
            String[] opciones = {"Si", "No"};
            int valor = JOptionPane.showOptionDialog(interfazFocus, "Seguro que desea reiniciar el juego?", "Juego-Focus", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opciones, opciones[1]);
            if (valor == 0) {
                interfazFocus.nuevoJuego();
            }
        }
        if(e.getSource()==itemSalir){
            interfazFocus.salir();
        }
        if(e.getSource()==itemAyuda){
            System.out.println("Estoy aqui");
            interfazFocus.ayuda();
        }
    }

}
