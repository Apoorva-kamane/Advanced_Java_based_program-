package lab_5;
import javax.swing.*;
import java.awt.*;
public class ColorTabbedPaneDemo2 {

	    public static void main(String[] args) {
	        // Create the main JFrame
	        JFrame frame = new JFrame("Cyan Magenta Yellow Tabs");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 300);
	        frame.setLocationRelativeTo(null); // Center the window
	        frame.setLayout(new BorderLayout());

	        // Create a JTabbedPane
	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Create panels for each color
	        JPanel cyanPanel = new JPanel();
	        cyanPanel.setBackground(Color.CYAN);

	        JPanel magentaPanel = new JPanel();
	        magentaPanel.setBackground(Color.MAGENTA);

	        JPanel yellowPanel = new JPanel();
	        yellowPanel.setBackground(Color.YELLOW);

	        // Add tabs to the tabbed pane
	        tabbedPane.addTab("Cyan", cyanPanel);
	        tabbedPane.addTab("Magenta", magentaPanel);
	        tabbedPane.addTab("Yellow", yellowPanel);

	        // Add the tabbed pane to the frame
	        frame.add(tabbedPane, BorderLayout.CENTER);

	        // Show the frame
	        frame.setVisible(true);
	    }
	

}
