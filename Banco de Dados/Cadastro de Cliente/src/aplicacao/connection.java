package aplicacao;

import java.sql.*;

public class connection extends DBConnection {

    String[] usuario = new String[8];
    Connection conexao;

    public connection() throws ClassNotFoundException, SQLException {
        this.conexao = getMyDBConnection();
    }

    public connection(Connection conexao) {
        this.conexao = conexao;
    }

    public void salvar(String nome, String email, String senha, String sexo, Integer esportes, Integer educacao, Integer culinaria, String time) throws SQLException, ClassNotFoundException {
        PreparedStatement pst = null;
        try {
            pst = conexao.prepareStatement("INSERT INTO cadastro ( nome, email, senha, sexo, esportes, educacao, culinaria, time ) values ( ?, ?, ?, ?, " + esportes + "," + educacao + "," + culinaria + ", ? )");
            pst.setString(1, nome);
            pst.setString(2, email);
            pst.setString(3, senha);
            pst.setString(4, sexo);
            pst.setString(5, time);
            pst.executeUpdate();
        } finally {
            pst.close();
        }
    }

    public void editar(String nome, String senha, String sexo, String esportes, String educacao, String culinaria, String time, String email) throws SQLException, ClassNotFoundException {
        PreparedStatement pst = null;
        try {
            pst = conexao.prepareStatement("UPDATE cadastro SET nome=?, senha=?, sexo=?, esportes=?, educacao=?, culinaria=?, time=? WHERE email=?");
            pst.setString(1, nome);
            pst.setString(2, senha);
            pst.setString(3, sexo);
            pst.setString(4, esportes);
            pst.setString(5, educacao);
            pst.setString(6, culinaria);
            pst.setString(7, time);
            pst.setString(8, email);
            pst.executeUpdate();
        } finally {
            pst.close();
        }
    }

    public boolean verificarEmail(String email) throws SQLException, ClassNotFoundException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = conexao.prepareStatement("SELECT * FROM cadastro WHERE email = ?");
            pst.setString(1, email);
            rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            }
        } finally {
            pst.close();
            rs.close();
        }
        return false;
    }

    public boolean verificarSenha(String email, String senha) throws SQLException, ClassNotFoundException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = conexao.prepareStatement("SELECT * FROM cadastro WHERE email = ? and senha = ?");
            pst.setString(1, email);
            pst.setString(2, senha);
            rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            }
        } finally {
            pst.close();
            rs.close();
        }
        return false;
    }

    public String[] consulta(String email) throws SQLException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = conexao.prepareStatement("SELECT * FROM cadastro WHERE email = ?");
            pst.setString(1, email);
            rs = pst.executeQuery();
            if (rs.next()) {
                usuario[0] = rs.getString("nome");
                usuario[1] = rs.getString("email");
                usuario[2] = rs.getString("senha");
                usuario[3] = rs.getString("sexo");
                usuario[4] = rs.getString("esportes");
                usuario[5] = rs.getString("educacao");
                usuario[6] = rs.getString("culinaria");
                usuario[7] = rs.getString("time");
                return usuario;
            }
        } finally {
            pst.close();
            rs.close();
        }
        return null;
    }
    
    public boolean deletarUsuario(String email) throws SQLException, ClassNotFoundException {
        PreparedStatement pst = null;
        try {
            pst = conexao.prepareStatement("DELETE FROM cadastro WHERE email = ?");
            pst.setString(1, email);
            pst.executeUpdate();
        } finally {
            pst.close();
        }
        return false;
    }
}
