//interface is used to achive the  multiple inheritance
// their is no mulple inheritance  in java because of ambiquty
// object of interface cant be made but the class which inherits it can be made the object


interface d{
    int x=5;// the veriables in ineterface is public ,static, and finalize
    void f1();// function  is always abstract and public 
    static void f2(){
        System.err.println("hello man how are you");

    }
}
interface f extends d{// extends keyword is used  inherit  in between interfaces
    int v=20;

}



public class interfaceexample {
    public static void main(String[] args) {
    d.f2();

        
    }
    
}
