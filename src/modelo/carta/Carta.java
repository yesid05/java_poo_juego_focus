package modelo.carta;

import modelo.decorador.ICarta;

public class  Carta implements ICarta{
    
    public static final int CARRO=1;
    
    public static final int MOTO=2;
    
    public static final int AVION=3;
    
    public static final int ROJO = 4;
    
    public static final int VERDE = 5;
    
    public static final int AZUL = 6;
    
    private int figura;
    
    private int color;
    
    private String url="/img/";
    
    public Carta(){}
    
    public Carta(int unTipo) {
        figura = unTipo;
    }

    public int getFigura() {
        return figura;
    }

    public void setFigura(int figura) {
        this.figura = figura;
    }

    
    
    

    @Override
    public String getTipoFigura() {
       return url;
    }

   

}
