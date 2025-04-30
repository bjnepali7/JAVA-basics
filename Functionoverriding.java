// function overriding is a  method in which name and arguments of a function  is same
// it can only be in different class  ... it cannot be in the  same class ... 
// suppose their is a parent and child class  and they have finction overrriding which object of a child is called
// child one will e be executed



class A{
    
    void f1(int x, int y){
        System.err.println(x+y);
    }
}


class B extends A{
    

     void f1( int x, int y){
        System.err.println(x-y);
     }

}


public class Functionoverriding {
    public static void main(String[] args) {
        B b= new B();
        b.f1(4, 5);
        
    }
}
