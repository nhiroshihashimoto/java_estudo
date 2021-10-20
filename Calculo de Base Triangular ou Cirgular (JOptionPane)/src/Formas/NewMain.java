package Formas;

import javax.swing.JOptionPane;

public class NewMain {

    public static void main(String[] args) {
        
        BaseTriangular[] t = new BaseTriangular[5];
        BaseCircular[] c = new BaseCircular[5];
        
        int decisao;
        
        decisao = Integer.parseInt(JOptionPane.showInputDialog(null,"1 - Piramide de Base Triangular;\n2 - Piramide de Base Circular;\n Opção:" , "Menu", 1));
        
        switch (decisao){
            case 1:
            for (int i=0; i<5 ; i++){
            t[i] = new BaseTriangular();
            
            t[i].setBase(Double.parseDouble(JOptionPane.showInputDialog(null, "Base: ", "Piramide Triangular", 3)));
            t[i].setAltura(Double.parseDouble(JOptionPane.showInputDialog(null, "Altura: ", "Piramide Triangular", 3)));
            
            JOptionPane.showMessageDialog(null,"Seu volume é " + t[i].calcularVolume(), "Piramide Triangular", 1);
            }
            break;
            
            case 2:
                for (int i=0; i<5 ; i++){
                c[i] = new BaseCircular();
            
                c[i].setRaio(Double.parseDouble(JOptionPane.showInputDialog(null, "Raio: ", "Piramide Circular", 3)));
                c[i].setAltura(Double.parseDouble(JOptionPane.showInputDialog(null, "Altura: ", "Piramide Circular", 3)));
            
                JOptionPane.showMessageDialog(null,"Seu volume é " + c[i].calcularVolume(), "Piramide Circular", 1);
                }
            
            break;
            
            default:
                JOptionPane.showMessageDialog(null, "Numero Invalido", "Erro", 2);
                
            break;
        }
    }
}
    

