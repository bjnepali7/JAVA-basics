//Wrapper class is used to make java 100%  object orented programming
//wrapper class is used  to convert data from primitive data type to non primitive datatype and vice versa 
public class wrapperclass {
    public static void main(String[] args) {
        //for string to Integer and Binary to integer
        int x=Integer.parseInt("123");
        Integer x1=Integer.valueOf("1010",2);
        int y=x1.intValue();
        System.err.println(x);
        System.err.println(y);

        //for double  (string to double)
        double z=Double.parseDouble("454");//if int is use (int x=int Double.parseDouble();)
        Double n=Double.valueOf(45);
        Double m=n.doubleValue();
        System.err.println(z);
        System.err.println(m);
        // for  character
       

    
        

    }
}
/*java have in build classes  just as int  classs is Integer double  class is Double
 the in build function or method  starsts with small and after end of first word capital(camel casing:parseInt(){} )
 in build class starts with capita and then small(pascal casing:  class Integer{})
 */