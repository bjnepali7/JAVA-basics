  import java.io.*;
import java.util.Scanner;


    class   AgeException extends Exception{
        public  AgeException (String message){
            super(message);

        }

    }

class CustomAge{
    
public  static void  age(int age)throws AgeException{
    if (age<18){
        throw new AgeException("the age is not write");

    }else{
        System.out.println("the age is write");
    }

    
}

   


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try{
        int age= sc.nextInt();
        age(age);
        }catch(AgeException e1){
            System.out.println(" "+e1.getMessage());

        }
        catch( Exception e1){
            System.out.println(e1.getMessage());
        }


         
    }

    
}


