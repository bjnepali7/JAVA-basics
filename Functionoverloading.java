// function overloading is a technique  in  which we can  function name is same but arguments will be different
// it can be outside the class also it can be child class  
class sum{
    private int x;
    private int y;
    int diff;
    sum(int x,int y){
        this.x=x;
        this.y =y;
    }
     public void f1(){
        System.err.println(x+y);
    }
     public void  f1(int p, int q){
        diff =p-q;
        System.err.println(diff);
    }
}



public class Functionoverloading {
    public static void main(String[] args) {
        sum s=new sum(5,6);
        s.f1();
        s.f1(5,4);
    }
    
}
