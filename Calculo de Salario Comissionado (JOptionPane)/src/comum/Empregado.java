package comum;

public abstract class Empregado {
    
    private String nome;
    private String endereço;
    
    public Empregado(){
        
    }

    public Empregado(String nome, String endereço) {
        this.nome = nome;
        this.endereço = endereço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    
    public abstract double calcularSalario();
    
}
