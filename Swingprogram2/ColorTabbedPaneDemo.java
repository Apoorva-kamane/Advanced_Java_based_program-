package lab_5;
import javax.swing.*;
import java.awt.*;
public class ColorTabbedPaneDemo {
	
	    public static void main(String[] args) {
	        // Create the main JFrame
	        JFrame frame = new JFrame("Color Tabbed Pane");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 300);
	        frame.setLocationRelativeTo(null); // center the frame

	        // Create the JTabbedPane
	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Create panels with different background colors
	        JPanel redPanel = new JPanel();
	        redPanel.setBackground(Color.RED);

	        JPanel bluePanel = new JPanel();
	        bluePanel.setBackground(Color.BLUE);

	        JPanel greenPanel = new JPanel();
	        greenPanel.setBackground(Color.GREEN);

	        // Add tabs to the tabbed pane
	        tabbedPane.addTab("RED", redPanel);
	        tabbedPane.addTab("BLUE", bluePanel);
	        tabbedPane.addTab("GREEN", greenPanel);

	        // Add the tabbed pane to the frame
	        frame.add(tabbedPane);

	        // Make the frame visible
	        frame.setVisible(true);
	    }
	


}
