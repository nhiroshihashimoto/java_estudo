package professores;

public class Estatuario extends Professor{
    private float trienio;
    private float rioprev;

    public Estatuario() {
        
    }

    public Estatuario(float trienio, float rioprev, int cargaHoraria, double valorHora) {
        super (cargaHoraria, valorHora);
        this.trienio = trienio;
        this.rioprev = rioprev;
    }

    public float getTrienio() {
        return trienio;
    }

    public void setTrienio(float trienio) {
        this.trienio = trienio;
    }

    public float getRioprev() {
        return rioprev;
    }

    public void setRioprev(float rioprev) {
        this.rioprev = rioprev;
    }
    
    @Override
    public double calcularSalario(){
  
        return getCargaHoraria()*getValorHora()+trienio-rioprev;
    }
}
