import java.util.Scanner;

class Account1{
    int bal;
    Account1(int b){
        bal=b;
    }
    boolean isbalancesufficent(int w){
        if(bal>w){
            return true;
        }
        else{
            return false;
        }
    }

    void withdraw(int amt,String m){
        bal=bal-amt;
        System.err.println("transaction sucessful");
        System.err.println("current balance is"+""+bal);
    }
}

class customer1 implements Runnable{
    Account1 x1;
    String k;
    customer1(Account1 j1,String m){
        x1=j1;
        k=m;
    }
    public void run(){
        Scanner s1= new Scanner(System.in);
        System.err.println("enter the amount to withdraw"+" "+k+":");
        int amt=s1.nextInt();
        
          synchronized(x1){// synchronize block is used to  make thred safe 
            if(x1.isbalancesufficent(amt)){
                x1.withdraw(amt, k);
            }
            else{
                System.err.println("insufficent balance"+"");
            }
        }






    }



}




public class Threadissyn {
    public static void main(String[] args) {
        Account1 a1= new Account1(7000);
        customer1 c1=  new customer1(a1,"bijay");
        customer1 c2= new customer1(a1, "acarye");
        Thread t1= new Thread(c1);
        Thread t2= new Thread(c2);
        t1.start();
        t2.start();
        
    }
    
}
