import javax.swing.*;

public class GUI2 extends JFrame {
    GUI2(String s1){
        super(s1);

    }
    GUI2(){}
    public static void main(String[] args) {
        GUI2 g1=new GUI2("Facebook");
        g1.setVisible(true);
        g1.setSize(500,500);
        g1.setDefaultCloseOperation(GUI2.EXIT_ON_CLOSE);
        
    }
    
}
