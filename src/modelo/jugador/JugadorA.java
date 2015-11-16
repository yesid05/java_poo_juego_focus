
package modelo.jugador;

public class JugadorA extends Jugador{

    public JugadorA(String unNombre, int unPuntaje) {
        super(unNombre, unPuntaje);
    }
    
    public void nuevosPuntos(int unPunto){
        super.setPuntaje(unPunto);
    }
    
    public void sumarPuntos(int numPuntos){
        super.sumarPunto(numPuntos);
    }
    
    public int darPuntos(){
        return super.getPuntaje();
    }
    
    
    
    
}
