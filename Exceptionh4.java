//finally is a facility that the java has provide for any code which we wANT to execute the emergency code we want to execute
//try catch finally should come in the order




public class Exceptionh4 {
    public static void main(String[] args) {
        System.err.println("a");
        String s1=null;
        try{
            System.err.println(s1.length());
        }
        catch(ArithmeticException c1){}
        catch(Exception e1){}// this is  a way to handel the  exxeption  to run the progarm smoothly
        //  Exception e1 is a  parent reference variable  which point to the child object it can oly point but cannot acess the child memebers


        finally{
            System.err.println("SS");
        }
    }
    
}
