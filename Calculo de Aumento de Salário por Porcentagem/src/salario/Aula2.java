package salario;

import java.util.Scanner;

public class Aula2 {

    public static void main(String[] args) {
    float sal, aum_sal;
    float percent_aum;
    
    Scanner txt = new Scanner (System.in);
    
    System.out.print("Informe seu salario: R$"); 
    sal = txt.nextFloat();
    
    System.out.print("Informe Percentual de aumento:");
    percent_aum = txt.nextInt();
    
    aum_sal = sal*(percent_aum/100);
    
    sal += aum_sal;
    
        System.out.print("Valor de aumento: R$ " + aum_sal + "\n");
        
        System.out.println("Novo Salario: R$ " + sal );
    
    
    }
    
}


