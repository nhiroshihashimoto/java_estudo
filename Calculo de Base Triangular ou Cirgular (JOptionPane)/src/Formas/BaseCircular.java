package Formas;

public class BaseCircular extends Piramide {
    private double raio;

    public BaseCircular() {
    }

    public BaseCircular(double raio, double lado, double altura) {
        super(lado, altura);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularVolume(){
        return pi*raio*raio*getAltura();
    }
}
