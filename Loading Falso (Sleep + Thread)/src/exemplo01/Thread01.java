package exemplo01;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread01 implements Runnable{

    @Override
    public void run() {
        
        for (int i = 1; i < 100; i++){
            
            for (int t = 0; t < 4; t++){
                int valor = Janela.getValue();
                Janela.setValue(valor+1);
                System.out.println(Janela.getValue());
                i++;
            }
            System.out.println("_______________________________________");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread01.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
