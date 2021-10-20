package probabilidade.de.número;

public class numero {

    int numero;
    double probabilidadeAnterior = 51;
    double quantSorteado = 0;
    double prob = 0;
    double porcentoMedia = 0;
    long inicioProb = 1;
    long espacoMax=0;
    long espacoMin=100000000;
    long espacoAtual;
    double espacoMedia=0;
    long ultSorteio=0;
    double sp1 = 0;
    double sp2 = 0;
    double sp3 = 0;
    double sp4 = 0;
    double sp5 = 0;
    double sp6 = 0;
    double tt = 0;

    public numero(int n) {
        numero = n;
    }

    public double getQuantSorteado() {
        return quantSorteado;
    }

    public void somarSorteado(long quantSorteiosRealizados) {
        espacoAtual=0;
        if(quantSorteiosRealizados - ultSorteio > espacoMax){
            espacoMax = quantSorteiosRealizados - ultSorteio;
        } else if(quantSorteiosRealizados - ultSorteio < espacoMin){
            espacoMin = quantSorteiosRealizados - ultSorteio;
        }
        ultSorteio = quantSorteiosRealizados;
        quantSorteado++;
        espacoMedia = (espacoMedia + (quantSorteiosRealizados - ultSorteio)) / 2;
    }
    
    public void somarNada(long quantSorteiosRealizados){
        espacoAtual = quantSorteiosRealizados - ultSorteio;
    }

    public double getPorcentoMedia() {
        return porcentoMedia;
    }

    public void setPorcentoMedia(double porcentoMedia) {
        this.porcentoMedia = porcentoMedia;
    }

    public void calcularMedia(long quantSorteiosRealizados) {
        porcentoMedia = quantSorteado / quantSorteiosRealizados;
        porcentoMedia = (porcentoMedia + (espacoMedia*100 / espacoAtual)) / 2;
    }
    
    public void addSpace(int n){
        tt++;
        switch (n) {
            case 1:
                sp1 = n;
                break;
            case 2:
                sp2 = n;
                break;
            case 3:
                sp3 = n;
                break;
            case 4:
                sp4 = n;
                break;
            case 5:
                sp5 = n;
                break;
            case 6:
                sp6 = n;
                break;
            default:
                break;
        }
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
}