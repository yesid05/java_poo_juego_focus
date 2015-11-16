
package interfaz.util;

import java.awt.Color;
import java.awt.Font;

public class EstiloTitulo {
    
    private static int COLOR_TITLE_R = 173;
    
    private static int COLOR_TITLE_G = 116;
    
    private static int COLOR_TITLE_B = 57;
    
    private static String FUENTE_NOMBRE = "Comic Sans MS";
    
    private static int FUENTE_TAMANO = 20;
    
    private static int FUENTE_ESTILO = Font.BOLD;

    public EstiloTitulo() {
    }

    public static int getCOLOR_TITLE_R() {
        return COLOR_TITLE_R;
    }

    public static void setCOLOR_TITLE_R(int COLOR_TITLE_R) {
        EstiloTitulo.COLOR_TITLE_R = COLOR_TITLE_R;
    }

    public static int getCOLOR_TITLE_G() {
        return COLOR_TITLE_G;
    }

    public static void setCOLOR_TITLE_G(int COLOR_TITLE_G) {
        EstiloTitulo.COLOR_TITLE_G = COLOR_TITLE_G;
    }

    public static int getCOLOR_TITLE_B() {
        return COLOR_TITLE_B;
    }

    public static void setCOLOR_TITLE_B(int COLOR_TITLE_B) {
        EstiloTitulo.COLOR_TITLE_B = COLOR_TITLE_B;
    }

    public static String getFUENTE_NOMBRE() {
        return FUENTE_NOMBRE;
    }

    public static void setFUENTE_NOMBRE(String FUENTE_NOMBRE) {
        EstiloTitulo.FUENTE_NOMBRE = FUENTE_NOMBRE;
    }

    public static int getFUENTE_TAMANO() {
        return FUENTE_TAMANO;
    }

    public static void setFUENTE_TAMANO(int FUENTE_TAMANO) {
        EstiloTitulo.FUENTE_TAMANO = FUENTE_TAMANO;
    }

    public static int getFUENTE_ESTILO() {
        return FUENTE_ESTILO;
    }

    public static void setFUENTE_ESTILO(int FUENTE_ESTILO) {
        EstiloTitulo.FUENTE_ESTILO = FUENTE_ESTILO;
    }
    
    public static Color darColorTitle(){
        return new Color(COLOR_TITLE_R, COLOR_TITLE_G, COLOR_TITLE_B);
    }
    
    public static Font darFuenteEstilo(){
        return new Font(FUENTE_NOMBRE, FUENTE_ESTILO, FUENTE_TAMANO);
    }
    
}
