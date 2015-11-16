
package interfaz.util;

import java.awt.Color;
import java.awt.Font;

public class EstiloCarta {
    
    private static int COLOR_LINE_R = 77;
    
    private static int COLOR_LINE_G = 77;
    
    private static int COLOR_LINE_B = 255;
    
    private static int COLOR_TITLE_R = 77;
    
    private static int COLOR_TITLE_G = 77;
    
    private static int COLOR_TITLE_B = 255;
    
    private static String FUENTE_NOMBRE = "Comic Sans MS";
    
    private static int FUENTE_ESTILO = Font.BOLD;
    
    private static int FUENTE_TAMANO = 11;

    public EstiloCarta() {
    }

    public static int getCOLOR_LINE_R() {
        return COLOR_LINE_R;
    }

    public static void setCOLOR_LINE_R(int COLOR_LINE_R) {
        EstiloCarta.COLOR_LINE_R = COLOR_LINE_R;
    }

    public static int getCOLOR_LINE_G() {
        return COLOR_LINE_G;
    }

    public static void setCOLOR_LINE_G(int COLOR_LINE_G) {
        EstiloCarta.COLOR_LINE_G = COLOR_LINE_G;
    }

    public static int getCOLOR_LINE_B() {
        return COLOR_LINE_B;
    }

    public static void setCOLOR_LINE_B(int COLOR_LINE_B) {
        EstiloCarta.COLOR_LINE_B = COLOR_LINE_B;
    }

    public static int getCOLOR_TITLE_R() {
        return COLOR_TITLE_R;
    }

    public static void setCOLOR_TITLE_R(int COLOR_TITLE_R) {
        EstiloCarta.COLOR_TITLE_R = COLOR_TITLE_R;
    }

    public static int getCOLOR_TITLE_G() {
        return COLOR_TITLE_G;
    }

    public static void setCOLOR_TITLE_G(int COLOR_TITLE_G) {
        EstiloCarta.COLOR_TITLE_G = COLOR_TITLE_G;
    }

    public static int getCOLOR_TITLE_B() {
        return COLOR_TITLE_B;
    }

    public static void setCOLOR_TITLE_B(int COLOR_TITLE_B) {
        EstiloCarta.COLOR_TITLE_B = COLOR_TITLE_B;
    }

    public static String getFUENTE_NOMBRE() {
        return FUENTE_NOMBRE;
    }

    public static void setFUENTE_NOMBRE(String FUENTE_NOMBRE) {
        EstiloCarta.FUENTE_NOMBRE = FUENTE_NOMBRE;
    }

    public static int getFUENTE_ESTILO() {
        return FUENTE_ESTILO;
    }

    public static void setFUENTE_ESTILO(int FUENTE_ESTILO) {
        EstiloCarta.FUENTE_ESTILO = FUENTE_ESTILO;
    }

    public static int getFUENTE_TAMANO() {
        return FUENTE_TAMANO;
    }

    public static void setFUENTE_TAMANO(int FUENTE_TAMANO) {
        EstiloCarta.FUENTE_TAMANO = FUENTE_TAMANO;
    }
    
    public static Color darColorLine(){
        return new Color(COLOR_LINE_R, COLOR_LINE_G, COLOR_LINE_B);
    }
    
    public static Color darColorTitle(){
        return new Color(COLOR_TITLE_R, COLOR_TITLE_G, COLOR_TITLE_B);
    }
    
    public static Font darFuenteEstilo(){
        return new Font(FUENTE_NOMBRE, FUENTE_ESTILO, FUENTE_TAMANO);
    }
    
    
    
}
