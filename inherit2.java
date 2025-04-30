// this is an example of heirarchical inheritance 
// in this one parent has 2 0r more child
// child cannot acess the other child 
class animal1{
    void fun1(){
        System.err.println("animal has legs");
    }
}
class dog extends animal1{
void fun2(){
    System.err.println("dog can bark");
}
}
class cat extends animal1{
    void fun3(){
        System.err.println("cat mew");
    }
}

public class inherit2 {
    public static void main(String[] args) {
        dog d=new dog();
        cat c=new cat();
        c.fun3();
        c.fun1();
        d.fun2();
        d.fun1();

    }
    
}
