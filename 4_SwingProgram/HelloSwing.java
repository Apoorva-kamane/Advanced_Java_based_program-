package lab_4;
import javax.swing.*;
import java.awt.*;

public class HelloSwing {
 public static void main(String[] args) {
	        // Create a JFrame
	        JFrame frame = new JFrame("Swing Hello Message");

	        // Create a JLabel with the message
	        JLabel label = new JLabel("Hello! VI A, Welcome to Swing Programming", SwingConstants.CENTER);

	        // Set font: plain style, size 32
	        label.setFont(new Font("Arial", Font.PLAIN, 32));

	        // Set text color to blue
	        label.setForeground(Color.BLUE);

	        // Add label to frame
	        frame.add(label);

	        // Set frame size
	        frame.setSize(700, 200);

	        // Center the frame on screen
	        frame.setLocationRelativeTo(null);

	        // Exit the program when the window is closed
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Make the frame visible
	        frame.setVisible(true);
	    }
	


}
