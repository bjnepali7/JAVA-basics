 interface  Animal{
 int age=10;
 static void f2(){
   System.out.println("static function can have body");
 }
 static  int getAge(){
   return age;
 }
 static void setAge(){
   int Age=age;
 }

    void speak();


    
}
 interface Mammal {
    void  brestFeed();
  
    
  }

 class  Dog implements Animal,Mammal{
    public void speak(){
      System.out.println("mammal is a animal that can  speak");

    }
    public void brestFeed(){
      System.out.println("mammal  breast feed ");


    }
 }


 public class intefaceExample {
    public static void main(String[] args) {
      Dog d= new Dog();
      d.speak();
      d.brestFeed();
   System.out.println(Animal.getAge());
      
        
    }
    
}
