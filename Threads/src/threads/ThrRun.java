package threads;

public class ThrRun implements Runnable {
        private int id;
        
        public ThrRun (int id){
            this.id = id;
        }
        
        @Override
        public void run(){
            for (int i = 0; i < 100; i++){
                System.out.println(id 
                        + " - i = " + i);
            }
        }
        
}
