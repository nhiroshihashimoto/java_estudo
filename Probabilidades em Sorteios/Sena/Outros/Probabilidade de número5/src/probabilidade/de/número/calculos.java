package probabilidade.de.número;

import java.util.ArrayList;
import java.util.Random;

public class calculos {

    long quantSorteiosRealizados = 0; //Quantidade total de sorteios realizados
    long inicioSorteio = 1; //Início das tentativas em consideração ao número de sorteios realizados
    long acertosNumero = 0; //Acertos por número previsto pela probabilidade
    double acertoSequenciaPorc = 0; //Acertos por sequencia previsto pela probabilidade
    long acertosSequenciasTotais = 0; // Acerto da sequência completa
    int quantTrocadeNumero = 0; //Quantidade de troca dos números com menor probabilidade
    int quantTentativas = 1; //Sorteios realizados
    int quantNumerosEscolhidos = 6; //Números jogados
    String prob = "";

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
    
    
    int umDez = 0;
    int doisDez = 0;
    int tresDez = 0;
    int quatroDez = 0;
    int cincoDez = 0;
    int seisDez = 0;
    
    int umVinte = 0;
    int doisVinte = 0;
    int tresVinte = 0;
    int quatroVinte = 0;
    int cincoVinte = 0;
    int seisVinte = 0;
    
    int umTrinta = 0;
    int doisTrinta = 0;
    int tresTrinta = 0;
    int quatroTrinta = 0;
    int cincoTrinta = 0;
    int seisTrinta = 0;
    
    int umQuarenta = 0;
    int doisQuarenta = 0;
    int tresQuarenta = 0;
    int quatroQuarenta = 0;
    int cincoQuarenta = 0;
    int seisQuarenta = 0;
    
    int umCinquenta = 0;
    int doisCinquenta = 0;
    int tresCinquenta = 0;
    int quatroCinquenta = 0;
    int cincoCinquenta = 0;
    int seisCinquenta = 0;
    
    int umSessenta = 0;
    int doisSessenta = 0;
    int tresSessenta = 0;
    int quatroSessenta = 0;
    int cincoSessenta = 0;
    int seisSessenta = 0;
    

    numero numero1 = new numero(1);
    numero numero2 = new numero(2);
    numero numero3 = new numero(3);
    numero numero4 = new numero(4);
    numero numero5 = new numero(5);
    numero numero6 = new numero(6);
    numero numero7 = new numero(7);
    numero numero8 = new numero(8);
    numero numero9 = new numero(9);
    numero numero10 = new numero(10);
    numero numero11 = new numero(11);
    numero numero12 = new numero(12);
    numero numero13 = new numero(13);
    numero numero14 = new numero(14);
    numero numero15 = new numero(15);
    numero numero16 = new numero(16);
    numero numero17 = new numero(17);
    numero numero18 = new numero(18);
    numero numero19 = new numero(19);
    numero numero20 = new numero(20);
    numero numero21 = new numero(21);
    numero numero22 = new numero(22);
    numero numero23 = new numero(23);
    numero numero24 = new numero(24);
    numero numero25 = new numero(25);
    numero numero26 = new numero(26);
    numero numero27 = new numero(27);
    numero numero28 = new numero(28);
    numero numero29 = new numero(29);
    numero numero30 = new numero(30);
    numero numero31 = new numero(31);
    numero numero32 = new numero(32);
    numero numero33 = new numero(33);
    numero numero34 = new numero(34);
    numero numero35 = new numero(35);
    numero numero36 = new numero(36);
    numero numero37 = new numero(37);
    numero numero38 = new numero(38);
    numero numero39 = new numero(39);
    numero numero40 = new numero(40);
    numero numero41 = new numero(41);
    numero numero42 = new numero(42);
    numero numero43 = new numero(43);
    numero numero44 = new numero(44);
    numero numero45 = new numero(45);
    numero numero46 = new numero(46);
    numero numero47 = new numero(47);
    numero numero48 = new numero(48);
    numero numero49 = new numero(49);
    numero numero50 = new numero(50);
    numero numero51 = new numero(51);
    numero numero52 = new numero(52);
    numero numero53 = new numero(53);
    numero numero54 = new numero(54);
    numero numero55 = new numero(55);
    numero numero56 = new numero(56);
    numero numero57 = new numero(57);
    numero numero58 = new numero(58);
    numero numero59 = new numero(59);
    numero numero60 = new numero(60);

