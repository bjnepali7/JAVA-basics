package Questions.javaobjecetbasic;
// Q3. Write a class `Book` with private attributes title and author. 
// Use getters and setters to access and update the attributes.



class Book{
    private  String title;
    private String auther;

    public  void setTitle(String title){
        this.title=title;
    }
    public  String  getTitle(){
        return title;


    }

      public  void setAuther(String auther){
        this.auther=auther;
    }
    public  String  getAuther(){
        return auther;

    }

    public void displayTitle(){
        System.out.println("the title of the book is"+"\t"+title);
    }
    public void displayAuther(){
        System.out.println("the auther of the book is"+"\t"+auther);
    }

}
public class BookD{
    public static void main(String[] args) {
        Book b=new Book();
        b.setTitle("The brave one ");
        b.displayTitle();
        b.setAuther("bijasy");
        b.displayAuther();
        
    }
    
}
