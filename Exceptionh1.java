public class Exceptionh1 {
    public static void main(String[] args) {
        String s1 = null;
        try {
            System.err.println(s1.length());
        }
        catch (NullPointerException b2) {
            System.err.println("NullPointerException: " + b2.getMessage());
        
       try{  // This will throw NullPointerException
            System.err.println(5 / 0);  
                       // This will throw ArithmeticException
        
        } catch (ArithmeticException b1) {
            System.err.println("ArithmeticException: " + b1.getMessage());
        }
        System.err.println("A");
    }
}
}
