//this keyword is an reference variable that points to the object
// name confilcting problem is  solved by this keyword
//in every function their is the this keyword
// this is   refernce variable that points to the current object

class sum{
    private int x;
    private int y;
    sum(int x,int y){
        this.x=x;
        this.y=y;

    }
    void Display(){
        System.out.println("the sum is:"+(x+y));
    }
}




public class Thiskeywordexample {
    public static void main(String[] args) {
        sum s=new sum(5, 7);
        s.Display();
    }
    
}
