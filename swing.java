import javax.swing.*; // For Swing components
import java.awt.event.*; // For event handling
import java.awt.*; // For layout and graphics

public class swing extends JFrame {
    JLabel j1, j2, j3, j4; // Labels for displaying text
    JTextField p1; // Text field for username input
    JPasswordField p2; // Password field for password input
    JButton k1, k2, k3, k4; // Buttons for various actions

    // Constructor to initialize JFrame with a title
    swing(String s) {
        super(s);
    }

    // Default constructor
    swing() {}

    // Method to set up components in the JFrame
    public void setComponent() {
        // Create a custom cursor of type HAND_CURSOR
        Cursor c1 = new Cursor(Cursor.HAND_CURSOR);

        // Create a custom font object
        Font f1 = new Font("Times New Roman", Font.BOLD, 12);

        // Initialize labels with text
        j1 = new JLabel("welcome brother");
        j1.setFont(f1); // Set custom font to the label
        j1.setForeground(Color.RED); // Set text color to red

        j2 = new JLabel("username");
        j3 = new JLabel("pasword");
        j4 = new JLabel(); // Blank label to display results

        // Initialize text fields and password field
        p1 = new JTextField();
        p2 = new JPasswordField();

        // Initialize buttons with action names
        k1 = new JButton("login");
        k1.setCursor(c1); // Set custom cursor for the button
        k2 = new JButton("clear");
        k3 = new JButton("add");
        k4 = new JButton("autofill");

        // Add components to the JFrame
        add(j1);
        add(j2);
        add(j3);
        add(j4);
        add(p1);
        add(p2);
        add(k1);
        add(k2);
        add(k3);
        add(k4);

        // Set layout to null for absolute positioning
        setLayout(null);

        // Set bounds for each component (position and size)
        j1.setBounds(250, 100, 100, 30);
        j2.setBounds(200, 200, 100, 30);
        j3.setBounds(200, 300, 100, 30);
        j4.setBounds(200, 500, 100, 30);
        p1.setBounds(300, 200, 100, 30);
        p2.setBounds(300, 300, 100, 30);
        k1.setBounds(250, 350, 100, 30);
        k2.setBounds(350, 350, 100, 30);
        k3.setBounds(350, 400, 100, 30);
        k4.setBounds(350, 450, 100, 30);

        // Add action listeners for button clicks
        k1.addActionListener(new logs());
        k2.addActionListener(new clear());
        k3.addActionListener(new add());
        k4.addActionListener(new auto());

        // Add mouse listener to the login button
        k1.addMouseListener(new m1());
    }

    // Main method to run the application
    public static void main(String[] args) {
        swing h = new swing("hello"); // Create JFrame instance
        h.setVisible(true); // Make frame visible
        h.setSize(700, 700); // Set size of the frame
        h.setComponent(); // Call method to set up components
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close application on exit
    }

    // Inner class for login functionality
    class logs implements ActionListener {
        public void actionPerformed(ActionEvent e1) {
            String s1 = p1.getText(); // Get text from username field
            String s2 = p2.getText(); // Get text from password field
            if (s1.equals("bijay") || s2.equals("bond")) { // Check credentials
                JOptionPane.showMessageDialog(null, "login successful");// this  is a  dialog box.. which is JOptionPain is a class which has f those dialog boxes pre built..it has satic function which can be called
                j4.setText("login successful");
            } else {
                JOptionPane.showMessageDialog(null, "login unsuccessful");
                j4.setText("login unsuccessful");
            }
        }
    }

    // Inner class to clear text fields
    class clear implements ActionListener {
        public void actionPerformed(ActionEvent e2) {
            p1.setText(""); // Clear username field
            p2.setText(""); // Clear password field
        }
    }

    // Inner class to perform addition
    class add implements ActionListener {
        public void actionPerformed(ActionEvent e3) {
            try {
                int a = Integer.parseInt(p1.getText()); // Parse integer from username field
                int b = Integer.parseInt(p2.getText()); // Parse integer from password field
                int c = a + b; // Add the integers
                j4.setText("addition is " + c); // Display the result
            } catch (Exception e) {
                j4.setText("please enter correctly"); // Handle invalid input
            }
        }
    }

    // Inner class to autofill fields
    class auto implements ActionListener {
        public void actionPerformed(ActionEvent e4) {
            p1.setText("bijay"); // Autofill username
            p2.setText("bond"); // Autofill password
        }
    }

    // Inner class to handle mouse events on login button
    class m1 implements MouseListener {
        public void mouseEntered(MouseEvent p) {
            k1.setForeground(Color.RED); // Change text color when mouse enters
        }

        public void mouseClicked(MouseEvent p) {}

        public void mousePressed(MouseEvent p) {}

        public void mouseReleased(MouseEvent p) {}

        public void mouseExited(MouseEvent p) {
            k1.setBackground(Color.white); // Change background color when mouse exits
        }
    }
}
