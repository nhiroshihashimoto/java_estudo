package probabilidade.de.número2;

public class calculos {
    
    int emi1 = 1;
    int ema1 = 13;
    int teto1 = 60;
    
    int emi2 = 3;
    int ema2 = 26;
    int teto2 = 57;
    
    int emi3 = 18;
    int ema3 = 39;
    int teto3 = 57;
    
    int emi4 = 23;
    int ema4 = 47;
    int teto4 = 59;
    
    int emi5 = 32;
    int ema5 = 59;
    int teto5 = 59;
    
    int emi6 = 46;
    int ema6 = 60;
    int teto6 = 59;
    
    int temp[] = new int[6];
    
    public void deducao1(manipuladorVetores manipulador){
        
        manipulador.bubblesort2();
        
        //Coluna 1
        for(int i = 0; i < manipulador.coluna1.numeros.length; i++){ // 60
            if(i < teto1 && manipulador.coluna1.numeros[i].numero > emi1 && manipulador.coluna1.numeros[i].numero < ema1){
                temp[0] = manipulador.coluna1.numeros[i].numero;
            }
        }
        
        //Coluna 2
        for(int i = 0; i < manipulador.coluna2.numeros.length; i++){ // 60
            if(i < teto2 && manipulador.coluna2.numeros[i].numero > emi2 && manipulador.coluna2.numeros[i].numero < ema2 && manipulador.coluna2.numeros[i].numero != temp[0]){
                temp[1] = manipulador.coluna2.numeros[i].numero;
            }
        }
        
        //Coluna 3
        for(int i = 0; i < manipulador.coluna3.numeros.length; i++){ // 60
            if(i < teto3 && manipulador.coluna3.numeros[i].numero > emi3 && manipulador.coluna3.numeros[i].numero < ema3 && manipulador.coluna3.numeros[i].numero != temp[1] && manipulador.coluna3.numeros[i].numero != temp[0]){
                temp[2] = manipulador.coluna3.numeros[i].numero;
            }
        }
        
        //Coluna 4
        for(int i = 0; i < manipulador.coluna4.numeros.length; i++){ // 60
            if(i < teto4 && manipulador.coluna4.numeros[i].numero > emi4 && manipulador.coluna4.numeros[i].numero < ema4 && manipulador.coluna4.numeros[i].numero != temp[2] && manipulador.coluna3.numeros[i].numero != temp[1] && manipulador.coluna3.numeros[i].numero != temp[0]){
                temp[3] = manipulador.coluna4.numeros[i].numero;
            }
        }
        
        //Coluna 5
        for(int i = 0; i < manipulador.coluna5.numeros.length; i++){ // 60
            if(i < teto5 && manipulador.coluna5.numeros[i].numero > emi5 && manipulador.coluna5.numeros[i].numero < ema5 && manipulador.coluna5.numeros[i].numero != temp[3] && manipulador.coluna4.numeros[i].numero != temp[2] && manipulador.coluna3.numeros[i].numero != temp[1] && manipulador.coluna3.numeros[i].numero != temp[0]){
                temp[4] = manipulador.coluna5.numeros[i].numero;
            }
        }
        //Coluna 6
        for(int i = 0; i < manipulador.coluna6.numeros.length; i++){ // 60
            if(i < teto6 && manipulador.coluna6.numeros[i].numero > emi6 && manipulador.coluna6.numeros[i].numero < ema6 && manipulador.coluna6.numeros[i].numero != temp[4] && manipulador.coluna5.numeros[i].numero != temp[3] && manipulador.coluna4.numeros[i].numero != temp[2] && manipulador.coluna3.numeros[i].numero != temp[1] && manipulador.coluna3.numeros[i].numero != temp[0]){
                temp[5] = manipulador.coluna6.numeros[i].numero;
            }
        }
        bubblesortDeducao();
    }
    
    public void bubblesortDeducao(){
        boolean troca = true;
        while(troca){
            troca = false;
            for(int i = 0; i < temp.length - 1; i++){
                if(temp[i] > temp[i + 1]){
                    int aux = temp[i];
                    temp[i] = temp[i + 1];
                    temp[i + 1] = aux;
                    troca = true;
                }
            }
        }
    }
}
