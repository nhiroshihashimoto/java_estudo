package empregado;

import comum.Empregado;

public class Chefe extends Empregado {
    
    private double salarioMensal;
    
    public Chefe(){
        
    }

    public Chefe(double salarioMensal, String nome, String endereço) {
        super(nome, endereço);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    
   
    @Override
    public double calcularSalario(){
        return salarioMensal;
    }
}
