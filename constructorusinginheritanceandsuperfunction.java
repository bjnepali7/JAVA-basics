// construction is a  first thing in object life
//  when child object is made the child constructor but it can acess parent constructor as well is called but the compier will put
// super()  which will then execute the parent constructor 
// so  the first call will be child but  execution will be  parent 

class samsung1{
    
    samsung1(){
        System.err.println("i am samsung");
    }
    void fun1(){
        System.err.println("hello samsung");
    }
}

class vivo extends samsung1{
// here compiler will put the  super() function which then  goes up[to the parent constructor and execute the constructor
    vivo(){
        System.err.println("i am vivo");
    }
    void fun2(){
        System.err.println("ahhahah");
    }
}



public class constructorusinginheritanceandsuperfunction {
    public static void main(String[] args) {
        vivo v= new vivo();
        v.fun1();
        v.fun2();

    }
    
}