    numero[] numeros = {numero1, numero2, numero3, numero4, numero5, numero6, numero7, numero8, numero9, numero10,
        numero11, numero12, numero13, numero14, numero15, numero16, numero17, numero18, numero19, numero20,
        numero21, numero22, numero23, numero24, numero25, numero26, numero27, numero28, numero29, numero30,
        numero31, numero32, numero33, numero34, numero35, numero36, numero37, numero38, numero39, numero40,
        numero41, numero42, numero43, numero44, numero45, numero46, numero47, numero48, numero49, numero50,
        numero51, numero52, numero53, numero54, numero55, numero56, numero57, numero58, numero59, numero60};
    
    marca marca1 = new marca(1);
    marca marca2 = new marca(2);
    marca marca3 = new marca(3);
    marca marca4 = new marca(4);
    marca marca5 = new marca(5);
    marca marca6 = new marca(6);
    marca marca7 = new marca(7);
    marca marca8 = new marca(8);
    marca marca9 = new marca(9);
    marca marca10 = new marca(10);
    marca marca11 = new marca(11);
    marca marca12 = new marca(12);
    marca marca13 = new marca(13);
    marca marca14 = new marca(14);
    marca marca15 = new marca(15);
    marca marca16 = new marca(16);
    marca marca17 = new marca(17);
    marca marca18 = new marca(18);
    marca marca19 = new marca(19);
    marca marca20 = new marca(20);
    marca marca21 = new marca(21);
    marca marca22 = new marca(22);
    marca marca23 = new marca(23);
    marca marca24 = new marca(24);
    marca marca25 = new marca(25);
    marca marca26 = new marca(26);
    marca marca27 = new marca(27);
    marca marca28 = new marca(28);
    marca marca29 = new marca(29);
    marca marca30 = new marca(30);
    marca marca31 = new marca(31);
    marca marca32 = new marca(32);
    marca marca33 = new marca(33);
    marca marca34 = new marca(34);
    marca marca35 = new marca(35);
    marca marca36 = new marca(36);
    marca marca37 = new marca(37);
    marca marca38 = new marca(38);
    marca marca39 = new marca(39);
    marca marca40 = new marca(40);
    marca marca41 = new marca(41);
    marca marca42 = new marca(42);
    marca marca43 = new marca(43);
    marca marca44 = new marca(44);
    marca marca45 = new marca(45);
    marca marca46 = new marca(46);
    marca marca47 = new marca(47);
    marca marca48 = new marca(48);
    marca marca49 = new marca(49);
    marca marca50 = new marca(50);
    marca marca51 = new marca(51);
    marca marca52 = new marca(52);
    marca marca53 = new marca(53);
    marca marca54 = new marca(54);
    marca marca55 = new marca(55);
    marca marca56 = new marca(56);
    marca marca57 = new marca(57);
    marca marca58 = new marca(58);
    marca marca59 = new marca(59);
    marca marca60 = new marca(60);
    
    
    marca[] marcas = {marca1, marca2, marca3, marca4, marca5, marca6, marca7, marca8, marca9, marca10,
        marca11, marca12, marca13, marca14, marca15, marca16, marca17, marca18, marca19, marca20,
        marca21, marca22, marca23, marca24, marca25, marca26, marca27, marca28, marca29, marca30,
        marca31, marca32, marca33, marca34, marca35, marca36, marca37, marca38, marca39, marca40,
        marca41, marca42, marca43, marca44, marca45, marca46, marca47, marca48, marca49, marca50,
        marca51, marca52, marca53, marca54, marca55, marca56, marca57, marca58, marca59, marca60};
    

