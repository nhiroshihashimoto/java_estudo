package AreaPerimetroRetangulo;

import javax.swing.JOptionPane;

public class UsaRetangulo {

    public static void main(String[] args) {
        
        Retangulo R1 = new Retangulo(1,1);
        
        R1.altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a Altura do retangulo:"));
        R1.base = Integer.parseInt(JOptionPane.showInputDialog("Digite a Base do retangulo:"));
        
        System.out.println("\n**Retangulo R1**");
        System.out.println("\n Base: "+ "" + R1.base);
        System.out.println("Altura: " + "" + R1.altura);        
        
        R1.exibirArea();
        R1.exibirPerimetro();
        
    }
    
}
