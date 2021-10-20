package Formas;

import Comum.*;

public class Piramide extends FormasTridimensionais {
    private double lado;

    public Piramide() {
    }

    public Piramide(double lado, double altura) {
        super(altura);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
    @Override
     public double calcularVolume(){
         return getAltura()/3*lado;
     }
}
