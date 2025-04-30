// this is an exaple of multilevel inheritance 
//when there is   chain of inheritance is called multilevel ineheritamnce

class animal{
    void fun1(){
        System.err.println("animal has legs");
    }
}
class dog1 extends animal{
void fun2(){
    System.err.println("dog can bark");
}
}
class cat1 extends dog{
    void fun3(){
        System.err.println("cat mew");
    }
}
public class inherirt3 {
    public static void main(String[] args) {
        dog1 d=new dog1();
        cat1 c=new cat1();
        c.fun3();
        c.fun1();// cat objct can acess the  animal class  since it has two parent
        d.fun2();
        d.fun1();
        c.fun2();//here cat is the child of the dog so  cat object can acess the membeers of the   class dog but dog cannot acess
        // but it can acess the animal class  because it is the child iof the  animal
    }
    
}
