package probabilidade.de.número2;

public class numero {

    int numero;
    double quantSorteado = 0;
    double porcentoMedia = 0;
    long inicioProb = 1;
    long espacoMax=0;
    long espacoMin=100000000;
    long espacoAtual;
    double espacoMedia=0;
    long ultSorteio=0;
    
    double prob = 0;
    double prob1 = 0;
    double prob2 = 0;
    double prob3 = 0;
    double prob4 = 0;
    double prob5 = 0;
    double prob6 = 0;
    
    int probSeq = 100;
    int probSeq1 = 100;
    int probSeq2 = 100;
    int probSeq3 = 100;
    int probSeq4 = 100;
    int probSeq5 = 100;
    int probSeq6 = 100;
    
    double probSeqC = 0;
    double probSeq1C = 0;
    double probSeq2C = 0;
    double probSeq3C = 0;
    double probSeq4C = 0;
    double probSeq5C = 0;
    double probSeq6C = 0;
    
    
    //Dados para Bubblesort
    double sp1 = 0;
    double sp2 = 0;
    double sp3 = 0;
    double sp4 = 0;
    double sp5 = 0;
    double sp6 = 0;

    public numero(int n) {
        numero = n;
    }
    
    public double getSpace(int n){
        double tmp = 0;
        if(n == 0){
            tmp = sp1;
        }else if(n == 1){
            tmp = sp2;
        }else if(n == 2){
            tmp = sp3;
        }else if(n == 3){
            tmp = sp4;
        }else if(n == 4){
            tmp = sp5;
        }else{
            tmp = sp6;
        }
        
        return tmp;
    }
    
    public void inserir(int coluna, long quant){
        if(coluna == 1){
            quantSorteado++;
            sp1++;
            probSeq = 0;
            probSeq1 = 0;
            prob = (quantSorteado/quant);
            prob1 = (sp1/quantSorteado);
        }else if (coluna == 2){
            quantSorteado++;
            sp2++;
            probSeq = 0;
            probSeq2 = 0;
            prob = (quantSorteado/quant);
            prob2 = (sp2/quantSorteado);
        } else if(coluna == 3){
            quantSorteado++;
            sp3++;
            probSeq = 0;
            probSeq3 = 0;
            prob = (quantSorteado/quant);
            prob3 = (sp3/quantSorteado);
        } else if(coluna == 4){
            quantSorteado++;
            sp4++;
            probSeq = 0;
            probSeq4 = 0;
            prob = (quantSorteado/quant);
            prob4 = (sp4/quantSorteado);
        } else if(coluna == 5){
            quantSorteado++;
            sp5++;
            probSeq = 0;
            probSeq5 = 0;
            prob = (quantSorteado/quant);
            prob5 = (sp5/quantSorteado);
        } else if(coluna == 6){
            quantSorteado++;
            sp6++;
            probSeq = 0;
            probSeq6 = 0;
            prob = (quantSorteado/quant);
            prob6 = (sp6/quantSorteado);
        }
    }
    
    public void updateProbSeq(long quant){
        probSeqC = probSeq/quant;
        probSeq1C = probSeq1/quant;
        probSeq2C = probSeq2/quant;
        probSeq3C = probSeq3/quant;
        probSeq4C = probSeq4/quant;
        probSeq5C = probSeq5/quant;
        probSeq6C = probSeq6/quant;
    }
    
    public double calcProb(int coluna){
        double tempProb = 0;
        double tempSeq = 0;
        double total = 0;
        if(coluna == 1){
            tempProb = prob1;
            tempSeq = probSeq1C;
        } else if(coluna == 2){
            tempProb = prob2;
            tempSeq = probSeq2C;
        } else if(coluna == 3){
            tempProb = prob3;
            tempSeq = probSeq3C;
        } else if (coluna == 4){
            tempProb = prob4;
            tempSeq = probSeq4C;
        } else if(coluna == 5){
            tempProb = prob5;
            tempSeq = probSeq5C;
        } else if(coluna == 6){
            tempProb = prob6;
            tempSeq = probSeq6C;
        }
        
        total = ((prob + tempProb + probSeqC + tempSeq)/4) ;
        return total;
    }
    
}