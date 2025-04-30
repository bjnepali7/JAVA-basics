class A{
    int x;
    private static  int y;
    void fun1(){//we can also make  function static 

        y=22;
    }
    void display(){
        System.out.println(y);
        System.err.println(x);

    }
    void fun2(){
        y=43;
    }

}
//for acessing private static members variable object cannot be create for accessing it 
//we need to create function  to make object and acessing the private  static variable 
// or we can  make function static
//static function can be acess by without creating  objuct

public class Private_static_member_acessing {
    public static void main(String[] args) {
        A a1=new A();       /*if  we had make function static we just have to acesss class name.function  (A.fun1();)  */
        A a2=new A();
        a1.fun1();
        a2.fun2();
        a1.display();


//here 43 and 0 will be output because static variable will change  and 0 because it is garbage value
        
    }
}
