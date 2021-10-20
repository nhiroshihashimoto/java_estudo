package probabilidade.de.número2;

import java.io.IOException;

public class ProbabilidadeDeNúmero2 {

    public static void main(String[] args) throws IOException {
        
        controlador control = new controlador();
        arquivo arquivo = new arquivo();
        
        arquivo.lerArquivo("../sorteios-sena.txt", control);
        
        control.manipulador.exibirColuna2(3, control.quantSorteiosRealizados);
        //control.manipulador.exibirVetorPrincipal(control.quantSorteiosRealizados);
        
    }
    
}
