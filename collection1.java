import java.util.*;


public class collection1 {
    public static void main(String[] args) {

        ArrayList l1=new ArrayList();
        l1.add("A");
        l1.add("B");
        l1.add("C");
        l1.add(2,"G");
        Iterator g1=l1.iterator();

        while(g1.hasNext()){
            System.err.println(g1.next());
        }
        
    }
}
