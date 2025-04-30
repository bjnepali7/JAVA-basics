//The super keyword in Java is a reference variable which is used to refer immediate parent class object.

//Whenever you create the instance of subclass, an instance of parent class is created implicitly 
//which is referred by super reference variable.


class Samsung1 {
    private int x, y;

    Samsung1(int p, int q) {
        x = p;
        y = q;
        System.out.println("I am Samsung");
        System.err.println(x+y);
    }

    void fun1() {
        System.out.println("Hello Samsung");
    }
}

class Vivo extends Samsung1 {
    // Constructor for Vivo
    Vivo(int p, int q) {
        super(p, q); // Calls the parent class constructor with two integers
        System.out.println("I am Vivo");
    }

    void fun2() {
        System.out.println("Ahhahah");
    }
}

public class superkeywordexample {
    public static void main(String[] args) {
        Vivo vivoObj = new Vivo(5, 10);
        vivoObj.fun1(); // Calls the parent class method
        vivoObj.fun2(); // Calls the child class method
    }
}






