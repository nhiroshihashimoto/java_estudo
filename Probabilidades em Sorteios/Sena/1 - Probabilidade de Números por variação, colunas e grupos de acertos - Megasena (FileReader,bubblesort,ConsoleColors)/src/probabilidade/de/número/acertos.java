package probabilidade.de.número;

public class acertos {
    int n1 = 0;
    int n2 = 0;
    int n3 = 0;
    int n4 = 0;
    int n5 = 0;
    int n6 = 0;
    
    int completo = 0;
    
    double mediaAcerto = 0.0f;
    
    public void calcMedia(double media){
        if(mediaAcerto == 0.0f){
            mediaAcerto = media;
        } else{
            mediaAcerto = mediaAcerto + media / 2;
        }
    }
    
    public void addCompleto(){
        this.completo++;
    }
    
    
}
