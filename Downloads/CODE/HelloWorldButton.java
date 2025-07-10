import javax.swing.*;
import java.awt.Dimension;
import java.awt.Component;

public class HelloWorldButton{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World Buttons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Set layout to BoxLayout for vertical column
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Create a fixed size for both buttons
        Dimension buttonSize = new Dimension(200, 40);

        // First button
        JButton button1 = new JButton("HelloWorld");
        button1.setMaximumSize(buttonSize); // Set max size
        button1.setPreferredSize(buttonSize); // Set preferred size
        button1.setAlignmentX(Component.CENTER_ALIGNMENT); // Center horizontally
        button1.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Thank you for clicking the HelloWorld button!");
        });

        // Second button
        JButton button2 = new JButton("Hi Sam");
        button2.setMaximumSize(buttonSize);
        button2.setPreferredSize(buttonSize);
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);
        button2.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Happy Coding Sir!");
        });

        // Add vertical spacing and both buttons to the frame
        frame.getContentPane().add(Box.createVerticalGlue()); // Push buttons to center vertically
        frame.getContentPane().add(button1);
        frame.getContentPane().add(Box.createRigidArea(new Dimension(0, 15))); // Space between buttons
        frame.getContentPane().add(button2);
        frame.getContentPane().add(Box.createVerticalGlue()); // Push buttons to center vertically

        frame.setVisible(true);
    }
}