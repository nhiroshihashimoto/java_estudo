package aplicacao;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class telaLogin extends JFrame implements ActionListener {

    JLabel textoEmail;
    JLabel textoSenha;
    JTextField entradaEmail;
    JPasswordField entradaSenha;
    JButton botaoEntrar;
    JButton botaoCadastrar;

    connection conexao;

    public telaLogin() {
        super("Login");
        setSize(320, 200);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);

        textoEmail = new JLabel("E-mail: ");
        textoEmail.setBounds(25, 30, 65, 23);

        textoSenha = new JLabel("Senha: ");
        textoSenha.setBounds(23, 60, 75, 20);

        entradaEmail = new JTextField();
        entradaEmail.setBounds(65, 30, 220, 25);

        entradaSenha = new JPasswordField();
        entradaSenha.setBounds(65, 60, 220, 25);

        botaoEntrar = new JButton("Entrar");
        botaoEntrar.setBounds(85, 100, 150, 25);
        botaoEntrar.setBackground(Color.green);

        botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.setBounds(85, 130, 150, 25);
        botaoCadastrar.setBackground(Color.white);

        p1.add(textoEmail);
        p1.add(textoSenha);
        p1.add(entradaEmail);
        p1.add(entradaSenha);
        p1.add(botaoEntrar);
        p1.add(botaoCadastrar);

        botaoCadastrar.addActionListener(this);
        botaoEntrar.addActionListener(this);

        add(p1);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (botaoEntrar == ae.getSource()) {
            try {
                conexao = new connection();
                if (conexao.verificarEmail(entradaEmail.getText()) != true) {
                    JOptionPane.showMessageDialog(null, "Email não encontrado.");
                    entradaEmail.requestFocus();
                }

                if (conexao.verificarSenha(entradaEmail.getText(), entradaSenha.getText()) != true) {
                    JOptionPane.showMessageDialog(null, "Senha inválida.");
                    entradaSenha.requestFocus();
                } else {
                    telaEditar telaEditar = new telaEditar();
                    telaEditar.entradaEmail.setText(this.entradaEmail.getText());
                    telaEditar.entradaSenha.setText(this.entradaSenha.getText());


                    conexao.consulta(entradaEmail.getText());

                    telaEditar.entradaNome.setText(conexao.usuario[0]);
                    telaEditar.textoTitulo.setText("Seja bem-vindo(a) " + conexao.usuario[0] + "!");

                    if (conexao.usuario[3].equals("Masculino")) {
                        telaEditar.masculino.setSelected(true);
                    } else {
                        telaEditar.feminino.setSelected(true);
                    }

                    if (conexao.usuario[4].equals("1")) {
                        telaEditar.leituraEsporte.setSelected(true);
                    }
                    if (conexao.usuario[5].equals("1")) {
                        telaEditar.leituraEducacao.setSelected(true);
                    }
                    if (conexao.usuario[6].equals("1")) {
                        telaEditar.leituraCulinaria.setSelected(true);;
                    }

                    if (conexao.usuario[7].equals("Flamengo")) {
                        telaEditar.time.setSelectedItem("Flamengo");
                    }

                    if (conexao.usuario[7].equals("Fluminense")) {
                        telaEditar.time.setSelectedItem("Fluminense");
                    }

                    if (conexao.usuario[7].equals("Vasco")) {
                        telaEditar.time.setSelectedItem("Vasco");
                    }

                    if (conexao.usuario[7].equals("Botafogo")) {
                        telaEditar.time.setSelectedItem("Botafogo");
                    }
                    this.dispose();
                }

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(telaLogin.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (botaoCadastrar == ae.getSource()) {
            
            try {
                telaCadastro telaCadastro = new telaCadastro();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(telaLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        }
    }

}
