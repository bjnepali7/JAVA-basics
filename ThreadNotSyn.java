import java.util.Scanner;//to take input from  the keybord we have to use scanner class


// this is an example of not safe thread which is not synchronize


class Account{
    int bal;
    Account(int b){
        bal=b;
    }
    boolean isbalncesufficent(int w){
        if(bal>w){
            return true;

        }
        else{
            return false;
        }
    }
    void withdraw(int amt, String g1){
        bal=bal-amt;
        System.err.println("transaction sucessful");
        System.err.println(g1+" "+"current balance"+" "+bal);
    }
}

class customer implements Runnable{
    Account x1;
    String m1;
    customer(Account j1, String p1){
        m1=p1;
        x1=j1;
        
    }
    public void run(){
        Scanner s1= new Scanner(System.in);
        System.err.println("enter the amount to withdraw"+m1+":");
        int amt= s1.nextInt();
        
        System.err.println("enter the amount to withdraw"+m1+":");
        if(x1.isbalncesufficent(amt)){
           x1.withdraw(amt,m1);

        }
        else{
            System.err.println("insufficent balance"+" "+m1);
        }
    }

}


public class ThreadNotSyn {
    public static void main(String[] args) {
        Account a1= new Account(5000);
        customer c1= new customer(a1,"amit");
        customer c2= new customer(a1,"sumit");
        Thread t1= new Thread(c1);
        Thread t2= new Thread(c2);
        t1.start();
        t2. start();     
    }
    
}
