package probabilidade.de.número2;

public class acertos {
    int n1 = 0;
    int n2 = 0;
    int n3 = 0;
    int n4 = 0;
    int n5 = 0;
    int n6 = 0;
    
    int completo = 0;
    int acertosTotais = 0;
    double acertos = 0;
    
    public void add(int temp[], int t1, int t2, int t3, int t4, int t5, int t6){
        acertos = 0;
        
        if(temp[0] == t1 || temp[0] == t2 || temp[0] == t3 || temp[0] == t4 || temp[0] == t5 || temp[0] == t6){
            n1++;
            acertos++;
            acertosTotais++;
        } 
        if(temp[1] == t1 || temp[1] == t2 || temp[1] == t3 || temp[1] == t4 || temp[1] == t5 || temp[1] == t6){
            n2++;
            acertos++;
            acertosTotais++;
        } 
        if(temp[2] == t1 || temp[2] == t2 || temp[2] == t3 || temp[2] == t4 || temp[2] == t5 || temp[2] == t6){
            n3++;
            acertos++;
            acertosTotais++;
        } 
        if(temp[3] == t1 || temp[3] == t2 || temp[3] == t3 || temp[3] == t4 || temp[3] == t5 || temp[3] == t6){
            n4++;
            acertos++;
            acertosTotais++;
        } 
        if(temp[4] == t1 || temp[4] == t2 || temp[4] == t3 || temp[4] == t4 || temp[4] == t5 || temp[4] == t6){
            n5++;
            acertos++;
            acertosTotais++;
        } 
        if(temp[5] == t1 || temp[5] == t2 || temp[5] == t3 || temp[5] == t4 || temp[5] == t5 || temp[5] == t6){
            n6++;
            acertos++;
            acertosTotais++;
        }
        
        if(temp[0] == t1 && temp[1] == t2 && temp[2] == t3 && temp[3] == t4 && temp[4] == t5 && temp[5] == t6){
            addCompleto();
        }
        
    }
    
    public void addCompleto(){
        this.completo++;
    }
    
}
