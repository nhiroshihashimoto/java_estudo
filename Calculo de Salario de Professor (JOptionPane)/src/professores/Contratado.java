package professores;

public class Contratado extends Professor{
    private float inss;

    public Contratado() {
        
    }

    public Contratado(float inss, int cargaHoraria, double valorHora) {
        super(cargaHoraria, valorHora);
        this.inss = inss;
    }

    public float getInss() {
        return inss;
    }

    public void setInss(float inss) {
        this.inss = inss;
    }
    
    @Override
    public double calcularSalario(){
        return getCargaHoraria()*getValorHora()-inss;
    }
}
