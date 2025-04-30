import javax.swing.*;

public class GUI4 extends JFrame {
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1,b2;
    GUI4(String s){
        super(s);
    }
    GUI4(){}
    void setComponent(){
        l1=new JLabel("hello to my code");
        l2=new JLabel("username");
        l3=new JLabel("password");
        l4=new JLabel();
        t1= new JTextField();
        t2= new JTextField();
        b1 =new JButton("Login");
        b2= new JButton("Clear");
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        setLayout(null);
        l1.setBounds(250,100,100,30);
        l2.setBounds(200,200,100,30);
        l3.setBounds(200,300,100,30);
        l4.setBounds(200,300,100,30);
        t1.setBounds(300,200,100,30);
        t2.setBounds(300,300,100,30);
        b1.setBounds(250,350,100,30);
        b2.setBounds(350,350,100,30);

    }
    public static void main(String[] args) {
        GUI4 s1=new GUI4("Hello");
        s1.setVisible(true);
        s1.setSize(500,500);
        s1.setComponent();
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }
}
