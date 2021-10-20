package aplicacao;

import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class telaEditar extends JFrame implements ActionListener {

    ButtonGroup bgroup;
    JLabel textoTitulo;
    JButton cadastrar;
    JButton cancelar;
    JButton deletar;
    JRadioButton masculino;
    JRadioButton feminino;
    JLabel textoNome;
    JLabel textoEmail;
    JLabel textoSenha;
    JLabel textoSexo;
    JLabel textoLeitura;
    JLabel textoTime;
    JLabel textoObrigatorio;
    JTextField entradaNome;
    JTextField entradaEmail;
    JTextField entradaSenha;
    JCheckBox leituraEsporte;
    JCheckBox leituraEducacao;
    JCheckBox leituraCulinaria;
    JComboBox time;

    String sexo;
    Integer esportes;
    Integer educacao;
    Integer culinaria;

    connection conexao;

    public telaEditar() throws ClassNotFoundException, SQLException {
        super("Logado");
        setSize(480, 470);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p1 = new JPanel();
        p1.setLayout(null);

        conexao = new connection();

        bgroup = new ButtonGroup();

        textoNome = new JLabel("Nome:");
        textoNome.setBounds(112, 62, 40, 20);

        textoEmail = new JLabel("* E-mail:");
        textoEmail.setBounds(100, 97, 50, 20);

        textoSenha = new JLabel("* Senha:");
        textoSenha.setBounds(100, 132, 50, 20);

        textoSexo = new JLabel("Sexo:");
        textoSexo.setBounds(115, 180, 40, 20);

        textoLeitura = new JLabel("Estilo de Leitura:");
        textoLeitura.setBounds(50, 240, 95, 20);

        textoTime = new JLabel("Time de Futebol:");
        textoTime.setBounds(50, 290, 95, 20);

        textoObrigatorio = new JLabel("Os campos com * são obrigatórios.");
        textoObrigatorio.setBounds(10, 415, 200, 20);

        entradaNome = new JTextField();
        entradaNome.setBounds(150, 62, 220, 25);

        textoTitulo = new JLabel("");
        textoTitulo.setBounds(10, 15, 330, 20);
        textoTitulo.setFont(new Font("", Font.PLAIN, 20));

        entradaEmail = new JTextField();
        entradaEmail.setBounds(150, 97, 220, 25);
        entradaEmail.setEditable(false);

        entradaSenha = new JTextField();
        entradaSenha.setBounds(150, 132, 220, 25);

        masculino = new JRadioButton("Masculino");
        masculino.setBounds(160, 170, 100, 20);

        feminino = new JRadioButton("Feminino");
        feminino.setBounds(160, 190, 100, 20);

        bgroup.add(feminino);
        bgroup.add(masculino);

        leituraEsporte = new JCheckBox("Esportes");
        leituraEsporte.setBounds(160, 220, 100, 20);

        leituraEducacao = new JCheckBox("Educação");
        leituraEducacao.setBounds(160, 240, 100, 20);

        leituraCulinaria = new JCheckBox("Culinária");
        leituraCulinaria.setBounds(160, 260, 100, 20);

        String[] times = {"Nenhum", "Flamengo", "Fluminense", "Vasco", "Botafogo"};
        time = new JComboBox(times);
        time.setBounds(150, 285, 220, 30);
        time.setSelectedIndex(0);

        cadastrar = new JButton("Confirmar");
        cadastrar.setBounds(150, 340, 200, 30);

        cancelar = new JButton("Sair");
        cancelar.setBounds(150, 380, 200, 30);

        deletar = new JButton("Deletar");
        deletar.setBounds(20, 380, 80, 30);
        deletar.setBackground(Color.red);

        p1.add(textoTitulo);
        p1.add(textoNome);
        p1.add(textoEmail);
        p1.add(textoSenha);
        p1.add(textoSexo);
        p1.add(textoLeitura);
        p1.add(textoTime);
        p1.add(textoObrigatorio);

        p1.add(entradaNome);
        p1.add(entradaEmail);
        p1.add(entradaSenha);

        p1.add(masculino);
        p1.add(feminino);

        p1.add(leituraEsporte);
        p1.add(leituraEducacao);
        p1.add(leituraCulinaria);
        p1.add(time);
        p1.add(cadastrar);
        p1.add(cancelar);
        p1.add(deletar);

        cadastrar.addActionListener(this);
        cancelar.addActionListener(this);
        deletar.addActionListener(this);
        entradaSenha.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (entradaSenha.getText() == null || entradaSenha.getText().length() < 4) {
                    if (entradaSenha.getText() == null) {
                        JOptionPane.showMessageDialog(null, "Só é possível editar a senha.");
                        entradaSenha.requestFocus();
                    } else {
                        JOptionPane.showMessageDialog(null, "Insira uma senha com mais de 3 caracteres.");
                        entradaSenha.requestFocus();
                    }
                }
            }
        });

        add(p1);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (cadastrar == ae.getSource()) {
            try {
                conexao = new connection();
                if (entradaSenha.getText() == null || entradaSenha.getText().length() < 4) {
                    JOptionPane.showMessageDialog(null, "Insira uma senha com mais de 3 caracteres.");
                    entradaSenha.requestFocus();
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(telaCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (entradaSenha != null && entradaSenha.getText().length() > 3) {

                if (masculino.isSelected() || feminino.isSelected()) {
                    if (masculino.isSelected()) {
                        sexo = masculino.getText();
                    }
                    if (feminino.isSelected()) {
                        sexo = feminino.getText();
                    }
                } else {
                    sexo = "Indefinido";
                }

                if (leituraEsporte.isSelected()) {
                    esportes = 1;
                } else {
                    esportes = 0;
                }
                if (leituraEducacao.isSelected()) {
                    educacao = 1;
                } else {
                    educacao = 0;
                }
                if (leituraCulinaria.isSelected()) {
                    culinaria = 1;
                } else {
                    culinaria = 0;
                }
                try {
                    loading J1 = new loading();
                    Thread01 t1 = new Thread01();
                    Thread Td_1 = new Thread(t1);
                    Td_1.start();
                    J1.start2();

                    conexao = new connection();
                    conexao.editar(entradaNome.getText(), entradaSenha.getText(), sexo, Integer.toString(esportes), Integer.toString(educacao), Integer.toString(culinaria), time.getSelectedItem().toString(), entradaEmail.getText());
                    this.dispose();
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(telaCadastro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        if (deletar == ae.getSource()) {
            int op = 1;
            op = JOptionPane.showConfirmDialog(null, "Você realmente deseja deletar sua conta?\nSeus dados não poderão ser recuperados após a aceitação.");
            if (op == 0) {
                try {
                    conexao.deletarUsuario(entradaEmail.getText());
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(telaEditar.class.getName()).log(Level.SEVERE, null, ex);
                }
                loading J1 = new loading();
                Thread01 t1 = new Thread01();
                Thread Td_1 = new Thread(t1);
                Td_1.start();
                J1.start3();
                this.dispose();
            }
        }

        if (cancelar == ae.getSource()) {
            telaLogin telaLogin = new telaLogin();
            this.dispose();
        }
    }
}
