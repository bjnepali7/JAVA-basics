//in heritance is a mechanism in which one object acquires all the propeerties of the  parent object
// three type of inheritance  1. single inheritance...2.multilevel inheritance....3...heirarchical inheritance


//exapmle of single inheritace .. it is when a class inheris the  another class 

class nokia{
static int  x=7;
    static int y=2;
     void fun1(){
        System.err.println(" parent fun1 is executed");
     }
     void fun2(){
        System.err.println(" parent fun 2 is executed ");
     }
}
class nokia2 extends nokia{
    void fun3(){
        System.err.println(" child fun3 is executed");
    }
}


public class Inheritanceexample {
    public static void main(String[] args) {
        nokia2 m=new nokia2();
        m.fun1();//here the object of sub class nokia2 can acess the property of the  super class nokia which is fun1()
        m.fun2();
        m.fun3();
    }
    
}
