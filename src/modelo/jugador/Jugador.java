package modelo.jugador;

public class Jugador {
    
    private String nombre;
    
    private int puntaje = 0;

    public Jugador() {
    }
    
    public Jugador(String unNombre, int unPuntaje){
        nombre = unNombre;
        puntaje = unPuntaje;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    public void sumarPunto(int numPunto){
        puntaje = puntaje+numPunto;
    }
    
    

}
