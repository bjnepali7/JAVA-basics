package Questions.javaobjecetbasic;
// Q1. Create a class `BankAccount` with attributes: accountNumber, accountHolder, and balance. 
// Implement methods: deposit(), withdraw(), and displayBalance().

class BankAccount{
    int accountNumber;
   String accountHolder;
    double balance;


    public BankAccount(int accountNumber,String accountHolder,  double balance ){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;    }
    public   void   deposit( double amount)
    {
        if (amount>0){
            double newb=balance+=amount;
            System.out.println("deposited: "+amount);
            System.out.println("the new balance is"+newb);
        }else{
            System.out.println("the amount is not deposited");
        }
    
     
     }

public void  withdraw(double amount){
    if (amount>0 && balance>amount){
        double newb=balance-=amount;
        System.out.println("the withraw amount is"+amount);
        System.out.println("the new balnce is"+newb);

    }else{
        System.out.println("the amount is not withdrawn");
    }
  
}
public  void  displayBalance( ){
     System.out.println("the balance is"+balance);
}

    }

public class bank {
    public static void main(String[] args) {
        BankAccount a=new BankAccount(101,"bijay",5000);
        System.out.println("the account holder is: " +a.accountHolder);
    a.deposit(200);
    a.withdraw(4000);
    a.displayBalance();
  
    }
    
}
