package probabilidade.de.número2;

public class controlador {

    long quantSorteiosRealizados = 0; //Quantidade total de sorteios realizados
    long inicioSorteio = 5; //Início das tentativas em consideração ao número de sorteios realizados
    int quantTentativas = 1; //Apostas por sorteio
    int quantNumerosEscolhidos = 6; //Quantidade de números por aposta

    acertos acertos = new acertos();
    manipuladorVetores manipulador = new manipuladorVetores();
    
        
    public void inserir(int t1, int t2, int t3, int t4, int t5, int t6) {
        quantSorteiosRealizados++;
        manipulador.inserir(t1,t2,t3,t4,t5,t6,quantSorteiosRealizados);
        System.out.println("\n\n Sorteio " + quantSorteiosRealizados + ": " + t1 + " " + t2 + " " + t3 + " " + t4 + " " + t5 + " " + t6);
    }
    
    public void verificar(int temp[], int t1, int t2, int t3, int t4, int t5, int t6){
        int media = 0;
        System.out.print("Tentativa: ");
        for(int i = 0; i < 6; i++){
            if(temp[i] == t1 || temp[i] == t2 || temp[i] == t3 || temp[i] == t4 || temp[i] == t5 || temp[i] == t6){
                System.out.print(ConsoleColors.RED_BOLD + " " + temp[i] + ConsoleColors.RESET);
                media++;
            }else{
                System.out.print(" " + temp[i]);
            }
        }
        
        acertos.add(temp, t1, t2, t3, t4, t5, t6);
        
       System.out.println("\nAcertos: " + String.format("%.0f",acertos.acertos));
    }
}