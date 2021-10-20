package probabilidade.de.número;

public class numero {

    int numero;
    double probabilidadeAnterior = 51;
    double[] quantSorteado = new double[200000];
    double quant=0;
    double porcentoMedia = 0;
    long inicioProb = 50;

    public numero(int n) {
        numero = n;
    }

    public double getQuantSorteado(double inicioSorteio) {
        double total = 0;
        for(int i = (int) (inicioSorteio - inicioProb); i < quantSorteado.length; i++){
            total = total + quantSorteado[i];
        }
        
        return total;
    }

    public void somarSorteado(double quantSorteiosRealizados) {
        quantSorteado[(int)quantSorteiosRealizados] = 1.0;
    }
    
    public void somarNada(double quantSorteiosRealizados){
        quantSorteado[(int)quantSorteiosRealizados] = 0.0;
    }

    public double getPorcentoMedia() {
        return porcentoMedia;
    }

    public void setPorcentoMedia(double porcentoMedia) {
        this.porcentoMedia = porcentoMedia;
    }

    public void calcularMedia(double quantSorteiosRealizados) {
        quant = 0;
        for( int i = (int)quantSorteiosRealizados; i > ((int)quantSorteiosRealizados - (int)probabilidadeAnterior); i--){
            quant = (quant + quantSorteado[i]);
        }
        porcentoMedia = quant / probabilidadeAnterior;
    }

}