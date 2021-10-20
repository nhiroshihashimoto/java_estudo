package probabilidade.de.número2;

public class manipuladorVetores {
    vetor principal = new vetor();
    vetor coluna1 = new vetor();
    vetor coluna2 = new vetor();
    vetor coluna3 = new vetor();
    vetor coluna4 = new vetor();
    vetor coluna5 = new vetor();
    vetor coluna6 = new vetor();
    
    public void inserir(int t1, int t2, int t3, int t4, int t5, int t6, long quant){
        for (int n = 0; n < 60; n++) {
            if (t1 == principal.numeros[n].numero) {
                principal.numeros[n].inserir(1, quant);
            } else if (t2 == principal.numeros[n].numero) {
                principal.numeros[n].inserir(2, quant);
            } else if (t3 == principal.numeros[n].numero) {
                principal.numeros[n].inserir(3, quant);
            } else if (t4 == principal.numeros[n].numero) {
                principal.numeros[n].inserir(4, quant);
            } else if (t5 == principal.numeros[n].numero) {
                principal.numeros[n].inserir(5, quant);
            } else if (t6 == principal.numeros[n].numero) {
                principal.numeros[n].inserir(6, quant);
            } else{
                principal.numeros[n].probSeq=1;
                principal.numeros[n].probSeq1=1;
                principal.numeros[n].probSeq2=1;
                principal.numeros[n].probSeq3=1;
                principal.numeros[n].probSeq4=1;
                principal.numeros[n].probSeq5=1;
                principal.numeros[n].probSeq6=1;
            }
            principal.numeros[n].updateProbSeq(quant);
        }
    }
    
    public void exibirVetorPrincipal(long quant){
        for(int i = 0; i < principal.numeros.length; i++){
            System.out.println(principal.numeros[i].numero + " : " + principal.numeros[i].quantSorteado + " (" + String.format("%.04f", principal.numeros[i].quantSorteado / quant)+ "%)");
        }
    }
    
    public void exibirColuna1(int coluna, long quant){
        if(coluna == 1){
            for (numero numero : coluna1.numeros) {
                System.out.println(numero.numero + " : " + numero.sp1 + " (" + String.format("%.04f", numero.sp1 / quant*100) + "%)");
            }
        } else if(coluna == 2){
            for (numero numero : coluna2.numeros) {
                System.out.println(numero.numero + " : " + numero.sp2 + " (" + String.format("%.04f", numero.sp2 / quant*100) + "%)");
            }
        } else if(coluna == 3){
            for (numero numero : coluna3.numeros) {
                System.out.println(numero.numero + " : " + numero.sp3 + " (" + String.format("%.04f", numero.sp3 / quant*100) + "%)");
            }
        } else if(coluna == 4){
            for (numero numero : coluna4.numeros) {
                System.out.println(numero.numero + " : " + numero.sp4 + " (" + String.format("%.04f", numero.sp4 / quant*100) + "%)");
            }
        } else if(coluna == 5){
            for (numero numero : coluna5.numeros) {
                System.out.println(numero.numero + " : " + numero.sp5 + " (" + String.format("%.04f", numero.sp5 / quant*100) + "%)");
            }
        } else if(coluna == 6){
            for (numero numero : coluna6.numeros) {
                System.out.println(numero.numero + " : " + numero.sp6 + " (" + String.format("%.04f", numero.sp6 / quant*100) + "%)");
            }
        }
    }
    
    public void exibirColuna2(int coluna, long quant){
        if(coluna == 1){
            for (numero numero : coluna1.numeros) {
                System.out.println(numero.numero + " : " + numero.sp1 + " (" + String.format("%.04f", numero.calcProb(1) *100) + "%)");
            }
        } else if(coluna == 2){
            for (numero numero : coluna2.numeros) {
                System.out.println(numero.numero + " : " + numero.sp2 + " (" + String.format("%.04f", numero.calcProb(2) *100) + "%)");
            }
        } else if(coluna == 3){
            for (numero numero : coluna3.numeros) {
                System.out.println(numero.numero + " : " + numero.sp3 + " (" + String.format("%.04f", numero.calcProb(3) *100) + "%)");
            }
        } else if(coluna == 4){
            for (numero numero : coluna4.numeros) {
                System.out.println(numero.numero + " : " + numero.sp4 + " (" + String.format("%.04f", numero.calcProb(4) *100) + "%)");
            }
        } else if(coluna == 5){
            for (numero numero : coluna5.numeros) {
                System.out.println(numero.numero + " : " + numero.sp5 + " (" + String.format("%.04f", numero.calcProb(5) *100) + "%)");
            }
        } else if(coluna == 6){
            for (numero numero : coluna6.numeros) {
                System.out.println(numero.numero + " : " + numero.sp6 + " (" + String.format("%.04f", numero.calcProb(6) *100) + "%)");
            }
        }
    }
    
