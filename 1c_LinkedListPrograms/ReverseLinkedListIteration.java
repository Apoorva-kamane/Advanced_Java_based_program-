package lab_1;
import java.util.LinkedList;
import java.util.Iterator;
public class ReverseLinkedListIteration {
	 public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> colors = new LinkedList<>();

	        // Add elements to the LinkedList
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display the original list
	        System.out.println("Original LinkedList: " + colors);

	        // Create a descending iterator
	        Iterator<String> reverseIterator = colors.descendingIterator();

	        // Iterate and print elements in reverse order
	        System.out.println("LinkedList in reverse order:");
	        while (reverseIterator.hasNext()) {
	            System.out.println(reverseIterator.next());
	        }
	    }
}
