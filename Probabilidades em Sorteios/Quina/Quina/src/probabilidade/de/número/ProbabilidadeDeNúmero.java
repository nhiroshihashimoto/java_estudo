package probabilidade.de.número;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProbabilidadeDeNúmero {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        int t1 = 0;
        int t2 = 0;
        int t3 = 0;
        int t4 = 0;
        int t5 = 0;
        

        calculos ca1 = new calculos();
        
        //do{
            
        int quantSorteios = 1;

        File arquivo = new File("../sorteios-quina.txt");
        try (FileReader fr = new FileReader(arquivo); BufferedReader br = new BufferedReader(fr)) {
            String linha = null;
            long l = 0;

            while ((linha = br.readLine()) != null) {
                l++;
                String[] partes = linha.split(" ");

                for (int a = 2; a < 7; a++) {
                    if (a == 2) {
                        if ("01".equals(partes[a])) {
                            t1 = 1;
                        } else if ("02".equals(partes[a])) {
                            t1 = 2;
                        } else if ("03".equals(partes[a])) {
                            t1 = 3;
                        } else if ("04".equals(partes[a])) {
                            t1 = 4;
                        } else if ("05".equals(partes[a])) {
                            t1 = 5;
                        } else if ("06".equals(partes[a])) {
                            t1 = 6;
                        } else if ("07".equals(partes[a])) {
                            t1 = 7;
                        } else if ("08".equals(partes[a])) {
                            t1 = 8;
                        } else if ("09".equals(partes[a])) {
                            t1 = 9;
                        } else {
                            t1 = Integer.parseInt(partes[a]);
                        }
                    }

                    if (a == 3) {
                        if ("01".equals(partes[a])) {
                            t2 = 1;
                        } else if ("02".equals(partes[a])) {
                            t2 = 2;
                        } else if ("03".equals(partes[a])) {
                            t2 = 3;
                        } else if ("04".equals(partes[a])) {
                            t2 = 4;
                        } else if ("05".equals(partes[a])) {
                            t2 = 5;
                        } else if ("06".equals(partes[a])) {
                            t2 = 6;
                        } else if ("07".equals(partes[a])) {
                            t2 = 7;
                        } else if ("08".equals(partes[a])) {
                            t2 = 8;
                        } else if ("09".equals(partes[a])) {
                            t2 = 9;
                        } else {
                            t2 = Integer.parseInt(partes[a]);
                        }
                    }

                    if (a == 4) {
                        if ("01".equals(partes[a])) {
                            t3 = 1;
                        } else if ("02".equals(partes[a])) {
                            t3 = 2;
                        } else if ("03".equals(partes[a])) {
                            t3 = 3;
                        } else if ("04".equals(partes[a])) {
                            t3 = 4;
                        } else if ("05".equals(partes[a])) {
                            t3 = 5;
                        } else if ("06".equals(partes[a])) {
                            t3 = 6;
                        } else if ("07".equals(partes[a])) {
                            t3 = 7;
                        } else if ("08".equals(partes[a])) {
                            t3 = 8;
                        } else if ("09".equals(partes[a])) {
                            t3 = 9;
                        } else {
                            t3 = Integer.parseInt(partes[a]);
                        }
                    }

                    if (a == 5) {
                        if ("01".equals(partes[a])) {
                            t4 = 1;
                        } else if ("02".equals(partes[a])) {
                            t4 = 2;
                        } else if ("03".equals(partes[a])) {
                            t4 = 3;
                        } else if ("04".equals(partes[a])) {
                            t4 = 4;
                        } else if ("05".equals(partes[a])) {
                            t4 = 5;
                        } else if ("06".equals(partes[a])) {
                            t4 = 6;
                        } else if ("07".equals(partes[a])) {
                            t4 = 7;
                        } else if ("08".equals(partes[a])) {
                            t4 = 8;
                        } else if ("09".equals(partes[a])) {
                            t4 = 9;
                        } else {
                            t4 = Integer.parseInt(partes[a]);
                        }
                    }

                    if (a == 6) {
                        if ("01".equals(partes[a])) {
                            t5 = 1;
                        } else if ("02".equals(partes[a])) {
                            t5 = 2;
                        } else if ("03".equals(partes[a])) {
                            t5 = 3;
                        } else if ("04".equals(partes[a])) {
                            t5 = 4;
                        } else if ("05".equals(partes[a])) {
                            t5 = 5;
                        } else if ("06".equals(partes[a])) {
                            t5 = 6;
                        } else if ("07".equals(partes[a])) {
                            t5 = 7;
                        } else if ("08".equals(partes[a])) {
                            t5 = 8;
                        } else if ("09".equals(partes[a])) {
                            t5 = 9;
                        } else {
                            t5 = Integer.parseInt(partes[a]);
                        }
                    }
                }
                System.out.print("\n\n Sorteio " + quantSorteios + ": " + t1 + " " + t2 + " " + t3 + " " + t4 + " " + t5);
                quantSorteios++;
                ca1.atualizar(t1, t2, t3, t4, t5);
                
            }
            System.out.println("\n\nTotal de sorteios analisados: " + l );
            
            
            ca1.sortear(t1, t2, t3, t4, t5);
            
        }
        ca1.mostrarQuantidadeNumerosSorteado();
        ca1.mostrarDadosFinais();
    //} while(((ca1.acertosNumero*100) / (ca1.quantSorteiosRealizados*6)) != 100);
        } 

}