    public void bubblesort1(){
        
        //coluna 1
        System.arraycopy(principal.numeros, 0, coluna1.numeros, 0, 60);
        
        boolean troca = true;
        while(troca){
            troca = false;
            for(int i = 0; i < coluna1.numeros.length - 1; i++){
                if(coluna1.numeros[i].sp1 > coluna1.numeros[i + 1].sp1){
                    vetor temp = new vetor();
                    temp.numeros[0] = coluna1.numeros[i];
                    coluna1.numeros[i] = coluna1.numeros[i + 1];
                    coluna1.numeros[i + 1] = temp.numeros[0];
                    troca = true;
                }
            }
        }
        
        //coluna 2
        System.arraycopy(principal.numeros, 0, coluna2.numeros, 0, 60);
        
        troca = true;
        while(troca){
            troca = false;
            for(int i = 0; i < coluna2.numeros.length - 1; i++){
                if(coluna2.numeros[i].sp2 > coluna2.numeros[i + 1].sp2){
                    vetor temp = new vetor();
                    temp.numeros[0] = coluna2.numeros[i];
                    coluna2.numeros[i] = coluna2.numeros[i + 1];
                    coluna2.numeros[i + 1] = temp.numeros[0];
                    troca = true;
                }
            }
        }
        
        //coluna 3
        System.arraycopy(principal.numeros, 0, coluna3.numeros, 0, 60);
        
        troca = true;
        while(troca){
            troca = false;
            for(int i = 0; i < coluna3.numeros.length - 1; i++){
                if(coluna3.numeros[i].sp3 > coluna3.numeros[i + 1].sp3){
                    vetor temp = new vetor();
                    temp.numeros[0] = coluna3.numeros[i];
                    coluna3.numeros[i] = coluna3.numeros[i + 1];
                    coluna3.numeros[i + 1] = temp.numeros[0];
                    troca = true;
                }
            }
        }
        
        //coluna 4
        System.arraycopy(principal.numeros, 0, coluna4.numeros, 0, 60);
        
        troca = true;
        while(troca){
            troca = false;
            for(int i = 0; i < coluna4.numeros.length - 1; i++){
                if(coluna4.numeros[i].sp4 > coluna4.numeros[i + 1].sp4){
                    vetor temp = new vetor();
                    temp.numeros[0] = coluna4.numeros[i];
                    coluna4.numeros[i] = coluna4.numeros[i + 1];
                    coluna4.numeros[i + 1] = temp.numeros[0];
                    troca = true;
                }
            }
        }
        
        //coluna 5
        System.arraycopy(principal.numeros, 0, coluna5.numeros, 0, 60);
        
        troca = true;
        while(troca){
            troca = false;
            for(int i = 0; i < coluna5.numeros.length - 1; i++){
                if(coluna5.numeros[i].sp5 > coluna5.numeros[i + 1].sp5){
                    vetor temp = new vetor();
                    temp.numeros[0] = coluna5.numeros[i];
                    coluna5.numeros[i] = coluna5.numeros[i + 1];
                    coluna5.numeros[i + 1] = temp.numeros[0];
                    troca = true;
                }
            }
        }
        
        //coluna 6
        System.arraycopy(principal.numeros, 0, coluna6.numeros, 0, 60);
        
        troca = true;
        while(troca){
            troca = false;
            for(int i = 0; i < coluna6.numeros.length - 1; i++){
                if(coluna6.numeros[i].sp6 > coluna6.numeros[i + 1].sp6){
                    vetor temp = new vetor();
                    temp.numeros[0] = coluna6.numeros[i];
                    coluna6.numeros[i] = coluna6.numeros[i + 1];
                    coluna6.numeros[i + 1] = temp.numeros[0];
                    troca = true;
                }
            }
        }
    }
    
