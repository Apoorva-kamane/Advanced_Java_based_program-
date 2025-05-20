package lab_4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButton {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ImageButton().createGUI());
    }

    private void createGUI() {
        JFrame frame = new JFrame("Image Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 250);
        frame.setLayout(new FlowLayout());

        // Label to display which button is pressed
        JLabel messageLabel = new JLabel("Press a button");
        messageLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        messageLabel.setForeground(Color.BLUE);

        // Load icons (update paths if needed)
        ImageIcon digitalClockIcon = new ImageIcon("images/digital_clock.jpeg");
        ImageIcon hourGlassIcon = new ImageIcon("images/hour_glass.jpeg");

        // Create buttons with text and image
        JButton digitalClockBtn = new JButton("Digital Clock", digitalClockIcon);
        JButton hourGlassBtn = new JButton("Hour Glass", hourGlassIcon);

        // Add ActionListeners
        digitalClockBtn.addActionListener(e -> messageLabel.setText("Digital Clock is pressed"));
        hourGlassBtn.addActionListener(e -> messageLabel.setText("Hour Glass is pressed"));

        // Add components to frame
        frame.add(digitalClockBtn);
        frame.add(hourGlassBtn);
        frame.add(messageLabel);

        frame.setVisible(true);
    }
}