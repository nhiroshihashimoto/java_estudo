package probabilidade.de.número;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class calculos {
    
    String file = "../../sorteios-sena.txt";
    String fileWriter = "../../writer.txt";

    long contagem = 1;

    int um = 0;
    int dois = 0;
    int tres = 0;
    int quatro = 0;
    int cinco = 0;
    int seis = 0;

    int umMinimo = 60;
    int doisMinimo = 60;
    int tresMinimo = 60;
    int quatroMinimo = 60;
    int cincoMinimo = 60;
    int seisMinimo = 60;

    int umMaximo = 0;
    int doisMaximo = 0;
    int tresMaximo = 0;
    int quatroMaximo = 0;
    int cincoMaximo = 0;
    int seisMaximo = 0;

    int umMedia = 0;
    int doisMedia = 0;
    int tresMedia = 0;
    int quatroMedia = 0;
    int cincoMedia = 0;
    int seisMedia = 0;

    public void dezenas(int t1, int t2, int t3, int t4, int t5, int t6) {
        if (t1 > umMaximo) {
            umMaximo = t1;
        } else if (t1 < umMinimo) {
            umMinimo = t1;
        }
        if (umMedia != 0) {
            umMedia = (umMedia + t1) / 2;
        } else {
            umMedia = t1;
        }

        if (t2 > doisMaximo) {
            doisMaximo = t2;
        } else if (t2 < doisMinimo) {
            doisMinimo = t2;
        }
        if (doisMedia != 0) {
            doisMedia = (doisMedia + t2) / 2;
        } else {
            doisMedia = t2;
        }

        if (t3 > tresMaximo) {
            tresMaximo = t3;
        } else if (t3 < tresMinimo) {
            tresMinimo = t3;
        }
        if (tresMedia != 0) {
            tresMedia = (tresMedia + t3) / 2;
        } else {
            tresMedia = t3;
        }

        if (t4 > quatroMaximo && t4 < 58) {
            quatroMaximo = t4;
        } else if (t4 < quatroMinimo) {
            quatroMinimo = t4;
        }
        if (quatroMedia != 0) {
            quatroMedia = (quatroMedia + t4) / 2;
        } else {
            quatroMedia = t4;
        }

        if (t5 > cincoMaximo) {
            cincoMaximo = t5;
        } else if (t5 < cincoMinimo) {
            cincoMinimo = t5;
        }
        if (cincoMedia != 0) {
            cincoMedia = (cincoMedia + t5) / 2;
        } else {
            cincoMedia = t5;
        }

        if (t6 > seisMaximo) {
            seisMaximo = t6;
        } else if (t6 < seisMinimo) {
            seisMinimo = t6;
        }
        if (seisMedia != 0) {
            seisMedia = (seisMedia + t6) / 2;
        } else {
            seisMedia = t6;
        }
    }

    public void sortear() throws FileNotFoundException, IOException {
        FileWriter arq = new FileWriter(fileWriter);
        PrintWriter gravar = new PrintWriter(arq);

        int ai = 1;
        int bi = 2;
        int ci = 5;
        int di = 13;
        int ei = 23;
        int fi = 35;

        int at = 26 + 1;
        int bt = 27 + 1;
        int ct = 47 + 1;
        int dt = 54 + 1;
        int et = 59 + 1;
        int ft = 60 + 1;

        int n1;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;

        for (int a = ai; a < at; a++) {    //Primeiro

            n1 = a;

            for (int b = bi; b < bt; b++) {    //Segundo

                if (a > b) {
                    b = a;
                }

                if (b == a) {
                    b++;
                }
                n2 = b;

                for (int c = ci; c < ct; c++) {    //Terceiro

                    if (b > c) {
                        c = b;
                    }

                    if (c == b) {
                        c++;
                    }

                    if (b - a == c - b) {
                        c++;
                    }

                    if (c == b) {
                        c++;
                    }

                    n3 = c;

                    for (int d = di; d < dt; d++) {    //Quarto

                        if (c > d) {
                            d = c;
                        }

                        if (d == c) {
                            d++;
                        }

                        if (d - c == c - b) {
                            d++;
                        }

                        if (d == c) {
                            d++;
                        }
                        n4 = d;

                        for (int e = ei; e < et; e++) {   //Quinto

                            if (d > e) {
                                e = d;
                            }

                            if (e == d) {
                                e++;
                            }

                            if (e - d == d - c) {
                                e++;
                            }

                            if (e == d) {
                                e++;
                            }

                            n5 = e;

                            for (int f = fi; f < ft; f++) {   //Sexto

                                if (e > f) {
                                    f = e;
                                }

                                if (f == e) {
                                    f++;
                                }

                                if (f - e == e - d) {
                                    f++;
                                }

                                if (f == e) {
                                    f++;
                                }
                                n6 = f;

                                //INICIO LEITURA
                                boolean swi = false;

                                if (f < e) {
                                    swi = true;
                                } else if (e < d) {
                                    swi = true;
                                } else if (d < c) {
                                    swi = true;
                                } else if (c < b) {
                                    swi = true;
                                } else if (b < a) {
                                    swi = true;
                                }

                                int t1 = 0;
                                int t2 = 0;
                                int t3 = 0;
                                int t4 = 0;
                                int t5 = 0;
                                int t6 = 0;

                                File arquivo = new File(file);
                                try (FileReader fr = new FileReader(arquivo); BufferedReader br = new BufferedReader(fr)) {
                                    String linha = null;
                                    long l = 0;

                                    while ((linha = br.readLine()) != null) {
                                        l++;
                                        String[] partes = linha.split(" ");

                                        for (int as = 2; as < 8; as++) {
                                            if (as == 2) {
                                                if ("01".equals(partes[as])) {
                                                    t1 = 1;
                                                } else if ("02".equals(partes[as])) {
                                                    t1 = 2;
                                                } else if ("03".equals(partes[as])) {
                                                    t1 = 3;
                                                } else if ("04".equals(partes[as])) {
                                                    t1 = 4;
                                                } else if ("05".equals(partes[as])) {
                                                    t1 = 5;
                                                } else if ("06".equals(partes[as])) {
                                                    t1 = 6;
                                                } else if ("07".equals(partes[as])) {
                                                    t1 = 7;
                                                } else if ("08".equals(partes[as])) {
                                                    t1 = 8;
                                                } else if ("09".equals(partes[as])) {
                                                    t1 = 9;
                                                } else {
                                                    t1 = Integer.parseInt(partes[as]);
                                                }
                                            }

                                            if (as == 3) {
                                                if ("01".equals(partes[as])) {
                                                    t2 = 1;
                                                } else if ("02".equals(partes[as])) {
                                                    t2 = 2;
                                                } else if ("03".equals(partes[as])) {
                                                    t2 = 3;
                                                } else if ("04".equals(partes[as])) {
                                                    t2 = 4;
                                                } else if ("05".equals(partes[as])) {
                                                    t2 = 5;
                                                } else if ("06".equals(partes[as])) {
                                                    t2 = 6;
                                                } else if ("07".equals(partes[as])) {
                                                    t2 = 7;
                                                } else if ("08".equals(partes[as])) {
                                                    t2 = 8;
                                                } else if ("09".equals(partes[as])) {
                                                    t2 = 9;
                                                } else {
                                                    t2 = Integer.parseInt(partes[as]);
                                                }
                                            }

                                            if (as == 4) {
                                                if ("01".equals(partes[as])) {
                                                    t3 = 1;
                                                } else if ("02".equals(partes[as])) {
                                                    t3 = 2;
                                                } else if ("03".equals(partes[as])) {
                                                    t3 = 3;
                                                } else if ("04".equals(partes[as])) {
                                                    t3 = 4;
                                                } else if ("05".equals(partes[as])) {
                                                    t3 = 5;
                                                } else if ("06".equals(partes[as])) {
                                                    t3 = 6;
                                                } else if ("07".equals(partes[as])) {
                                                    t3 = 7;
                                                } else if ("08".equals(partes[as])) {
                                                    t3 = 8;
                                                } else if ("09".equals(partes[as])) {
                                                    t3 = 9;
                                                } else {
                                                    t3 = Integer.parseInt(partes[as]);
                                                }
                                            }

                                            if (as == 5) {
                                                if ("01".equals(partes[as])) {
                                                    t4 = 1;
                                                } else if ("02".equals(partes[as])) {
                                                    t4 = 2;
                                                } else if ("03".equals(partes[as])) {
                                                    t4 = 3;
                                                } else if ("04".equals(partes[as])) {
                                                    t4 = 4;
                                                } else if ("05".equals(partes[as])) {
                                                    t4 = 5;
                                                } else if ("06".equals(partes[as])) {
                                                    t4 = 6;
                                                } else if ("07".equals(partes[as])) {
                                                    t4 = 7;
                                                } else if ("08".equals(partes[as])) {
                                                    t4 = 8;
                                                } else if ("09".equals(partes[as])) {
                                                    t4 = 9;
                                                } else {
                                                    t4 = Integer.parseInt(partes[as]);
                                                }
                                            }

                                            if (as == 6) {
                                                if ("01".equals(partes[as])) {
                                                    t5 = 1;
                                                } else if ("02".equals(partes[as])) {
                                                    t5 = 2;
                                                } else if ("03".equals(partes[as])) {
                                                    t5 = 3;
                                                } else if ("04".equals(partes[as])) {
                                                    t5 = 4;
                                                } else if ("05".equals(partes[as])) {
                                                    t5 = 5;
                                                } else if ("06".equals(partes[as])) {
                                                    t5 = 6;
                                                } else if ("07".equals(partes[as])) {
                                                    t5 = 7;
                                                } else if ("08".equals(partes[as])) {
                                                    t5 = 8;
                                                } else if ("09".equals(partes[as])) {
                                                    t5 = 9;
                                                } else {
                                                    t5 = Integer.parseInt(partes[as]);
                                                }
                                            }

                                            if (as == 7) {
                                                if ("01".equals(partes[as])) {
                                                    t6 = 1;
                                                } else if ("02".equals(partes[as])) {
                                                    t6 = 2;
                                                } else if ("03".equals(partes[as])) {
                                                    t6 = 3;
                                                } else if ("04".equals(partes[as])) {
                                                    t6 = 4;
                                                } else if ("05".equals(partes[as])) {
                                                    t6 = 5;
                                                } else if ("06".equals(partes[as])) {
                                                    t6 = 6;
                                                } else if ("07".equals(partes[as])) {
                                                    t6 = 7;
                                                } else if ("08".equals(partes[as])) {
                                                    t6 = 8;
                                                } else if ("09".equals(partes[as])) {
                                                    t6 = 9;
                                                } else {
                                                    t6 = Integer.parseInt(partes[as]);
                                                }
                                            }
                                            //Dentro do for (insira os ifs)

                                        }
                                        //Dentro do While (insira os ifs)

                                        //Teste de repetição
                                        int repeticao = 0;
                                        if (t1 == n1) {
                                            repeticao++;
                                        }
                                        if (t2 == n2) {
                                            repeticao++;
                                        }
                                        if (t3 == n3) {
                                            repeticao++;
                                        }
                                        if (t4 == n4) {
                                            repeticao++;
                                        }
                                        if (t5 == n5) {
                                            repeticao++;
                                        }
                                        if (t6 == n6) {
                                            repeticao++;
                                        }

                                        if (repeticao > 3) {
                                            swi = true;
                                        }

                                        //Teste de números pares
                                        if (n1 % 2 == 0 && n2 % 2 == 0 && n3 % 2 == 0 && n4 % 2 == 0 && n5 % 2 == 0 && n6 % 2 == 0) { //6 números pares
                                            swi = true;
                                        } else if (n1 % 2 > 0 && n2 % 2 > 0 && n3 % 2 > 0 && n4 % 2 > 0 && n5 % 2 > 0 && n6 % 2 > 0) { // 6 números ímpares
                                            swi = true;
                                        } else if (n1 % 2 > 0 && n2 % 2 > 0 && n3 % 2 > 0 && n4 % 2 > 0 && n5 % 2 > 0 && n6 % 2 > 0) { // 5 números ímpares
                                            swi = true;
                                        }

                                        //Teste de números divizíveis por 3
                                        if (n1 % 3 == 0 && n2 % 3 == 0 && n3 % 3 == 0 && n4 % 3 == 0 && n5 % 3 == 0 && n6 % 3 == 0) { //6 números pares
                                            swi = true;
                                        } else if (n1 % 3 > 0 && n2 % 3 > 0 && n3 % 3 > 0 && n4 % 3 > 0 && n5 % 3 > 0 && n6 % 3 > 0) { //6 números ímpares
                                            swi = true;
                                        }

                                        //Teste de números primos
                                        int primo = 0;
                                        int Primos = 0;
                                        for (int p = 2; p <= n1; p++) {
                                            if (n1 % p == 0) {
                                                primo++;
                                            }
                                        }

                                        if (primo == 1) {
                                            Primos++;
                                        }

                                        primo = 0;
                                        for (int p = 2; p <= n2; p++) {
                                            if (n2 % p == 0) {
                                                primo++;
                                            }
                                        }

                                        if (primo == 1) {
                                            Primos++;
                                        }

                                        primo = 0;
                                        for (int p = 2; p <= n3; p++) {
                                            if (n3 % p == 0) {
                                                primo++;
                                            }
                                        }

                                        if (primo == 1) {
                                            Primos++;
                                        }

                                        primo = 0;
                                        for (int p = 2; p <= n4; p++) {
                                            if (n4 % p == 0) {
                                                primo++;
                                            }
                                        }

                                        if (primo == 1) {
                                            Primos++;
                                        }

                                        primo = 0;
                                        for (int p = 2; p <= n5; p++) {
                                            if (n5 % p == 0) {
                                                primo++;
                                            }
                                        }

                                        if (primo == 1) {
                                            Primos++;
                                        }

                                        primo = 0;
                                        for (int p = 2; p <= n6; p++) {
                                            if (n6 % p == 0) {
                                                primo++;
                                            }
                                        }

                                        if (primo == 1) {
                                            Primos++;
                                        }

                                        if (Primos > 3) {
                                            swi = true;
                                        }

                                        //Teste de linhas
                                        //Teste de 1 linha
                                        if (n1 < 10 && n2 < 10 && n3 < 10 && n4 < 10 && n5 < 10 && n6 < 10) {
                                            swi = true;
                                        }

                                        if (n1 > 10 && n1 < 20
                                                && n2 > 10 && n2 < 20
                                                && n3 > 10 && n3 < 20
                                                && n4 > 10 && n4 < 20
                                                && n5 > 10 && n5 < 20
                                                && n6 > 10 && n6 < 20) {
                                            swi = true;
                                        }

                                        if (n1 > 20 && n1 < 30
                                                && n2 > 20 && n2 < 30
                                                && n3 > 20 && n3 < 30
                                                && n4 > 20 && n4 < 30
                                                && n5 > 20 && n5 < 30
                                                && n6 > 20 && n6 < 30) {
                                            swi = true;
                                        }

                                        if (n1 > 30 && n1 < 40
                                                && n2 > 30 && n2 < 40
                                                && n3 > 30 && n3 < 40
                                                && n4 > 30 && n4 < 40
                                                && n5 > 30 && n5 < 40
                                                && n6 > 30 && n6 < 40) {
                                            swi = true;
                                        }

                                        if (n1 > 40 && n1 < 50
                                                && n2 > 40 && n2 < 50
                                                && n3 > 40 && n3 < 50
                                                && n4 > 40 && n4 < 50
                                                && n5 > 40 && n5 < 50
                                                && n6 > 40 && n6 < 50) {
                                            swi = true;
                                        }

                                        if (n1 > 50 && n1 < 61
                                                && n2 > 50 && n2 < 61
                                                && n3 > 50 && n3 < 61
                                                && n4 > 50 && n4 < 61
                                                && n5 > 50 && n5 < 61
                                                && n6 > 50 && n6 < 61) {
                                            swi = true;
                                        }

                                        //Teste de 6 linhas
                                        if (n1 < 11
                                                && n2 > 10 && n2 < 21
                                                && n3 > 20 && n3 < 31
                                                && n4 > 30 && n4 < 41
                                                && n5 > 40 && n5 < 51
                                                && n6 > 50 && n6 < 60) {
                                            swi = true;
                                        }

                                        //Teste fibonacci
                                        int Fibonacci = 0;

                                        if (n1 == 1 || n1 == 2 || n1 == 3 || n1 == 5 || n1 == 8 || n1 == 13 || n1 == 21 || n1 == 34 || n1 == 55) {
                                            Fibonacci++;
                                        }
                                        if (n2 == 1 || n2 == 2 || n2 == 3 || n2 == 5 || n2 == 8 || n2 == 13 || n2 == 21 || n2 == 34 || n2 == 55) {
                                            Fibonacci++;
                                        }
                                        if (n3 == 1 || n3 == 2 || n3 == 3 || n3 == 5 || n3 == 8 || n3 == 13 || n3 == 21 || n3 == 34 || n3 == 55) {
                                            Fibonacci++;
                                        }
                                        if (n4 == 1 || n4 == 2 || n4 == 3 || n4 == 5 || n4 == 8 || n4 == 13 || n4 == 21 || n4 == 34 || n4 == 55) {
                                            Fibonacci++;
                                        }
                                        if (n5 == 1 || n5 == 2 || n5 == 3 || n5 == 5 || n5 == 8 || n5 == 13 || n5 == 21 || n5 == 34 || n5 == 55) {
                                            Fibonacci++;
                                        }
                                        if (n6 == 1 || n6 == 2 || n6 == 3 || n6 == 5 || n6 == 8 || n6 == 13 || n6 == 21 || n6 == 34 || n6 == 55) {
                                            Fibonacci++;
                                        }

                                        if (Fibonacci > 3) {
                                            swi = true;
                                        }

                                        //Teste quadrático
                                        int quadrático = 0;

                                        if (n1 == 1 || n1 == 4 || n1 == 9 || n1 == 16 || n1 == 25 || n1 == 36 || n1 == 49) {
                                            quadrático++;
                                        }

                                        if (n2 == 1 || n2 == 4 || n2 == 9 || n2 == 16 || n2 == 25 || n2 == 36 || n2 == 49) {
                                            quadrático++;
                                        }

                                        if (n3 == 1 || n3 == 4 || n3 == 9 || n3 == 16 || n3 == 25 || n3 == 36 || n3 == 49) {
                                            quadrático++;
                                        }

                                        if (n4 == 1 || n4 == 4 || n4 == 9 || n4 == 16 || n4 == 25 || n4 == 36 || n4 == 49) {
                                            quadrático++;
                                        }

                                        if (n5 == 1 || n5 == 4 || n5 == 9 || n5 == 16 || n5 == 25 || n5 == 36 || n5 == 49) {
                                            quadrático++;
                                        }

                                        if (n6 == 1 || n6 == 4 || n6 == 9 || n6 == 16 || n6 == 25 || n6 == 36 || n6 == 49) {
                                            quadrático++;
                                        }

                                        if (quadrático > 2) {
                                            swi = true;
                                        }

                                    }

                                }
                                //Sexto for

                                if (swi == false) {
                                    gravar.println(contagem + " Sorteio: " + n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
                                    System.out.println(contagem + " Sorteio: " + n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
                                    contagem++;
                                }
                            }

                        }

                    }

                }

            }

        }
        arq.close();
    }

}
