class Process5 implements Runnable{
    public void run(){

        int i;
        for(i=1;i<4;i++){
            System.err.println("process5 running");
        }
    }

}

class Process6 implements Runnable{
    public void run(){

        int i;
        for(i=1;i<10;i++){
            System.err.println("process6 running");
        }
    }

}


public class threadingexample {
    
    public static void main(String[] args) {
        Process5 p5=new Process5();
        Process6 p6=new Process6();
        Thread t3= new Thread(p5);
        Thread t4= new Thread(p6);
        t3. start();
        t4. start();
        
    }
}
