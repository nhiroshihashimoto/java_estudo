package Formas;

public class BaseTriangular extends Piramide {
    private double base;

    public BaseTriangular() {
    }

    public BaseTriangular(double base, double lado, double altura) {
        super(lado, altura);
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    @Override
    public double calcularVolume(){
        return (base*base)/2*getAltura();
    }
    
    
}
