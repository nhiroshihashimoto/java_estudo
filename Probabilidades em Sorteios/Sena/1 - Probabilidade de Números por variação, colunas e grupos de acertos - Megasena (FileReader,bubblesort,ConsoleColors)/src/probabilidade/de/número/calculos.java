package probabilidade.de.número;

public class calculos {

    long quantSorteiosRealizados = 0; //Quantidade total de sorteios realizados
    long inicioSorteio = 5; //Início das tentativas em consideração ao número de sorteios realizados
    long acertosNumero = 0; //Acertos por número previsto pela probabilidade
    double acertoSequenciaPorc = 0; //Acertos por sequencia previsto pela probabilidade
    long acertosSequenciasTotais = 0; // Acerto da sequência completa
    int quantTrocadeNumero = 0; //Quantidade de troca dos números com menor probabilidade
    int quantTentativas = 1; //Apostas por sorteio
    int quantNumerosEscolhidos = 6; //Quantidade de números por aposta
    String prob = "";

    int totalSorteado = 0;
    acertos teste = new acertos();
    
    double m1 = 0;
    double m2 = 0;
    double m3 = 0;
    double m4 = 0;
    double m5 = 0;
    double m6 = 0;
        
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
    
    numero veTemp[] = {numero1, numero2, numero3, numero4, numero5, numero6, numero7, numero8, numero9, numero10,
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
                for(int i = 0; i < 60; i++){
                    if(numeros[n].numero == veTemp[i].numero){
                        veTemp[i].addSpace(1);
                    }
                }
            } else if (t2 == numeros[n].numero) {
                numeros[n].somarSorteado(quantSorteiosRealizados);
                marcas[n].quantidade++;
                for(int i = 0; i < 60; i++){
                    if(numeros[n].numero == veTemp[i].numero){
                        veTemp[i].addSpace(2);
                    }
                }
            } else if (t3 == numeros[n].numero) {
                numeros[n].somarSorteado(quantSorteiosRealizados);
                marcas[n].quantidade++;
                for(int i = 0; i < 60; i++){
                    if(numeros[n].numero == veTemp[i].numero){
                        veTemp[i].addSpace(3);
                    }
                }
            } else if (t4 == numeros[n].numero) {
                numeros[n].somarSorteado(quantSorteiosRealizados);
                marcas[n].quantidade++;
                for(int i = 0; i < 60; i++){
                    if(numeros[n].numero == veTemp[i].numero){
                        veTemp[i].addSpace(4);
                    }
                }
            } else if (t5 == numeros[n].numero) {
                numeros[n].somarSorteado(quantSorteiosRealizados);
                marcas[n].quantidade++;
                for(int i = 0; i < 60; i++){
                    if(numeros[n].numero == veTemp[i].numero){
                        veTemp[i].addSpace(5);
                    }
                }
            } else if (t6 == numeros[n].numero) {
                numeros[n].somarSorteado(quantSorteiosRealizados);
                marcas[n].quantidade++;
                for(int i = 0; i < 60; i++){
                    if(numeros[n].numero == veTemp[i].numero){
                        veTemp[i].addSpace(6);
                    }
                }
            } else {
                numeros[n].somarNada(quantSorteiosRealizados);
            }
            if (inicioSorteio < quantSorteiosRealizados) {
                numeros[n].calcularMedia(quantSorteiosRealizados);
                numeros[n].probabilidadeAnterior++;
                //System.out.println(numeros());
            }
            
        }
        
        quantSorteiosRealizados++;
    }
    
    public void mostrarQuantidadeNumerosSorteado(){
        
        System.out.println("\n---- ANÁLISE DE NÚMEROS INDIVIDUALMENTE ----");
        int temp = 1;
        double tempf = 0;
        int low = 0;
        int lowlow = 0;
        int lowmed = 0;
        int lowhigh =0;
        
        int medium = 0;
        int medlow = 0;
        int medmed = 0;
        int medhigh = 0;
        
        int high = 0;
        int highlow = 0;
        int highmed = 0;
        int highhigh = 0;
        

        
        for (int n = 0; n < 60; n++){
            System.out.print(n + temp + " : ");
            System.out.println((int) numeros[n].getQuantSorteado() + " (" + String.format("%.02f", (numeros[n].getQuantSorteado() / quantSorteiosRealizados)*100) + "%)");

            if(n <= 6){
                lowlow = (int) ((int) lowlow + numeros[n].getQuantSorteado());
            }else if(n > 6 && n <= 13){
                lowmed = (int) ((int) lowmed + numeros[n].getQuantSorteado());
            }else if(n > 13 && n <= 20){
                lowhigh = (int) ((int) lowhigh + numeros[n].getQuantSorteado());
            }

            if(n > 20 && n <= 26){
                medlow = (int) ((int) medlow + numeros[n].getQuantSorteado());
            }else if(n > 26 && n <= 33){
                medmed = (int) ((int) medmed + numeros[n].getQuantSorteado());
            }else if(n > 33 && n <= 40){
                medhigh = (int) ((int) medhigh + numeros[n].getQuantSorteado());
            }

            if(n > 40 && n <= 46){
                highlow = (int) ((int) highlow + numeros[n].getQuantSorteado());
            }else if(n > 46 && n <= 53){
                highmed = (int) ((int) highmed + numeros[n].getQuantSorteado());
            }else if(n > 53 && n <= 60){
                highhigh = (int) ((int) highhigh + numeros[n].getQuantSorteado());
            }
        }        
        
        low = lowlow + lowmed + lowhigh;
        medium = medlow + medmed + medhigh;
        high = highlow + highmed + highhigh;
        
        System.out.println("\n---- ANÁLISE DE NÚMEROS POR GRUPO ----");
        tempf = low+medium+high;
        System.out.println("Low: " + low + " (" + (low / tempf)*100  +  "%)");
        tempf = lowlow;
        System.out.println("~Low-Low: " + lowlow + " (" + (tempf / low)*100  +  "%)");
        tempf = lowmed;
        System.out.println("~Low-Med: " + lowmed + " (" + (tempf / low)*100  +  "%)");
        tempf = lowhigh;
        System.out.println("~Low-High: " + lowhigh + " (" + (tempf / low)*100  +  "%)");
        
        tempf = low+medium+high;
        System.out.println("\nMedium: " + medium + " (" + (medium / tempf)*100  +  "%)");
        tempf = medlow;
        System.out.println("~Medium-Low: " + medlow + " (" + (tempf / medium)*100  +  "%)");
        tempf = medmed;
        System.out.println("~Medium-Med: " + medmed + " (" + (tempf / medium)*100  +  "%)");
        tempf = medhigh;
        System.out.println("~Medium-High: " + medhigh + " (" + (tempf / medium)*100  +  "%)");
        
        tempf = low+medium+high;
        System.out.println("\nHigh: " + high + " (" + (high / tempf)*100  +  "%)");
        tempf = highlow;
        System.out.println("~High-Low: " + highlow + " (" + (tempf / high)*100  +  "%)");
        tempf = highmed;
        System.out.println("~High-Med: " + highmed + " (" + (tempf / high)*100  +  "%)");
        tempf = highhigh;
        System.out.println("~High-High: " + highhigh + " (" + (tempf / high)*100  +  "%)");
        
    }

    public void sortear(int t1, int t2, int t3, int t4, int t5, int t6) {
        
        //System.out.println("---- SORTEIO ----");
        
        //2 números pouco sorteado
        //2 múneros médio
        //2 números muito sorteado
        int quantPoucoSort = 2;
        int quantMedioSort = 2;
        int quantMuitoSort = 2;
        
        boolean autoSort = true;
        
        double minPoucoSort = 1.00f;
        double maxPoucoSort = 10.20f;
        
        double minMedioSort = 10.20f;
        double maxMedioSort = 10.00f;
        
        double minMuitoSort = 10.20f;
        double maxMuitoSort = 50.00f;
        
        
        bubbleSort();
        
        
        if(autoSort){
            double tempMax;
            tempMax = veTemp[59].getQuantSorteado() / quantSorteiosRealizados;
            double tempMin;
            tempMin = veTemp[0].getQuantSorteado() / quantSorteiosRealizados;
            double tempDif = tempMax - tempMin;
            double tempFrac = tempDif / 3;
            
            minPoucoSort = (double) tempMin * 100;
            maxPoucoSort = (double) (((double) (tempDif / 3) + tempMin) * 100);

            minMedioSort = (double) (((double) (tempDif / 3) + tempMin) * 100);
            maxMedioSort = (double) (((double) ((tempDif / 3)*2) + tempMin) * 100);

            minMuitoSort = (double) (((double) ((tempDif / 3)*2) + tempMin) * 100);
            maxMuitoSort = (double) tempMax * 100;
        }
        
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num6 = 0;
        
        for(int i = 0; i < 60; i++){
            if((veTemp[i].getQuantSorteado() / quantSorteiosRealizados) * 100 <= maxMuitoSort && i > 5){
                num6 = veTemp[i].numero;
                if(num5 != num6){
                    num5 = veTemp[i].numero;
                }
            }
            
            if((veTemp[i].getQuantSorteado() / quantSorteiosRealizados) * 100 <= maxMedioSort && i > 4){
                if(num4 != num5 && num4 != num6){
                    num4 = veTemp[i].numero;
                }
                if(num3 != num4 && num3 != num5 && num3 != num6){
                    num3 = veTemp[i].numero;
                }
                
            }
            
            if((veTemp[i].getQuantSorteado() / quantSorteiosRealizados) * 100 <= maxPoucoSort && i > 1){
                if(num2 != num3 && num2 != num4 && num2 != num5 && num2 != num6){
                    num2 = veTemp[i].numero;
                    num1 = veTemp[i].numero;
                }
                if(num1 != num2 && num1 != num3 && num1 != num4 && num1 != num5 && num1 != num6){
                    num1 = veTemp[i].numero;
                }
            }
        }
        
        
        for(int i = 0; i < 6; i++){
            //System.out.println("Espaço: " + i);
            for(int n = 0; n < 60; n++){
                //System.out.print(veTemp[n].numero + " : ");
                //System.out.println((int) veTemp[n].getQuantSorteado() + " (" + String.format("%.04f", (veTemp[n].getQuantSorteado() / quantSorteiosRealizados)+(veTemp[n].getSpace(i)/quantSorteiosRealizados)*100) + "%)");
                if(veTemp[n].tt != 0){
                    veTemp[n].prob = (veTemp[n].getQuantSorteado() / quantSorteiosRealizados) - (veTemp[n].getSpace(i)/veTemp[n].tt)*100;
                    //System.out.println("adas" + (double)(veTemp[n].getSpace(i)/veTemp[n].tt));
                }else{
                    veTemp[n].prob = (veTemp[n].getQuantSorteado() / quantSorteiosRealizados)*100;
                }
                
                if(i == 0 && n == 58){
                    num1 = veTemp[n].numero;
                } else if(i == 1 && n == 14){
                    if(veTemp[n].numero != num1){
                        num2 = veTemp[n].numero;
                    }
                } else if(i == 2 && n == 31){
                    if(veTemp[n].numero != num2 && veTemp[n].numero != num1){
                        num3 = veTemp[n].numero;
                    }
                } else if(i == 3 && n == 52){
                    if(veTemp[n].numero != num3 && veTemp[n].numero != num2 && veTemp[n].numero != num1){
                        num4 = veTemp[n].numero;
                    }
                } else if(i == 4 && n == 7){
                    if(veTemp[n].numero != num4 && veTemp[n].numero != num3 && veTemp[n].numero != num2 && veTemp[n].numero != num1){
                        num5 = veTemp[n].numero;
                    }
                } else if(i == 5 && n == 17){
                    if(veTemp[n].numero != num5 && veTemp[n].numero != num4 && veTemp[n].numero != num3 && veTemp[n].numero != num2 && veTemp[n].numero != num1){
                        num6 = veTemp[n].numero;
                    }
                }
                bubbleSort();
            }
        }
        
        //System.out.println("\nmaxMuitoSort :" + maxMuitoSort);
        //System.out.println("maxMedioSort :" + maxMedioSort);
        //System.out.println("maxPoucoSort :" + maxPoucoSort);
        
        int vetor[] = new int[6];
        vetor[0] = num1;
        vetor[1] = num2;
        vetor[2] = num3;
        vetor[3] = num4;
        vetor[4] = num5;
        vetor[5] = num6;
        
        boolean troca = true;
        int aux;
        while(troca){
            troca = false;
            for(int i = 0; i < vetor.length - 1; i++){
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
        System.out.print("\nTentativa: ");
        for(int i = 0; i < 6; i++){
            if(vetor[i] == t1 || vetor[i] == t2 || vetor[i] == t3 || vetor[i] == t4 || vetor[i] == t5 || vetor[i] == t6){
                System.out.print(ConsoleColors.RED_BOLD + " " + vetor[i] + ConsoleColors.RESET);
            }else{
                System.out.print(" " + vetor[i]);
            }
        }
        
        
        int a1 = 0,a2 = 0,a3 = 0,a4 = 0,a5 = 0,a6 = 0;
        
        for(int i = 1; i < 6; i++){
            for(int b = 1; b < 6; b++){
                if(t1 == num1 || t1 == num2 || t1 == num3 || t1 == num4 || t1 == num5 || t1 == num6){
                    teste.n1++;
                    a1++;
                    m1++;
                }
                if(t2 == num1 || t2 == num2 || t2 == num3 || t2 == num4 || t2 == num5 || t2 == num6){
                    teste.n2++;
                    a2++;
                    m2++;
                }
                if(t3 == num1 || t3 == num2 || t3 == num3 || t3 == num4 || t3 == num5 || t3 == num6){
                    teste.n3++;
                    a3++;
                    m3++;
                }
                if(t4 == num1 || t4 == num2 || t4 == num3 || t4 == num4 || t4 == num5 || t4 == num6){
                    teste.n4++;
                    a4++;
                    m4++;
                }
                if(t5 == num1 || t5 == num2 || t5 == num3 || t5 == num4 || t5 == num5 || t5 == num6){
                    teste.n5++;
                    a5++;
                    m5++;
                }
                if(t6 == num1 || t6 == num2 || t6 == num3 || t6 == num4 || t6 == num5 || t6 == num6){
                    teste.n6++;
                    a6++;
                    m6++;
                }
            }
        }
        
                
        if(t1 == num1 && t2 == num2 && t3 == num3 && t4 == num4 && t5 == num5 && t6 == num6){
            teste.addCompleto();
        }
        
        double mediaTemp = 0.0f;
        mediaTemp = (a1 + a2 + a3 + a4 + a5 + a6) / 6;
        teste.calcMedia(mediaTemp);
        //analiseSorteio(t1, t2, t3, t4, t5, t6);
        
    }
    
    private void analiseSorteio(int n1, int n2, int n3, int n4, int n5, int n6){
        
    }
    
    private void bubbleSort(){
             
        numero aux[] = {numero1, numero2, numero3, numero4, numero5, numero6, numero7, numero8, numero9, numero10,
        numero11, numero12, numero13, numero14, numero15, numero16, numero17, numero18, numero19, numero20,
        numero21, numero22, numero23, numero24, numero25, numero26, numero27, numero28, numero29, numero30,
        numero31, numero32, numero33, numero34, numero35, numero36, numero37, numero38, numero39, numero40,
        numero41, numero42, numero43, numero44, numero45, numero46, numero47, numero48, numero49, numero50,
        numero51, numero52, numero53, numero54, numero55, numero56, numero57, numero58, numero59, numero60};
        
        boolean troca = true;
        while(troca){
            troca = false;
            for(int i = 0; i < veTemp.length - 1; i++){
                if(veTemp[i].prob > veTemp[i + 1].prob){
                    aux[i] = veTemp[i];
                    veTemp[i] = veTemp[i + 1];
                    veTemp[i + 1] = aux[i];
                    troca = true;
                }
            }
        }
        
    }
    
    public void mostrarDadosFinais(){
        System.out.println("\n---- BubbleSort ----");  
        for (int n = 0; n < 60; n++){
            System.out.print(veTemp[n].numero + " : ");
            System.out.println((int) veTemp[n].getQuantSorteado() + " (" + String.format("%.02f", (veTemp[n].getQuantSorteado() / quantSorteiosRealizados)*100) + "%)");
        }
        for(int i = 0; i < 6; i++){
            System.out.println("Espaço: " + (i + 1));
            for(int n = 0; n < 60; n++){
                System.out.print(veTemp[n].numero + " : ");
                System.out.println((int) veTemp[n].getQuantSorteado() + " (" + String.format("%.04f", veTemp[n].prob*100) + "%)");
                veTemp[n].prob = (veTemp[n].getQuantSorteado() / quantSorteiosRealizados) + (veTemp[n].getSpace(i)/quantSorteiosRealizados)*100;
                bubbleSort();
            }
        }
        //System.out.println("N6:" + veTemp[59].sp1 + " " + veTemp[59].sp2 + " " + veTemp[59].sp3 + " " + veTemp[59].sp4 + " " + veTemp[59].sp5 + " " + veTemp[59].sp6);
        System.out.println("Media de Acertos: " + teste.mediaAcerto);
        System.out.println("Acerto Completo: " + teste.completo);
        System.out.println("Campo 1 Prob Acerto: " + m1/quantSorteiosRealizados);
        System.out.println("Campo 2 Prob Acerto: " + m2/quantSorteiosRealizados);
        System.out.println("Campo 3 Prob Acerto: " + m3/quantSorteiosRealizados);
        System.out.println("Campo 4 Prob Acerto: " + m4/quantSorteiosRealizados);
        System.out.println("Campo 5 Prob Acerto: " + m5/quantSorteiosRealizados);
        System.out.println("Campo 6 Prob Acerto: " + m6/quantSorteiosRealizados);
    }


}