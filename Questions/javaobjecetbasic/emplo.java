package Questions.javaobjecetbasic;
//2. Write a Java program to create a class `Employee` with name, id, and salary. 
// Use constructor overloading to create multiple objects with different initialization values.

class Employee{
    String name;
    int id;
     int salary;
     public Employee(   String name,  int id,int salary){
        this.name= name;
        this.id=id;
        this.salary=salary;

     }

     public Employee(String name,int id){
           this.name= name;
        this.id=id;
        this.salary=9000;
     }
        public Employee(String name){
           this.name= name;
        this.id=3;
        this.salary=10000;
     }
     public void displayInfo(){
        System.out.println("name:"+name+"\t"+"id:"+id+"\t"+"salary:"+salary);
     }
}
public class emplo {
    public static void main(String[] args) {
        Employee a=new Employee("bijay",1,3000);
        Employee b=new Employee("ajay",2);
        Employee c=new Employee("sanj");
        a.displayInfo();
        b.displayInfo();
        c.displayInfo();
        
    }
   
}
