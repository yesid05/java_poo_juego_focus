package modelo.observador;

import java.util.ArrayList;

public interface Subject {
    
    public void attach(ICartaObserver observador);
    
    public void dettach();
    
    public ArrayList<ICartaObserver> notifyObservers();
    
    public boolean esFocusObjetos();
    
    public boolean esFocusCarta();    
}
