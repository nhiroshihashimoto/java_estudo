package empregado;

import comum.Empregado;

public class Comissionado extends Empregado {
    private double salarioBase;
    private double comissao;
    private int quantidade;
    
    public Comissionado(){
        
    }

    public Comissionado(double salarioBase, double comissao, int quantidade, String nome, String endereço) {
        super(nome, endereço);
        this.salarioBase = salarioBase;
        this.comissao = comissao;
        this.quantidade = quantidade;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    @Override
    public double calcularSalario(){
        double salarioMensal;
        salarioMensal = salarioBase + (comissao*quantidade);
        return salarioMensal;
        
    }
}
