import javax.swing.*;
import java.awt.event.*;
public class GUI6 extends JFrame {
   JLabel g1,g2,g3,g4;
   JTextField t3;
   JPasswordField t4;
   JButton b3,b4,b5;

   GUI6(String s){
    super(s);

   }
   GUI6(){}
   public void setComponent(){
    
    g1= new JLabel("welcome to my code");
    g2= new JLabel("username");
    g3= new JLabel("password");
    g4= new JLabel("");
    t3= new JTextField();
    t4= new JPasswordField();
    b3=new JButton("login");
    b4= new JButton("clear");
    b5= new JButton("Add");
   

    add(g1);
    add(g2);
    add(g3);
    add(g4);
    add(t3);
    add(t4);
    add(b3);
    add(b4);
    add(b5);
       
    g1.setBounds(250, 50, 200, 30);   // Welcome label (centered at the top)
    g2.setBounds(150, 150, 100, 30); // Username label
    g3.setBounds(150, 200, 100, 30); // Password label
    g4.setBounds(100, 400, 120, 40);
    t3.setBounds(300, 150, 250, 30); // Username text field
    t4.setBounds(300, 200, 250, 30); // Password field
    b3.setBounds(200, 300, 120, 40); // Login button
    b4.setBounds(350, 300, 120, 40); // Clear button
    b5.setBounds(400,350, 120, 40);//add button
    setLayout(null);
    b3.addActionListener(new logss());
    b4.addActionListener(new clear());
    b5.addActionListener(new add());

    

   }

    public static void main(String[] args) {
        GUI6 g= new GUI6("hello");
        g.setVisible(true);
        
        g.setSize(700,700);
        g.setComponent();

        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
     class logss implements ActionListener{

        public void actionPerformed(ActionEvent e1){
            String s1= t3.getText();
            String  s2= t4.getText();
            if(s1.equals("bijay")||s2.equals("obb")){
                g4.setText("login sucessfull");
                
            }
            else{
                g4.setText("login unsucessfull");

            }
        }

     }class clear implements ActionListener{

        public void actionPerformed(ActionEvent e2){
            t3.setText("");
            t4.setText("");

        }

     }
     class add implements ActionListener{// this a another button action in whichn if we add m enter the numbers and add the both yhen it will add those numbers
       public void actionPerformed(ActionEvent e3){
            try{// we have to do exception  handaling .. if  we enter charater and if we add button then exception aauxa teslai handale garana hanadaling
                int a= Integer.parseInt(t3.getText());// this basically changes charater to the int vallue
                int b= Integer.parseInt(t4.getText());
                int c=a+b;
                g4.setText("addtion is"+c);


            }
            catch(Exception e){
                System.err.println("wrong message");

            }

        }
     }
    
}
