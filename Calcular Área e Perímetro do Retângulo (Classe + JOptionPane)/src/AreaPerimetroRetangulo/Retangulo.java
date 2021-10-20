package AreaPerimetroRetangulo;

import javax.swing.JOptionPane;

public class Retangulo {
    public int base;
    public int altura;
    
    //Construtor

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    
    //Metodos
    
    
    public void exibirArea (){
        
        
        JOptionPane.showMessageDialog(null, "\n O valor da Area é " + this.calcularArea() );

    }
    
    public int calcularArea(){
        
        int area = base*altura;
        return area;
    }
    public void exibirPerimetro(){
        
        JOptionPane.showMessageDialog(null, "\n O valor do Perimetro é " + this.calcularPerimetro());
        
    }
    
    public int calcularPerimetro(){
        
        int perimetro = (2*base)+ (2*altura);
        return perimetro;
    }
           
}
