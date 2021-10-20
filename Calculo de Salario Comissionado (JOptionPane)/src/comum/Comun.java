package comum;

import empregado.Comissionado;
import javax.swing.JOptionPane;

public class Comun {

    public static void main(String[] args) {
        int i;
        Comissionado[] c = new Comissionado[5];
        
        for(i=0; i<5;i++){
            c[i] = new Comissionado();
            
            c[i].setNome(JOptionPane.showInputDialog(null, "Digite Seu nome:", "Empregado Comissionado", 1));
            c[i].setEndereço(JOptionPane.showInputDialog(null, "Digite Seu Endereço:", "Empregado Comissionado", 3));
            c[i].setSalarioBase(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu salario Base:", "Empregado Comissionado", 3)));
            c[i].setComissao(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua comissao:", "Empregado Comissionado",3)));
            c[i].setQuantidade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite O n° de comissoes:", "Empregado Comissionado", 3)));
            JOptionPane.showMessageDialog(null, "Nome:" + c[i].getNome() + "\nEndereço:" + c[i].getEndereço() + "\nSalario:" + c[i].calcularSalario() , "Empregado Comissionado", 1);
        }
    } 
}
