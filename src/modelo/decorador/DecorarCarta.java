package modelo.decorador;


public abstract class DecorarCarta implements ICarta {
    private ICarta iCarta;

    public DecorarCarta(ICarta unICarta) {
        setFigura(unICarta);
    }
    
    public final void setFigura(ICarta unICarta){
        iCarta = unICarta;
    }
    
    public ICarta getICarta(){
        return iCarta;
    }
    
    
    
}
