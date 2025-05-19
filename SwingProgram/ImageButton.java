package lab_4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButton {
	


	    public static void main(String[] args) {
	        // Create the main JFrame
	        JFrame frame = new JFrame("Image Button Demo");
	        frame.setLayout(new FlowLayout());

	        // Create a label to show the message
	        JLabel messageLabel = new JLabel("");
	        messageLabel.setFont(new Font("Arial", Font.PLAIN, 24));

	        // Load images
	        ImageIcon digitalIcon = new ImageIcon("digital.png");
	        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

	        // Create buttons with images
	        JButton digitalButton = new JButton(digitalIcon);
	        JButton hourglassButton = new JButton(hourglassIcon);

	        // Add ActionListeners to buttons
	        digitalButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("Digital Clock is pressed");
	            }
	        });

	        hourglassButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("Hour Glass is pressed");
	            }
	        });

	        // Add components to the frame
	        frame.add(digitalButton);
	        frame.add(hourglassButton);
	        frame.add(messageLabel);

	        // Set frame properties
	        frame.setSize(500, 300);
	        frame.setLocationRelativeTo(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	


}
