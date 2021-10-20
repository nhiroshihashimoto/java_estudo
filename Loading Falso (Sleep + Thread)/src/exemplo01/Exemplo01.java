package exemplo01;


public class Exemplo01 {

    public static void main(String[] args) {
        
        Janela J1 = new Janela();
        
        Thread01 t1 = new Thread01();
        Thread01 t2 = new Thread01();
        
        Thread Td_1 = new Thread(t1);
        Thread Td_2 = new Thread(t2);
        
        Td_1.start();
        Td_2.start();
    }
    
}
