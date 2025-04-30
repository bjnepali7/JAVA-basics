
class demo{
// constructor is a block of code similer to method which is called when interface of the class is created
//every time the object is created  by using the new keyword  atleast one object is created
//constructor is created to initialize the values
// two types of constructor
//1. default constructor 
//2.parametarize constructor
//constructor name is same as the  class name
    int x;
    int y;
    int u;
    demo(int p,int q){// this is parameteriaze constructor
        x=p;
        y=q;
    }
    public void f1(){
        u=x+y;
        System.err.println(u);
        
    }
    demo(){//this is default constructor

    }
    demo(int f){

    }
}



public class Constructordemo {
    public static void main(String[] args) {
        demo c= new demo(5,6);
        demo c1=new demo();
        demo c3=new demo(7);
        c.f1();
        c1.f1();
        c3.f1();

        
    }
    
}
