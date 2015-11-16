package modelo.juego;

import java.util.Random;
import modelo.carta.Carta;
import modelo.carta.FiguraAvionA;
import modelo.carta.FiguraAvionB;
import modelo.carta.FiguraAvionC;
import modelo.carta.FiguraCarroA;
import modelo.carta.FiguraCarroB;
import modelo.carta.FiguraCarroC;
import modelo.carta.FiguraMotoA;
import modelo.carta.FiguraMotoB;
import modelo.carta.FiguraMotoC;
import modelo.decorador.ICarta;
import modelo.jugador.JugadorA;
import modelo.jugador.JugadorB;
import modelo.jugador.JugadorPC;
import modelo.observador.Focus;

public class Juego {
    /*====================================*
     *   Atributos de la clase Juego
     *=====================================*/

    //Esta variable se instancia por unica vesz y se devuelve al cliente 
    private static Juego instance;

    //Variable que representa a un jugador
    private JugadorA jugadorA;

    //Variable que representa al jugador enemigo del jugadorA
    private JugadorB jugadorB;

    //Variable que representa al jugador maquina si el jugadorA quiere jugar contra la maquina
    private JugadorPC jugadorPC;

    //Variable que represneta la clase focus
    private Focus focus;

    //Se privatiza el contructor para que no se pueda hacer mas objetos
    //desce otro lugar que no sea la clase
    private Juego() {
        focus = new Focus();
    }
    /*====================================*
     *   Metodos de la clase Juego
     *=====================================*/

    public static Juego getInstance() {
        if (instance == null) {
            instance = new Juego();
        }
        return instance;
    }
    
    /**
     * Metodo que inici de nuevo el juego si existe un ganador o <br />
     * si asi lo desea los jugadores. <br />     
     * ja representa al jugadorA del juego <br />
     * jb representa al jugadorB del juego <br />
     * retorna verdadero si se puede hacer un nuevo juego
     * @param ja 
     * @param jb
     * @return nuevoJuego
     */
    public boolean nuevoJuegoAB(JugadorA ja, JugadorB jb){
        boolean nuevoJuego = false;
        //Verifica que el jugadorA y el jugadorB existan
        if (jugadorA!=null&&jugadorB!=null) {
            jugadorA = ja;
            jugadorB = jb;
            jugadorA.nuevosPuntos(0);
            jugadorB.nuevosPuntos(0);
            focus.dettach();
            nuevoJuego = true;
        }
        return nuevoJuego;
    }
    
    //Crea un jugador inicial
    public void crearJugadorA(String unNombre) {
        jugadorA = new JugadorA(unNombre, 0);
    }

    //Crea un jugador enemigo
    public void crearJugadorB(String unNombre) {
        jugadorB = new JugadorB(unNombre, 0);
    }

    //Crea un jugador maquina enemigo
    public void crearJugadorPC() {
        jugadorPC = new JugadorPC("PC", 0);
    }

    //Retorna el jugadorA
    public JugadorA darJugadorA() {
        return jugadorA;
    }

    //Retorna el jugadorB
    public JugadorB darJugadorB() {
        return jugadorB;
    }

    //Retorna el jugador maquina
    public JugadorPC darJugadorPC() {
        return jugadorPC;
    }

    /**
     * Metodo que verifica si el jugadorA es el ganador<br />
     * retorna verdadero si gano
     *
     * @return ganador
     */
    public boolean esGanadorJugadorA() {
        boolean ganador = false;
        if (darPuntosJugadorA() != -1 && darPuntosJugadorA() >= 12) {
            ganador = true;
        }
        return ganador;
    }
    
    /**
     * Metodo que verifica si e jugadorB es el ganador<br />
     * retorna verdadero si gano
     * @return ganador
     */
    public boolean esGanadorJugadorB() {
        boolean ganador = false;
        if (darPuntosJugadorB()!= -1 && darPuntosJugadorB()>= 12) {
            ganador = true;
        }
        return ganador;
    }
    
    /**
     * Metodo que verifica si el jugadorPC es el ganador<br =>
     * retiorna verdadero si gano
     * @return ganador
     */
    public boolean esGanadorJugadorPC(){
        boolean ganador = false;
        if(darPuntosJugadorPC()!=-1&&darPuntosJugadorPC()>=12){
            ganador = true;
        }
        return ganador;
    }
    
