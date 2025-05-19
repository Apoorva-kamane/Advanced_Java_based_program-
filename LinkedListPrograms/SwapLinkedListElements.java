package lab_1;
import java.util.LinkedList;
import java.util.Collections;

public class SwapLinkedListElements {
	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> colorList = new LinkedList<>();

	        // Add some colors
	        colorList.add("Red");     // index 0
	        colorList.add("Green");   // index 1
	        colorList.add("Blue");    // index 2
	        colorList.add("Yellow");
	        colorList.add("Orange");

	        // Display the original list
	        System.out.println("Original LinkedList: " + colorList);

	        // Swap first (index 0) and third (index 2) elements
	        Collections.swap(colorList, 0, 2);

	        // Display the list after swapping
	        System.out.println("LinkedList after swapping first and third elements: " + colorList);
	    }
	


}
