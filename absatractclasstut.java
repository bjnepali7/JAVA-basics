// abstract class is a class which object  cannot  be created
// abstract class which is parent  but its child class object can be created .. but if child is also abstract then object cannot be created 
// function can also be  abstract
// if any class their is abastract function  that class should  made abstract class
// the keyweord is abstract
// abstract class have a constructor

abstract class Sum{
    int x;
     int y;
     Sum(){
        // super(); is called by compiler it goes  abpve and execute the  parent constructor  and then comeback and execute its  constructor
        System.err.println("parent constructor is called ");
     }

     abstract  void  f1( int x, int y);// abstract method donot have a body

     
}
class Add extends Sum{
    Add(){
        System.err.println("child is called");
    }
    void f1( int x, int y){
        System.err.println("the sum of two number is  "+(x+y));
    }

}


public class absatractclasstut {
    public static void main(String[] args) {
        Add a=new Add();
        a.f1(7, 8);
    }
    
}
