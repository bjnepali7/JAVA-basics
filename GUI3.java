import javax.swing.*;

public class GUI3  extends JFrame{
    GUI3(String s1){
        super(s1);

    }
    GUI3(){

    }
    public static void main(String[] args) {
        GUI3 d1= new GUI3("hello acarye");
        d1.setVisible(true);
        d1.setSize(600,600);
        d1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}
