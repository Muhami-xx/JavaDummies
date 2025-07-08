import javax.swing.*;
public class HelloWorldButton{
    public static void main(String[] args) {
    //New Jframe/window    
    JFrame frame = new JFrame("Hello World Button");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300,200);
    //Button with text
    JButton button=new JButton("HelloWorld");
    //actionlistener to the button ie, what happens after clicking- display a message
    button.addActionListener(e-> {
        JOptionPane.showMessageDialog(frame, "Thankyou for clicking the button!");
    });
    //Add the button to the frame
    frame.getContentPane().add(button);
//Make frame visible
    frame.setVisible(true);
    }
}