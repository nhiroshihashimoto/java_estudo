package Comum;

public abstract class FormasTridimensionais implements Formas {
    private double altura;

    public FormasTridimensionais() {
    }

    public FormasTridimensionais(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
  
    public abstract double calcularVolume();
    
    
}
