package lab_5;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;
public class CountryCapitalList {
	

	
	    public static void main(String[] args) {
	        // Create the JFrame
	        JFrame frame = new JFrame("Country and Capital Viewer");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 300);
	        frame.setLayout(new FlowLayout());

	        // Countries array
	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada", "Denmark",
	            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
	        };

	        // Country-Capital map
	        HashMap<String, String> capitals = new HashMap<>();
	        capitals.put("USA", "Washington, D.C.");
	        capitals.put("India", "New Delhi");
	        capitals.put("Vietnam", "Hanoi");
	        capitals.put("Canada", "Ottawa");
	        capitals.put("Denmark", "Copenhagen");
	        capitals.put("France", "Paris");
	        capitals.put("Great Britain", "London");
	        capitals.put("Japan", "Tokyo");
	        capitals.put("Africa", "No single capital (continent)");
	        capitals.put("Greenland", "Nuuk");
	        capitals.put("Singapore", "Singapore");

	        // Create the JList
	        JList<String> countryList = new JList<>(countries);
	        countryList.setVisibleRowCount(6);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	        JScrollPane scrollPane = new JScrollPane(countryList);

	        // Add ListSelectionListener to display capitals
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    java.util.List<String> selected = countryList.getSelectedValuesList();
	                    System.out.println("Selected Countries and Capitals:");
	                    for (String country : selected) {
	                        String capital = capitals.getOrDefault(country, "Unknown");
	                        System.out.println(country + " - Capital: " + capital);
	                    }
	                    System.out.println(); // blank line for separation
	                }
	            }
	        });

	        // Add components to frame
	        frame.add(scrollPane);
	        frame.setLocationRelativeTo(null); // center the frame
	        frame.setVisible(true);
	    }
	


}
