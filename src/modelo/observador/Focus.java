

package modelo.observador;

import java.util.ArrayList;

public class Focus implements Subject{
    
    public static ArrayList<ICartaObserver> observadores = new ArrayList<ICartaObserver>();

    @Override
    public void attach(ICartaObserver observador) {
        observadores.add(observador);
    }

    @Override
    public void dettach() {
        observadores.clear();
    }

    @Override
    public ArrayList<ICartaObserver> notifyObservers() {
        return observadores;
    }

    @Override
    public boolean esFocusObjetos() {
        boolean focus = false;
        if ((observadores.get(0).cantidadObjetos()==observadores.get(1).cantidadObjetos())&&
            (observadores.get(0).cantidadObjetos()==observadores.get(2).cantidadObjetos())&&
            (observadores.get(1).cantidadObjetos()==observadores.get(2).cantidadObjetos())) {
            focus = true;
        }
        return focus;
        
    }

    @Override
    public boolean esFocusCarta() {
        boolean focus = false;
        if((observadores.get(0).actualizarFigura()==observadores.get(1).actualizarFigura())&&
           (observadores.get(0).actualizarFigura()==observadores.get(2).actualizarFigura())&&
           (observadores.get(1).actualizarFigura()==observadores.get(2).actualizarFigura())){
            focus = true;
        }
        return focus;
    }
    
    
    
}
       