    public void bubblesort2(){
        
        //coluna 1
        System.arraycopy(principal.numeros, 0, coluna1.numeros, 0, 60);
        
        boolean troca = true;
        while(troca){
            troca = false;
            for(int i = 0; i < coluna1.numeros.length - 1; i++){
                if(coluna1.numeros[i].calcProb(1) > coluna1.numeros[i + 1].calcProb(1)){
                    vetor temp = new vetor();
                    temp.numeros[0] = coluna1.numeros[i];
                    coluna1.numeros[i] = coluna1.numeros[i + 1];
                    coluna1.numeros[i + 1] = temp.numeros[0];
                    troca = true;
                }
            }
        }
        
        //coluna 2
        System.arraycopy(principal.numeros, 0, coluna2.numeros, 0, 60);
        
        troca = true;
        while(troca){
            troca = false;
            for(int i = 0; i < coluna2.numeros.length - 1; i++){
                if(coluna2.numeros[i].calcProb(2) > coluna2.numeros[i + 1].calcProb(2)){
                    vetor temp = new vetor();
                    temp.numeros[0] = coluna2.numeros[i];
                    coluna2.numeros[i] = coluna2.numeros[i + 1];
                    coluna2.numeros[i + 1] = temp.numeros[0];
                    troca = true;
                }
            }
        }
        
        //coluna 3
        System.arraycopy(principal.numeros, 0, coluna3.numeros, 0, 60);
        
        troca = true;
        while(troca){
            troca = false;
            for(int i = 0; i < coluna3.numeros.length - 1; i++){
                if(coluna3.numeros[i].calcProb(3) > coluna3.numeros[i + 1].calcProb(3)){
                    vetor temp = new vetor();
                    temp.numeros[0] = coluna3.numeros[i];
                    coluna3.numeros[i] = coluna3.numeros[i + 1];
                    coluna3.numeros[i + 1] = temp.numeros[0];
                    troca = true;
                }
            }
        }
        
        //coluna 4
        System.arraycopy(principal.numeros, 0, coluna4.numeros, 0, 60);
        
        troca = true;
        while(troca){
            troca = false;
            for(int i = 0; i < coluna4.numeros.length - 1; i++){
                if(coluna4.numeros[i].calcProb(4) > coluna4.numeros[i + 1].calcProb(4)){
                    vetor temp = new vetor();
                    temp.numeros[0] = coluna4.numeros[i];
                    coluna4.numeros[i] = coluna4.numeros[i + 1];
                    coluna4.numeros[i + 1] = temp.numeros[0];
                    troca = true;
                }
            }
        }
        
        //coluna 5
        System.arraycopy(principal.numeros, 0, coluna5.numeros, 0, 60);
        
        troca = true;
        while(troca){
            troca = false;
            for(int i = 0; i < coluna5.numeros.length - 1; i++){
                if(coluna5.numeros[i].calcProb(5) > coluna5.numeros[i + 1].calcProb(5)){
                    vetor temp = new vetor();
                    temp.numeros[0] = coluna5.numeros[i];
                    coluna5.numeros[i] = coluna5.numeros[i + 1];
                    coluna5.numeros[i + 1] = temp.numeros[0];
                    troca = true;
                }
            }
        }
        
        //coluna 6
        System.arraycopy(principal.numeros, 0, coluna6.numeros, 0, 60);
        
        troca = true;
        while(troca){
            troca = false;
            for(int i = 0; i < coluna6.numeros.length - 1; i++){
                if(coluna6.numeros[i].calcProb(6) > coluna6.numeros[i + 1].calcProb(6)){
                    vetor temp = new vetor();
                    temp.numeros[0] = coluna6.numeros[i];
                    coluna6.numeros[i] = coluna6.numeros[i + 1];
                    coluna6.numeros[i + 1] = temp.numeros[0];
                    troca = true;
                }
            }
        }
    }
    
}
