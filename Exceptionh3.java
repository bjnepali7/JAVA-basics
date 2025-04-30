// comiler doesnot know the busssiness logic exception so we had to throw the  exception
//in below if we donot throw catch ot try answer will be in minus ... balace couldn't be in minus
//  so user have to throw
// throw is used to set the custom error message in the program

/// this is throw keyword example..

public class Exceptionh3 {
    public static void main(String[] args) {
        int Current_balance=10000;
        int  withdraw_balance=14000;
        try{
            if(Current_balance<withdraw_balance){
            throw  new ArithmeticException("transaction unsucessfull");/// object is being craetd of the arthemetic exception class
            }
            Current_balance= Current_balance-withdraw_balance;
            System.err.println("transacrion sucessfull");
            System.err.println("current balance is"+""+Current_balance);
        }
         catch(ArithmeticException e1){// referebce of the above object is being created
            System.err.println(e1.getMessage());
         }
    }
    
}
