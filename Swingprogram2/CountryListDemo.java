package lab_5;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CountryListDemo {
	
	    public static void main(String[] args) {
	        // Create the frame
	        JFrame frame = new JFrame("Country Selector");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(300, 250);
	        frame.setLayout(new FlowLayout());

	        // List of countries
	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada", "Denmark",
	            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
	        };

	        // Create the JList and wrap in JScrollPane
	        JList<String> countryList = new JList<>(countries);
	        countryList.setVisibleRowCount(6);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	        JScrollPane scrollPane = new JScrollPane(countryList);

	        // Add selection listener to print selected countries
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    java.util.List<String> selectedCountries = countryList.getSelectedValuesList();
	                    System.out.println("Selected countries: " + selectedCountries);
	                }
	            }
	        });

	        // Add components to the frame
	        frame.add(scrollPane);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	    }
	


}
