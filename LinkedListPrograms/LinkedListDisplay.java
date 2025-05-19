package lab_1;
import java.util.LinkedList;
public class LinkedListDisplay {
	
	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> colorList = new LinkedList<>();

	        // Add some colors
	        colorList.add("Red");
	        colorList.add("Green");
	        colorList.add("Blue");
	        colorList.add("Yellow");
	        colorList.add("Orange");

	        // Display each element with its position
	        System.out.println("Elements and their positions:");
	        for (int i = 0; i < colorList.size(); i++) {
	            System.out.println("Position " + i + ": " + colorList.get(i));
	        }
	    }
	


}
