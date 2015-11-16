
package modelo.carta;

import modelo.decorador.DecorarCarta;
import modelo.decorador.ICarta;
import modelo.observador.ICartaObserver;

public class FiguraCarroA extends DecorarCarta implements ICartaObserver{
    
    private String url = "carroA.png";

    public FiguraCarroA(ICarta unIcarta) {
        super(unIcarta);
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
        return Carta.CARRO;
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
