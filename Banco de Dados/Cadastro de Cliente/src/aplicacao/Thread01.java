package aplicacao;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread01 implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i < 100; i++) {

            int valor = loading.getValue();
            loading.setValue(valor + 2);
            i++;
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread01.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
