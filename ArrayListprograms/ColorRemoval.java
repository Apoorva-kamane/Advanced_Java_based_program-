package lab_1;
import java.util.ArrayList;
public class ColorRemoval {
	

	
	    public static void main(String[] args) {
	        // Create an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add different colors
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Print original list
	        System.out.println("Original colors list: " + colors);

	        // Remove the 2nd element (index 1)
	        if (colors.size() > 1) {
	            colors.remove(1); // Removes "Green"
	        }

	        // Remove color "Blue" by value
	        colors.remove("Blue");

	        // Print updated list
	        System.out.println("Updated colors list: " + colors);
	    }
	


}
