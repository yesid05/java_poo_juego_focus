
package modelo.carta;

import modelo.decorador.DecorarCarta;
import modelo.decorador.ICarta;
import modelo.observador.ICartaObserver;

public class FiguraAvionA extends DecorarCarta implements ICartaObserver{
    
    private String url = "avionA.png";

    public FiguraAvionA(ICarta unICarta) {
        super(unICarta);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    @Override
    public String getTipoFigura() {
        return getICarta().getTipoFigura()+getUrl();
    }

    @Override
    public int actualizarFigura() {
       return Carta.AVION;
    }

    @Override
    public int cantidadObjetos() {
        return 1;
    }

    @Override
    public String imagen() {
        return getTipoFigura();
    }
    
}
