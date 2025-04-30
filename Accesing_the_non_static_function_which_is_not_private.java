class Bold{
    int x;
    int y;
    void fun1(){
        System.err.println("hello");

    }
    void fun2(){
        System.out.println("bj");
    }
}

public class Accesing_the_non_static_function_which_is_not_private {

    
   //for accessing the non static member of another class we need to create object of that class to acess  that member(syntax: class name.referencevariable(eg e1 e2)=new classname();)
   //new will create the object
    public static void main(String[] args) {
        Bold b1=new Bold();
    Bold b2=new Bold();
    b1.x=30;
    b2.x=40;
    System.out.println(b1.x);
    System.out.println(b2.x);
    b1.fun1();

    }
    
}
