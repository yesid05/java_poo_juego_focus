
package interfaz.jugadorA;

import interfaz.util.EstiloCarta;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelCentral extends JPanel {

    private JLabel lblNombre;

    private JLabel lblNombreJugador;

    private JLabel lblPuntaje;

    private JLabel lblPuntajeJugador;

    private JPanel panelCarta1;

    private JPanel panelCarta2;

    private JPanel panelCarta3;

    public PanelCentral() {
        setLayout(new BorderLayout(5, 5));
        JPanel panelAuxSuperior = new JPanel(new GridBagLayout());
        JPanel panelAuxInferior = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        lblNombre = new JLabel("Nombre del jugador:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 0, 5);
        panelAuxSuperior.add(lblNombre, gbc);

        lblNombreJugador = new JLabel("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        panelAuxSuperior.add(lblNombreJugador, gbc);

        lblPuntaje = new JLabel("Puntos:");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 20, 0, 5);
        panelAuxSuperior.add(lblPuntaje, gbc);

        lblPuntajeJugador = new JLabel("");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        panelAuxSuperior.add(lblPuntajeJugador, gbc);

        Dimension dimension = new Dimension(200, 200);
        Color color = new Color(255, 255, 255);

        panelCarta1 = new JPanel(new BorderLayout());
        panelCarta1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(EstiloCarta.darColorLine(), 1, true), "Carta 1", TitledBorder.CENTER, TitledBorder.TOP, EstiloCarta.darFuenteEstilo(), EstiloCarta.darColorTitle()));
        panelCarta1.setPreferredSize(dimension);
        panelCarta1.setBackground(color);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 0, 0, 5);
        gbc.fill = GridBagConstraints.BOTH;
        panelAuxInferior.add(panelCarta1, gbc);

        panelCarta2 = new JPanel(new BorderLayout());
        panelCarta2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(EstiloCarta.darColorLine(), 1, true), "Carta 2", TitledBorder.CENTER, TitledBorder.TOP, EstiloCarta.darFuenteEstilo(), EstiloCarta.darColorTitle()));
        panelCarta2.setPreferredSize(dimension);
        panelCarta2.setBackground(color);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 0, 0, 5);
        gbc.fill = GridBagConstraints.BOTH;
        panelAuxInferior.add(panelCarta2, gbc);

        panelCarta3 = new JPanel(new BorderLayout());
        panelCarta3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(EstiloCarta.darColorLine(), 1, true), "Carta 3", TitledBorder.CENTER, TitledBorder.TOP, EstiloCarta.darFuenteEstilo(), EstiloCarta.darColorTitle()));
        panelCarta3.setPreferredSize(dimension);
        panelCarta3.setBackground(color);
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 0, 0, 0);
        gbc.fill = GridBagConstraints.BOTH;
        panelAuxInferior.add(panelCarta3, gbc);

        add(panelAuxSuperior, BorderLayout.NORTH);
        add(panelAuxInferior, BorderLayout.SOUTH);

    }

    public void escribirNombreJugador(String unNombre) {
        lblNombreJugador.setText(unNombre);
    }

    public void escribirPuntaje(String unPuntaje) {
        lblPuntajeJugador.setText(unPuntaje);
    }

    public void dibujarCarta1(String url) {
        if (url.equalsIgnoreCase("")) {
            Graphics gp = panelCarta1.getGraphics();
            ImageIcon imagen = new ImageIcon(getToolkit().getClass().getResource("/img/default.png"));
            gp.drawImage(imagen.getImage(), (panelCarta1.getWidth() / 2) - (imagen.getIconWidth() / 2), (panelCarta1.getHeight() / 2) - (imagen.getIconHeight() / 2), null);
            panelCarta1.paintComponents(gp);
        } else {
            Graphics gp = panelCarta1.getGraphics();
            ImageIcon imagen = new ImageIcon(getToolkit().getClass().getResource(url));
            gp.drawImage(imagen.getImage(), (panelCarta1.getWidth() / 2) - (imagen.getIconWidth() / 2), (panelCarta1.getHeight() / 2) - (imagen.getIconHeight() / 2), null);
            panelCarta1.paintComponents(gp);
        }
    }

    public void dibujarCarta2(String url) {
        if (url.equalsIgnoreCase("")) {
            Graphics gp = panelCarta2.getGraphics();
            ImageIcon imagen = new ImageIcon(getToolkit().getClass().getResource("/img/default.png"));
            gp.drawImage(imagen.getImage(), (panelCarta2.getWidth() / 2) - (imagen.getIconWidth() / 2), (panelCarta2.getHeight() / 2) - (imagen.getIconHeight() / 2), null);
            panelCarta2.paintComponents(gp);
        } else {
            Graphics gp = panelCarta2.getGraphics();
            ImageIcon imagen = new ImageIcon(getToolkit().getClass().getResource(url));
            gp.drawImage(imagen.getImage(), (panelCarta2.getWidth() / 2) - (imagen.getIconWidth() / 2), (panelCarta2.getHeight() / 2) - (imagen.getIconHeight() / 2), null);
            panelCarta2.paintComponents(gp);
        }
    }

    public void dibujarCarta3(String url) {
        if (url.equalsIgnoreCase("")) {
            Graphics gp = panelCarta3.getGraphics();
            ImageIcon imagen = new ImageIcon(getToolkit().getClass().getResource("/img/default.png"));
            gp.drawImage(imagen.getImage(), (panelCarta3.getWidth() / 2) - (imagen.getIconWidth() / 2), (panelCarta3.getHeight() / 2) - (imagen.getIconHeight() / 2), null);
            panelCarta3.paintComponents(gp);
        } else {
            Graphics gp = panelCarta3.getGraphics();
            ImageIcon imagen = new ImageIcon(getToolkit().getClass().getResource(url));
            gp.drawImage(imagen.getImage(), (panelCarta3.getWidth() / 2) - (imagen.getIconWidth() / 2), (panelCarta3.getHeight() / 2) - (imagen.getIconHeight() / 2), null);
            panelCarta3.paintComponents(gp);
        }
    }

}
