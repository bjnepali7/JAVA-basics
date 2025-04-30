import java.util.*;

public class CursorsEnumertion {
    public static void main(String[] args) {
        Vector v1= new Vector<>();
        v1.add("A");
        v1.add("B");
        v1.add("C");
        v1.add("D");
        Enumeration k1= v1.elements();

        while(k1.hasMoreElements()){

            System.err.println(k1.nextElement());
        }
    }
}
