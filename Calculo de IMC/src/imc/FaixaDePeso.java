
package imc;

import java.util.Scanner;

public class FaixaDePeso {

    public static void main(String[] args) {
        
                double peso;
                double altura;
                
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite seu peso:");
        peso = entrada.nextDouble();
        
        System.out.println("Digite sua altura");
        altura = entrada.nextDouble();
        
        double resultado = obtemIMC(peso,altura);
        comparaIMC(resultado);
        
        
        
    }
    
    public static double obtemIMC(double peso,double altura) {
        
        double resultado=peso/(altura*altura);
        
        return resultado;
    }
    
    public static void comparaIMC(double resultado) {
        
        if (resultado<=18.5){
            System.out.println("Você está com bulimia.");
        }
            if((resultado>18.5) && (resultado<=25)){
                System.out.println("Você está acima do peso que a sociedade impõe, mas é bonitinho.");
            }
                if((resultado>25)&&(resultado<=30)){
                    System.out.println("Comece a se preocupar com infarto e com cirurgias bariátricas.");
                }
                    if(resultado>30){
                        System.out.println("Você não deve ser um humano, proválvelmente um elefante super evoluído.");
                    }
    }
    
}
