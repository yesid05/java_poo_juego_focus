

package interfaz.util;

import java.awt.Color;
import java.awt.Font;

public class EstiloBoton {
    
    private static int COLOR_SUCCES_R = 102;
    
    private static int COLOR_SUCCES_G = 255;
    
    private static int COLOR_SUCCES_B = 102;
    
    private static int COLOR_DANGER_R = 255;
    
    private static int COLOR_DANGER_G = 102;
    
    private static int COLOR_DANGER_B = 102;
    
    private static String FUENTE_NOMBRE = "Arial";
    
    private static int FUENTE_ESTILO = Font.BOLD;
    
    private static int FUENTE_TAMANO = 13;

    public EstiloBoton() {
    }

    public static int getCOLOR_SUCCES_R() {
        return COLOR_SUCCES_R;
    }

    public static void setCOLOR_SUCCES_R(int COLOR_SUCCES_R) {
        EstiloBoton.COLOR_SUCCES_R = COLOR_SUCCES_R;
    }

    public static int getCOLOR_SUCCES_G() {
        return COLOR_SUCCES_G;
    }

    public static void setCOLOR_SUCCES_G(int COLOR_SUCCES_G) {
        EstiloBoton.COLOR_SUCCES_G = COLOR_SUCCES_G;
    }

    public static int getCOLOR_SUCCES_B() {
        return COLOR_SUCCES_B;
    }

    public static void setCOLOR_SUCCES_B(int COLOR_SUCCES_B) {
        EstiloBoton.COLOR_SUCCES_B = COLOR_SUCCES_B;
    }

    public static int getCOLOR_DANGER_R() {
        return COLOR_DANGER_R;
    }

    public static void setCOLOR_DANGER_R(int COLOR_DANGER_R) {
        EstiloBoton.COLOR_DANGER_R = COLOR_DANGER_R;
    }

    public static int getCOLOR_DANGER_G() {
        return COLOR_DANGER_G;
    }

    public static void setCOLOR_DANGER_G(int COLOR_DANGER_G) {
        EstiloBoton.COLOR_DANGER_G = COLOR_DANGER_G;
    }

    public static int getCOLOR_DANGER_B() {
        return COLOR_DANGER_B;
    }

    public static void setCOLOR_DANGER_B(int COLOR_DANGER_B) {
        EstiloBoton.COLOR_DANGER_B = COLOR_DANGER_B;
    }

    public static String getFUENTE_NOMBRE() {
        return FUENTE_NOMBRE;
    }

    public static void setFUENTE_NOMBRE(String FUENTE_NOMBRE) {
        EstiloBoton.FUENTE_NOMBRE = FUENTE_NOMBRE;
    }

    public static int getFUENTE_ESTILO() {
        return FUENTE_ESTILO;
    }

    public static void setFUENTE_ESTILO(int FUENTE_ESTILO) {
        EstiloBoton.FUENTE_ESTILO = FUENTE_ESTILO;
    }

    public static int getFUENTE_TAMANO() {
        return FUENTE_TAMANO;
    }

    public static void setFUENTE_TAMANO(int FUENTE_TAMANO) {
        EstiloBoton.FUENTE_TAMANO = FUENTE_TAMANO;
    }
    
    public static Color darColorSucces(){
        return new Color(COLOR_SUCCES_R, COLOR_SUCCES_G, COLOR_SUCCES_B);
    }
    
    public static Color darColorDanger(){
        return new Color(COLOR_DANGER_R, COLOR_DANGER_G, COLOR_DANGER_B);
    }
    
    public static Font darFuenteEstilo(){
        return new Font(FUENTE_NOMBRE, FUENTE_ESTILO, FUENTE_TAMANO);
    }
    
}
