import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        System.out.println("lets do the Swapping ");
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the number A:\n");
        int a= sc.nextInt();
        System.out.println("the other number B :");
        int b= sc.nextInt();
         int c=a;
         a=b;
         b=c;
        System.out.println("swapping the number");
        System.out.println("the number A 55"+a);
        System.out.println("the second number is "+b);
    }
    
}
