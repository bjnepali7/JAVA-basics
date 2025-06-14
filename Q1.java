

class Student{
    int roll_number;
       void  setRollNum(int roll_number){
        this.roll_number=roll_number;
    }
     int  getRollNum(){
        return roll_number;
     }
  
    void displayRoll(){
        System.out.println("the roll number is"+roll_number);
    }

}
class Test extends Student{
    int sub1;
    int sub2;
     void setMarks(int m1,int m2){
    sub1=m1;
    sub2=m2;
 }
    int getSub1(){
        return sub1;
    }
    int getSub2(){
        return sub2;
    }

 void displayMarks(){
    System.out.println("the sub1 marks is"+sub1);
    System.out.println("the  second marks is"+sub2);
 }

}
interface  Sports {
    int sport_wt=25;
 
    
 }
 class Result extends Test implements Sports{
     int total=sub1+sub2+roll_number;
     @Override
     void displayMarks() {
         // TODO Auto-generated method stub
         super.displayMarks();
     }
     @Override
     void displayRoll() {
         // TODO Auto-generated method stub
         super.displayRoll();
     }
     void displayTotal(){
        System.out.println("the total is"+total);
     }
     

 }


public class Q1 {
    public static void main(String[] args) {
        Result r1= new Result();
        r1.displayMarks();
        r1.displayRoll();
        r1.displayTotal();
        System.err.println("the sport is"+r1.sport_wt);
        
    }
    
}
