package comum;

public abstract class Funcionario {
    private String nome;
    private String matricula;
    private String endereço;

    public Funcionario() {
    }

    public Funcionario(String nome, String matricula, String endereço) {
        this.nome = nome;
        this.matricula = matricula;
        this.endereço = endereço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    
    public abstract double calcularSalario();
}
