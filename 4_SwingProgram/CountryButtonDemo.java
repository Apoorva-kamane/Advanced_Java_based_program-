/*Basic hello program of Swing displaying the message Hello! VI A , Welcome to Swing
Programming in Blue color plain font with font size of 32 using Jframe and Jlabel*/

package lab_4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonDemo {
	    public static void main(String[] args) {
	        // Create a JFrame
	        JFrame frame = new JFrame("Country Button Demo");
	        frame.setLayout(new FlowLayout());

	        // Create two buttons
	        JButton indiaButton = new JButton("India");
	        JButton srilankaButton = new JButton("Srilanka");

	        // Create a label to display the message
	        JLabel messageLabel = new JLabel("");
	        messageLabel.setFont(new Font("Arial", Font.PLAIN, 24));

	        // Add ActionListeners to the buttons
	        indiaButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("India is pressed");
	            }
	        });

	        srilankaButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("Srilanka is pressed");
	            }
	        });

	        // Add components to the frame
	        frame.add(indiaButton);
	        frame.add(srilankaButton);
	        frame.add(messageLabel);

	        // Set frame properties
	        frame.setSize(400, 200);
	        frame.setLocationRelativeTo(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	


}
