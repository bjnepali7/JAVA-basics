//  Bys using the thread class we use multi threding




class process3 extends Thread{
    int i;
    public  void run(){//  rn() is essential to run the thread .. we need to ovveride
    for(i=1;i<5;i++){
        System.err.println("process3 is running"+i);
    }
}
}

class process4 extends Thread{
    int i;
   public  void run(){
    for(i=1;i<5;i++){
        System.err.println("process4 is running"+i);
    }
}
}
/*class Thread{
} 
Thread(Runnable r1){}
*///this is a already define class in java 


public class Multi2 {
    public static void main(String[] args) {
        process3 p3= new process3();
        process4 p4= new process4();
        p3.start();
        p4.start();
        
    }
    
}