    public void atualizar(int t1, int t2, int t3, int t4, int t5, int t6) {

        if (quantSorteiosRealizados > inicioSorteio) {
            sortear(t1, t2, t3, t4, t5, t6);
        }

        for (int n = 0; n < 60; n++) {
            if (t1 == numeros[n].numero) {
                numeros[n].somarSorteado(quantSorteiosRealizados);
                marcas[n].quantidade++;
            } else if (t2 == numeros[n].numero) {
                numeros[n].somarSorteado(quantSorteiosRealizados);
                marcas[n].quantidade++;
            } else if (t3 == numeros[n].numero) {
                numeros[n].somarSorteado(quantSorteiosRealizados);
                marcas[n].quantidade++;
            } else if (t4 == numeros[n].numero) {
                numeros[n].somarSorteado(quantSorteiosRealizados);
                marcas[n].quantidade++;
            } else if (t5 == numeros[n].numero) {
                numeros[n].somarSorteado(quantSorteiosRealizados);
                marcas[n].quantidade++;
            } else if (t6 == numeros[n].numero) {
                numeros[n].somarSorteado(quantSorteiosRealizados);
                marcas[n].quantidade++;
            } else {
                numeros[n].somarNada(quantSorteiosRealizados);
            }
            if (inicioSorteio < quantSorteiosRealizados) {
                numeros[n].calcularMedia(quantSorteiosRealizados);
                numeros[n].probabilidadeAnterior++;
                //System.out.println(numeros());
            }
        }
        
        if(t1 < 11){
            umDez++;
        } else if(t1 < 21){
            umVinte++;
        } else if(t1 < 31){
            umTrinta++;
        } else if(t1 < 41){
            umQuarenta++;
        } else if(t1 < 51){
            umCinquenta++;
        } else if(t1 < 61){
            umSessenta++;
        }
        
        if(t2 < 11){
            doisDez++;
        } else if(t2 < 21){
            doisVinte++;
        } else if(t2 < 31){
            doisTrinta++;
        } else if(t2 < 41){
            doisQuarenta++;
        } else if(t2 < 51){
            doisCinquenta++;
        } else if(t2 < 61){
            doisSessenta++;
        }
        
        if(t3 < 11){
            tresDez++;
        } else if(t3 < 21){
            tresVinte++;
        } else if(t3 < 31){
            tresTrinta++;
        } else if(t3 < 41){
            tresQuarenta++;
        } else if(t3 < 51){
            tresCinquenta++;
        } else if(t3 < 61){
            tresSessenta++;
        }
        
        if(t4 < 11){
            quatroDez++;
        } else if(t4 < 21){
            quatroVinte++;
        } else if(t4 < 31){
            quatroTrinta++;
        } else if(t4 < 41){
            quatroQuarenta++;
        } else if(t4 < 51){
            quatroCinquenta++;
        } else if(t4 < 61){
            quatroSessenta++;
        }
        
        if(t5 < 11){
            cincoDez++;
        } else if(t5 < 21){
            cincoVinte++;
        } else if(t5 < 31){
            cincoTrinta++;
        } else if(t5 < 41){
            cincoQuarenta++;
        } else if(t5 < 51){
            cincoCinquenta++;
        } else if(t5 < 61){
            cincoSessenta++;
        }
        
        if(t6 < 11){
            seisDez++;
        } else if(t5 < 21){
            seisVinte++;
        } else if(t5 < 31){
            seisTrinta++;
        } else if(t5 < 41){
            seisQuarenta++;
        } else if(t5 < 51){
            seisCinquenta++;
        } else if(t5 < 61){
            seisSessenta++;
        }
        
        
        
        
        dezenas(t1, t2, t3, t4, t5, t6);
        quantSorteiosRealizados++;
    }

