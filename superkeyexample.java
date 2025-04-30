
class example{
     int x;
       int y;
      void f1 (int x,int y){
        this.x=x;
        this.y=y;
      }
       void Display1(){
        System.err.println(x+y);
       }
}
class  help extends example{


     int x;
     
     void f2(int x, int y){
        this.x=x;
        super.y=y;
     }
     void f4(){
        System.err.println(this.x);
        System.err.println(super.y);
     }
}


public class superkeyexample {
    public static void main(String[] args) {
        help h= new help();
        h.f2(5,6);
        h.f4();
    }
    
}
