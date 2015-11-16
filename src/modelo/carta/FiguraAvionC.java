
package modelo.carta;

import modelo.decorador.DecorarCarta;
import modelo.decorador.ICarta;
import modelo.observador.ICartaObserver;

public class FiguraAvionC extends DecorarCarta implements ICartaObserver{
    
    private String url = "avionC.png";

    public FiguraAvionC(ICarta unICarta) {
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
        return 3;
    }

    @Override
    public String imagen() {
       return getTipoFigura();
    }
    
    
    
    
}