    public void sortearBackup(int t1, int t2, int t3, int t4, int t5, int t6) {

        Random numeroRandom = new Random();

        long acertosCada = 0;

        for (int b = 1; b <= (quantTentativas); b++) {
            System.out.println("\nTentativa: " + b);
            int acertosSequencia = 0;

            int random = numeroRandom.nextInt(61);
            ArrayList teste = new ArrayList();

            while (random == 0) {
                random = numeroRandom.nextInt(61);
            }

            int[] n = new int[quantNumerosEscolhidos];

            for (int c = 0; c < quantNumerosEscolhidos; c++) {
                random = numeroRandom.nextInt(61);

                while (teste.contains(random) || random == 0) {
                    random = numeroRandom.nextInt(61);
                }
                n[c] = random;
                teste.add(random);
            }

            for (int a = 0; a < quantNumerosEscolhidos; a++) {

                if (n[a] == t1) {
                    System.out.print("'" + n[a] + "' ");
                    acertosCada++;
                    acertosSequencia++;
                } else if (n[a] == t2) {
                    System.out.print("'" + n[a] + "' ");
                    acertosCada++;
                    acertosSequencia++;
                } else if (n[a] == t3) {
                    System.out.print("'" + n[a] + "' ");
                    acertosCada++;
                    acertosSequencia++;
                } else if (n[a] == t4) {
                    System.out.print("'" + n[a] + "' ");
                    acertosCada++;
                    acertosSequencia++;
                } else if (n[a] == t5) {
                    System.out.print("'" + n[a] + "' ");
                    acertosCada++;
                    acertosSequencia++;
                } else if (n[a] == t6) {
                    System.out.print("'" + n[a] + "' ");
                    acertosCada++;
                    acertosSequencia++;
                } else {
                    System.out.print(n[a] + " ");
                }

            }
            if (acertosSequencia == 6) {
                acertosSequenciasTotais++;
                System.out.println("Acertô Mizeravi!");
            }
        }

        acertosNumero += acertosCada;
        acertoSequenciaPorc += (acertosCada / 6);
        if (acertoSequenciaPorc > 0) {
            acertoSequenciaPorc = acertoSequenciaPorc / 2;
        }

    }

    public void sortear(int t1, int t2, int t3, int t4, int t5, int t6) {
        for (int i = 0; i < numeros.length; i++) {
            numero aux = numeros[i];
            int j = i;

            while ((j > 0) && (numeros[j - 1].porcentoMedia < aux.porcentoMedia)) {
                numeros[j] = numeros[j - 1];
                j -= 1;
            }
            numeros[j] = aux;
        }

        long acertosCada = 0;
        
        int teste;
        int num[] = new int[6];
        System.out.println("\n");
        
        for(int r = 0; r < 3; r++){
        teste = marcas[r].numero;
        num[r] = numeros[teste - 1].numero;
        
        if(r == 0 && marcas[r].numero > 45 ){
            teste = marcas[r+3].numero;
            num[r] = numeros[teste - 1].numero;
        } else if(r == 1 && marcas[r].numero > 51 || marcas[r].numero < 2){
            teste = marcas[r+4].numero;
            num[r] = numeros[teste - 1].numero;
        } else if(r == 2 && marcas[r].numero > 56 || marcas[r].numero < 3){
            teste = marcas[r+5].numero;
            num[r] = numeros[teste - 1].numero;
        }
        
            System.out.println(" NUM: " + num[r]);
        }
        
        for(int r = 56; r < 59; r++){
        teste = marcas[r-1].numero;
        num[r-53] = numeros[teste - 1].numero;
            System.out.println(" NUM: " + num[r-53]);
        }
        
        for (int i = 0; i < marcas.length; i++) {
            marca aux = marcas[i];
            int j = i;

            while ((j > 0) && (marcas[j - 1].quantidade) > aux.quantidade) {
                marcas[j] = marcas[j - 1];
                j -= 1;
            }
            marcas[j] = aux;
        }

            for (int c = 0; c < 6; c++) {
                if (num[c] == t1) {
                    acertosCada++;
                } else if (num[c] == t2) {
                    acertosCada++;
                } else if (num[c] == t3) {
                    acertosCada++;
                } else if (num[c] == t4) {
                    acertosCada++;
                } else if (num[c] == t5) {
                    acertosCada++;
                } else if (num[c] == t6) {
                    acertosCada++;
                }
            }
        System.out.println("\n");
        
        for(int p = 0; p < 6; p++){
        System.out.println("Numero " + (p + 1)+ " :" + marcas[p].numero);
        }

        acertosNumero += acertosCada;
        acertoSequenciaPorc += (acertosCada / 6);
        if (acertoSequenciaPorc > 0) {
            acertoSequenciaPorc = acertoSequenciaPorc / 2;
        }

        if (acertosCada == 6) {
            System.out.println("\n ********* Acertô Mizeravi! *********");
            acertosSequenciasTotais++;
        }

        System.out.println("\nNumero:" + numeros[0].numero + "  Probabilidade:" + numeros[0].getQuantSorteado(quantSorteiosRealizados)
                + "\nNumero:" + numeros[1].numero + "  Probabilidade:" + numeros[1].getQuantSorteado(quantSorteiosRealizados)
                + "\nNumero:" + numeros[2].numero + "  Probabilidade:" + numeros[2].getQuantSorteado(quantSorteiosRealizados)
                + "\nNumero:" + numeros[3].numero + "  Probabilidade:" + numeros[3].getQuantSorteado(quantSorteiosRealizados)
                + "\nNumero:" + numeros[4].numero + "  Probabilidade:" + numeros[4].getQuantSorteado(quantSorteiosRealizados)
                + "\nNumero:" + numeros[5].numero + "  Probabilidade:" + numeros[5].getQuantSorteado(quantSorteiosRealizados));
    }

