package probabilidade.de.número;

public class numero {

    int numero;
    double probabilidadeAnterior = 51;
    double quantSorteado = 0;
    double porcentoMedia = 0;
    long inicioProb = 1;
    long espacoMax=0;
    long espacoMin=100000000;
    long espacoAtual;
    double espacoMedia=0;
    long ultSorteio=0;

    public numero(int n) {
        numero = n;
    }

    public double getQuantSorteado(double inicioSorteio) {
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

}