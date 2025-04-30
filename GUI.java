import javax.swing.*;// we have to import the  swing classes to make gui in the java
// gui stands for graphical user interface 
//Gui has three parts
//1.container(JFrame,JPanel)
//2.Components(JLabel,JCheckbox,JRadioButton)
public class GUI{

    public static void main(String[] args) {
        JFrame j1= new JFrame("First Gui");
        j1.setSize(500,500);// Jframe has the setSize() fuction to set size of our interfaces 

        j1.setVisible(true);// it has setVisible() function for the  output
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// it has setVisibleCloseOperation is  function which  closes on close tab
        // EXIT_ON_CLOSE is a static variable  which closes on clicking  it can be acess by class name.

        
    }
    
}
