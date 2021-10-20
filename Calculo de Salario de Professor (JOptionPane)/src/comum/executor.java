package comum;

import javax.swing.JOptionPane;
import professores.Estatuario;

public class executor {

    public static void main(String[] args) {
        Estatuario e = new Estatuario();
        
        e.setNome(JOptionPane.showInputDialog(null,"Preencha os campos:\n" + "Nome:", "Professor Estatuario", 3));
        e.setEndereço(JOptionPane.showInputDialog(null,"Endereço:","Professor Estatario", 3));
        e.setMatricula(JOptionPane.showInputDialog(null,"Matricula:","Professor Estatuario", 3));
        e.setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog(null,"Carga horaria de trabalho", "Professor Estatuario", 3)));
        e.setValorHora(Double.parseDouble(JOptionPane.showInputDialog(null,"Valor Hora:","Professor Estatario", 3)));
       
        JOptionPane.showMessageDialog(null,"Dados Professor " + e.getNome() + "\n\n" + "Carga Horaria:" + e.getCargaHoraria() + "\nSalario:" + e.calcularSalario(), "Professor Estatuario", 3);
    }
    
}
