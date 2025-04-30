package package1;
import java.util.Scanner;
// thisss is an example of synchronize threading 
//synchronize keyword is used


class Account{// 
    int bal;
    Account(int j1){
        bal=j1;

    }
     boolean isbalncesufficent(int amt){
        if(bal>amt){
            return true;
        }
        else{
            return false;
        }
     }
    void withdraw(int w){
        bal= bal-w;
        System.err.println("withdraw sucessfull");
        System.err.println("current balance is"+""+bal);
    }


}
class customer implements Runnable{
    Account x1;
    String h1;
customer(Account j1,String g){
    x1=j1;
    h1=g;
}

public void run(){
    
    Scanner s1= new Scanner( System.in);
    System.err.println(h1+" "+""+"enter the amount");
    int amt=s1.nextInt();
    synchronized(x1){
    if(x1.isbalncesufficent(amt)){
        x1.withdraw(amt);

    }else{
        System.err.println("withdrawel failed");
    }
}
}




}


public class threadsync {
    public static void main(String[] args) {
        Account a1= new Account(700);
        customer c1= new customer(a1,"Bijay");
        customer c2= new customer(a1, "Abijit");
        Thread t1= new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
        
    }
    
}
