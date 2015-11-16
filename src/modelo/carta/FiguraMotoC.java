

package modelo.carta;

import modelo.decorador.DecorarCarta;
import modelo.decorador.ICarta;
import modelo.observador.ICartaObserver;

public class FiguraMotoC extends DecorarCarta implements ICartaObserver{
    
    private String url = "motoC.png";

    public FiguraMotoC(ICarta unICarta) {
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
        return Carta.MOTO;
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