    /**
     * Metodo que suma puntos al jugadorA <br />
     * recibe como parametro un numero entero<br />
     * retorna verdadero si los puntos se sumaron<br />
     *
     * @param numPuntos
     * @return sumo
     */
    public boolean sumarPuntosJugadorA(int numPuntos) {
        boolean sumo = false;
        if (jugadorA != null) {
            jugadorA.sumarPuntos(numPuntos);
            sumo = true;
        }
        return sumo;
    }

    //Suma puntos al jugadorB
    public boolean sumarPuntosJugadorB(int numPuntos) {
        boolean sumo = false;
        if (jugadorB != null) {
            jugadorB.sumarPuntos(numPuntos);
            sumo = true;
        }
        return sumo;
    }

    //Suma puntos al jugadorPC
    public boolean sumarPuntosJugadorPC(int numPuntos) {
        boolean sumo = false;
        if (jugadorPC != null) {
            jugadorPC.sumarPuntos(numPuntos);
            sumo = true;
        }
        return sumo;
    }

    //Retorna los puntos del jugadorA
    //si es -1 el jugador no existe
    public int darPuntosJugadorA() {
        if (jugadorA != null) {
            return jugadorA.darPuntos();
        }
        return -1;
    }

    //Retorna los puntos del jugadorB
    //si es -1 el jugador no existe
    public int darPuntosJugadorB() {
        if (jugadorB != null) {
            return jugadorB.darPuntos();
        }
        return -1;
    }

    //Retorna los puntos del jugadorPC
    //si es -1 el jugador no existe
    public int darPuntosJugadorPC() {
        if (jugadorPC != null) {
            return jugadorPC.darPuntos();
        }
        return -1;
    }

    //Realiza un lanzamiento de una carta 
    public void jugar() {
        Random random = new Random();
        int evaluar = 0;
        ICarta objeto = null;
        int contador = 0;
        while (contador < 3) {
            evaluar = random.nextInt(3) + 1;
            System.out.println("Numero de i:" + evaluar);
            switch (evaluar) {
                case 1:
                    objeto = new Carta();
                    random = new Random();
                    int caso1 = random.nextInt(3) + 1;
                    System.out.println("Numero avion: " + caso1);
                    switch (caso1) {
                        case 1:
                            focus.attach(new FiguraAvionA(objeto));
                            break;
                        case 2:
                            focus.attach(new FiguraAvionB(objeto));
                            break;
                        case 3:
                            focus.attach(new FiguraAvionC(objeto));
                    }
                    break;
                case 2:
                    objeto = new Carta();
                    random = new Random();
                    int j = random.nextInt(3) + 1;
                    System.out.println("Numero moto: " + j);
                    switch (j) {
                        case 1:
                            focus.attach(new FiguraMotoA(objeto));
                            break;
                        case 2:
                            focus.attach(new FiguraMotoB(objeto));

                            break;
                        case 3:
                            focus.attach(new FiguraMotoC(objeto));
                            break;
                    }
                    break;
                case 3:
                    objeto = new Carta();
                    random = new Random();
                    int caso3 = random.nextInt(3) + 1;
                    System.out.println("Numero carro: " + caso3);
                    switch (caso3) {
                        case 1:
                            focus.attach(new FiguraCarroA(objeto));
                            break;
                        case 2:
                            focus.attach(new FiguraCarroB(objeto));
                            break;
                        case 3:
                            focus.attach(new FiguraCarroC(objeto));
                    }
                    break;
                default:
                    objeto = null;
                    break;
            }
            contador++;
        }
    }

    //Determina si existe foco par igual cantidad de objetos
    public boolean esFocusObjeto() {
        return focus.esFocusObjetos();
    }

    //Determina si existe foco por cartas iguales
    public boolean esFocusCarta() {
        return focus.esFocusCarta();
    }

    //Eliminar los elementos
    public void eliminar() {
        focus.dettach();
    }

    //Retorna la imagen de la primaera carta
    public String urlImagen1() {
        return focus.notifyObservers().get(0).imagen();
    }

    //Retorna la imagen de la segunda carta  
    public String urlImagen2() {
        return focus.notifyObservers().get(1).imagen();
    }

    //Retorna la imagen de la tercera carta
    public String urlImagen3() {
        return focus.notifyObservers().get(2).imagen();
    }

}
