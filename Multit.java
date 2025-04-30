//multithreding is a process of running   two or more process same time
// it can be achieve by two way
//By using runnable interface
// by using thred class
class Process1 implements Runnable{// Runnable is interface  this 
    int i;
        public void run(){// their is a function  in runable interface  which we need to overrride that function  run()
        for(i=1;i<10;i++){
            System.err.println("proceess1"+i);
        }
    }
}
    class Process2 implements Runnable{
        int i;
        public void  run(){
            for(i=1;i<10;i++){
                System.err.println("process2"+i);
            }
        }
    }
    
    
    
    public class Multit {
    
        public static void main(String[] args) {
            Process1 p1=new Process1();
            Process2 p2= new Process2();
            Thread t1=new Thread(p1);// their is a thred class  in java to creATE and connet the thread .... we need to create the  object and pass the object of class
            Thread t2=new Thread(p2);// this is used to craete the thread
            t1.start();// their is a start fuction of class thread to start the thread

            t2.start();
            // it is also can be done by the  thred class
           /*class Thread{
} 
Thread(Runnable r1){}
*///this is a already define class.. this is why we neeed to make object of a class 
        }
        
    }
    

