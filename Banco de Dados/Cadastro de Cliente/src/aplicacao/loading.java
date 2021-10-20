package aplicacao;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class loading extends JFrame implements ChangeListener {

    JLabel texto1;
    int total = 0;
    int acao = 0;

    private static JProgressBar pb = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);

    public loading() {
        super("Loading");
        setLocationRelativeTo(null);
        setSize(300, 70);
        setResizable(false);
        Container Janela = getContentPane();
        Janela.setLayout(new FlowLayout());

        texto1 = new JLabel("Loading...");
        texto1.setFont(new Font("Java", Font.PLAIN, 20));

        pb.setMinimum(0);
        pb.setMaximum(100);
        pb.setValue(total);

        Janela.add(texto1);
        Janela.add(pb);

        pb.addChangeListener((ChangeListener) this);

        setVisible(true);
    }

    static void setValue(int i) {
        pb.setValue(i);
    }

    static int getValue() {
        return pb.getValue();
    }

    @Override
    public void stateChanged(ChangeEvent ce) {
        if (pb.getValue() == 100 && acao == 1) {
            acao = 0;
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
            telaLogin telaLogin = new telaLogin();
            this.dispose();
        }
        
        if (pb.getValue() == 100 && acao == 2){
            acao = 0;
            JOptionPane.showMessageDialog(null, "Modificação efetuada com sucesso!");
            telaLogin telaLogin = new telaLogin();
            this.dispose();
        }
        
        if (pb.getValue() == 100 && acao == 3){
            acao = 0;
            JOptionPane.showMessageDialog(null, "Conta deletada com sucesso!");
            telaLogin telaLogin = new telaLogin();
            this.dispose();
        }
    }

    public void start1() {
        acao = 1;
    }
    
    public void start2() {
        acao = 2;
        
    }
    
    public void start3() {
        acao = 3;
        
    }
}
