import javax.swing.*;
import java.awt.event.*;
// the action event when we click the bottom what it does  is given in the package in the awt.event..
// when we click what event it occer is the  evnt that it does is givenn un the above the pacage
public class actionlistner extends JFrame{

    JLabel l1,l2,l3,l4;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
    actionlistner(String s){
        super(s);
    }
    actionlistner(){}
    void setComponent(){
        l1=new JLabel("hello to my code");
        l2=new JLabel("username");
        l3=new JLabel("password");
        l4=new JLabel();
        t1= new JTextField();
        t2= new JPasswordField();
        b1 =new JButton("Login");
        b2= new JButton("Clear");
        add(l1);// basicslly addind to the frame it has the  function  add() to do it 
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        setLayout(null);// this will set the layout
        l1.setBounds(250,100,100,30);// teir is the function which set the boundary of the layout
        l2.setBounds(200,200,100,30);
        l3.setBounds(200,300,100,30);
        l4.setBounds(200,450,100,30);
        t1.setBounds(300,200,100,30);
        t2.setBounds(300,300,100,30);
        b1.setBounds(250,350,100,30);
        b2.setBounds(350,350,100,30);
        b1.addActionListener(new Logs());//  there is a function in the  awt.event i.e addactionListner(ActionListner e1) which added to the button
        b2.addActionListener(new Clear());

    }

    public static void main(String[] args) {
     actionlistner g1=new actionlistner("hello");
     g1.setVisible(true);// this is for the gui to be visible
     g1.setComponent();
     g1.setSize(700,700);
     g1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//This is a predefined constant in the JFrame class. 
     //It indicates that the application should terminate (exit) when the user closes the window.
        
        
    }
    class Logs implements ActionListener{
        public void actionPerformed(ActionEvent e1){
            String s1= t1.getText();
            String s2= t2.getText();
            if( s1.equals("bijay")||s2.equals("code")){
                l4.setText("login sucessfull");
            }else{
                l4.setText("login unsucessfull");
            }

        }

    }
     class Clear implements ActionListener {
        public void actionPerformed(ActionEvent e2){
            t1.setText("");
            t2.setText("");
        }
     }
    
}
