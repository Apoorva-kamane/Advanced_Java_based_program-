package lab_1;
import java.util.ArrayList;
import java.util.Collections;
public class ColorSorter {
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

        // Sort the colors alphabetically
        Collections.sort(colors);

        // Print sorted list
        System.out.println("Sorted colors list: " + colors);
    }

}
