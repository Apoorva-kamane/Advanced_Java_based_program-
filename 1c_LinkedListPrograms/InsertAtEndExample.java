package lab_1;
import java.util.LinkedList;	
public class InsertAtEndExample {
	public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colorList = new LinkedList<>();

        // Add some initial colors
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");

        // Display the original list
        System.out.println("Original LinkedList: " + colorList);

        // Insert "Pink" at the end using offerLast()
        colorList.offerLast("Pink");

        // Display the updated list
        System.out.println("Updated LinkedList after adding 'Pink' at the end: " + colorList);
    }
}