    public String print() {
        return ("Números acertados: " + acertosNumero + "\nAcertos em porcentagem: " + ((acertosNumero*100) / (quantSorteiosRealizados*6)) + "%\n Acertos completos: " + acertosSequenciasTotais);
    }

    public String numeros() {

        for (int v = 0; v < 60; v++) {
            prob = prob + "\nNúmero: " + numeros[v].numero + "   Porcentagem: " + numeros[v].getQuantSorteado(quantSorteiosRealizados);
        }

        prob = prob + "\n\nMARCA\n";
        for (int v = 0; v < 60; v++) {
            prob = prob + "\nMarca: " + marcas[v].numero + "   Quantidade: " + marcas[v].quantidade;
        }
        
        prob = prob + "\n\nEspaço Máximo, Atual e Média\n";
        for (int v = 0; v < 60; v++) {
            prob = prob + "\nNúmero: " + numeros[v].numero + "   Máximo: " + numeros[v].espacoMax + "   Atual: " + numeros[v].espacoAtual + "   Média: " + numeros[v].porcentoMedia;
        }
        
        prob = prob + "\n\nCampo 1  - Zero: " + umDez + "\nCampo 1 - Dez: " + umVinte + ""
                + "\nCampo 1 - Vinte: " + umTrinta + "\nCampo 1 - Trinta: " + umQuarenta + ""
                + "\nCampo 1 - Quarenta: " + umCinquenta + "\nCampo 1 - Cinquenta: " + umSessenta;
        
        prob = prob + "\n\nCampo 2  - Zero: " + doisDez + "\nCampo 2 - Dez: " + doisVinte + ""
                + "\nCampo 2 - Vinte: " + doisTrinta + "\nCampo 2 - Trinta: " + doisQuarenta + ""
                + "\nCampo 2 - Quarenta: " + doisCinquenta + "\nCampo 2 - Cinquenta: " + doisSessenta;
        
        prob = prob + "\n\nCampo 3  - Zero: " + tresDez + "\nCampo 3 - Dez: " + tresVinte + ""
                + "\nCampo 3 - Vinte: " + tresTrinta + "\nCampo 3 - Trinta: " + tresQuarenta + ""
                + "\nCampo 3 - Quarenta: " + tresCinquenta + "\nCampo 3 - Cinquenta: " + tresSessenta;
        
        prob = prob + "\n\nCampo 4  - Zero: " + quatroDez + "\nCampo 4 - Dez: " + quatroVinte + ""
                + "\nCampo 4 - Vinte: " + quatroTrinta + "\nCampo 4 - Trinta: " + quatroQuarenta + ""
                + "\nCampo 4 - Quarenta: " + quatroCinquenta + "\nCampo 4 - Cinquenta: " + quatroSessenta;
        
        prob = prob + "\n\nCampo 5  - Zero: " + cincoDez + "\nCampo 5 - Dez: " + cincoVinte + ""
                + "\nCampo 5 - Vinte: " + cincoTrinta + "\nCampo 5 - Trinta: " + cincoQuarenta + ""
                + "\nCampo 5 - Quarenta: " + cincoCinquenta + "\nCampo 5 - Cinquenta: " + cincoSessenta;
        
        prob = prob + "\n\nCampo 6  - Zero: " + seisDez + "\nCampo 6 - Dez: " + seisVinte + ""
                + "\nCampo 6 - Vinte: " + seisTrinta + "\nCampo 6 - Trinta: " + seisQuarenta + ""
                + "\nCampo 6 - Quarenta: " + seisCinquenta + "\nCampo 6 - Cinquenta: " + seisSessenta;
        
        
        
        return prob;
    }

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
        } else if (t4 < quatroMinimo && t4 > 10) {
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

}
