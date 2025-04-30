public class Example {
    //java uses pascal casing for the class which is first letter is capital and other small
    //for function it uses camel casing which is first is small and other can be capital(eg-the inbuilt function in java setMouseListner(){})
    //other type of casing is snake casing which is all small letter and seperated by _

    static void fun1(){// if the function is not static it will not run in  main there is another method to acess the non static function 
        System.err.println("method 1");

    }
    static void fun2(){
        System.err.println("method 2");
    }
    public static void main(String[] args) {
        System.err.println("method3");
        fun1();
        fun2();
        Area.fun1();
        Area.fun2();
    }
    
}
