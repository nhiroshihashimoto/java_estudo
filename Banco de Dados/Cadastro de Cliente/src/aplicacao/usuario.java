package aplicacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class usuario extends DBConnection{
    
    private String nome;
    private String email;
    private String senha;
    private String sexo;
    private String leituraEsporte;
    private String leituraEducacao;
    private String leituraCulinaria;
    private String time;

    Connection conexao;

    public usuario() throws ClassNotFoundException, SQLException {
        this.conexao = getMyDBConnection();
    }

    public usuario(Connection conexao) {
        this.conexao = conexao;
    }

    public boolean verificarUser() throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = conexao.prepareStatement("select * from user where email = ? and senha = ?");
            pst.setString(1, this.email);
            pst.setString(2, this.senha);
            rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex){
            System.out.println("Problema de conexão com o servidor. Tente novamente.");
        }
        pst.close();
        rs.close();
        return false;
    }
    
    public boolean verificarEmail() throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            pst = conexao.prepareStatement("select * from user where email = ?");
            pst.setString(1, this.email);
            rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex){
            System.out.println("Problema de conexão com o servidor. Tente novamente.");
        }
        pst.close();
        rs.close();
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLeituraEsporte() {
        return leituraEsporte;
    }

    public void setLeituraEsporte(String leituraEsporte) {
        this.leituraEsporte = leituraEsporte;
    }

    public String getLeituraEducacao() {
        return leituraEducacao;
    }

    public void setLeituraEducacao(String leituraEducacao) {
        this.leituraEducacao = leituraEducacao;
    }

    public String getLeituraCulinaria() {
        return leituraCulinaria;
    }

    public void setLeituraCulinaria(String leituraCulinaria) {
        this.leituraCulinaria = leituraCulinaria;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
}
