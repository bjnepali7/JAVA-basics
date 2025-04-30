interface M{
     void setVolume();

}
interface s {
    void setVolume();
}
class vivoo implements M, s{// to use interface with class the implements keyword is used

    public void setVolume(){// overide needs to be done  in class with interface
        //the function should be public which is to be oveeridden...since the function in interface is  public and abstract
        System.err.println("new feature");

    }
}
// multiple inheritance is achieve

public class interfacewithclass {
    public static void main(String[] args) {
        vivoo v=new vivoo();
        v.setVolume();
    }
    
}
