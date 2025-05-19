package lab_1;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListIteratorExample {
	
	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> colors = new LinkedList<>();

	        // Add elements to the LinkedList
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display original list
	        System.out.println("Original LinkedList: " + colors);

	        // Create an iterator starting at the 2nd position (index 1)
	        Iterator<String> iterator = colors.listIterator(1);

	        // Iterate and print elements from 2nd position onwards
	        System.out.println("Iterating from the 2nd position:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	


}
