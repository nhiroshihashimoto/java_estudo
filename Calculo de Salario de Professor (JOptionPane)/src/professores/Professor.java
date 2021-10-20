package professores;

import comum.Funcionario;

public class Professor extends Funcionario{
    private int cargaHoraria;
    private double valorHora;

    public Professor() {
    }

    public Professor(int cargaHoraria, double valorHora, String nome, String matricula, String endereço) {
        super(nome, matricula, endereço);
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
    }

   public Professor(int cargaHoraria, double valorHora) {
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public double calcularSalario(){
        
        return cargaHoraria*valorHora;
    }
    
    
    
}
