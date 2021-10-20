package threads;

public class AppRun {
    
        public static void main(String[] args) {
            
        ThrRun t1 =  new ThrRun(1);
        Thread th1 = new Thread(t1);
        
        ThrRun t2 = new ThrRun(2);
        Thread th2 = new Thread(t2);
        
        th1.start();
        th2.start();
            
    }
}
