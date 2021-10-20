package automovel;

import java.util.Scanner;

public class Aula2Exe4 {
    public static void main(String[] args) {
        float pFab, pLucDist, pImp;
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Informe o preço de fábrica do automóvel:");
        pFab = entrada.nextFloat();
        
        System.out.print("Informe o percentual do Lucro do Distribuidor:");
        pLucDist = entrada.nextFloat();
        
        System.out.print("Informe o Percentual de Imposto:");
        pImp = entrada.nextFloat();
        
        float lucDist = pFab * pLucDist / 100;
        float vImp = pFab * pImp /100;
        float pFinal = pFab + lucDist + vImp;
        
        System.out.println("O Valor correspondente ao lucro do distribuidor:" + lucDist);
        System.out.println("O Valor correspondente aos impostos:" + vImp);
        System.out.println("O preço final do veículo:" + pFinal);
    }
    
}
