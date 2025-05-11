interface Shape{
       double getArea();

}
 class Retangle implements Shape{
int l=2;
int b=4;
int h=5;
     public double getArea(){
          
          return l*b*h;

     }
}
 class Circle implements Shape{
     double r=6;
      public  double getArea(){
           return 2*3.14*r*r;


      }
 }
  class  Triangle implements Shape{
   int h=2;
int b=4;
     public double  getArea(){
          return 1/2*h*b;

     }
  }

public class Question1 {
     public static void main(String[] args) {
          
          Retangle  e= new Retangle();
          Circle c=new Circle();
          Triangle t= new Triangle();
          System.out.println("the area of rectangle is"+e.getArea());
          System.out.println("the area of the circle is"+c.getArea());
           System.out.println("the area of Triangle is"+t.getArea());
     }
    
}
