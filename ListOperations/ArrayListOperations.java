package lab_1;
import java.util.*;
public class ArrayListOperations {
	

	
	    public static void main(String[] args) {
	        // 1. Creating an ArrayList and adding initial elements
	        ArrayList<String> fruits = new ArrayList<>();
	        System.out.println("Creating an ArrayList and adding initial elements ");
	        System.out.println();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Orange");
	        System.out.println("Initial list: " + fruits);

	        // 2. Adding an element at a specific index
	        fruits.add(1, "Grapes");
	        System.out.println("After adding 'Grapes' at index 1: " + fruits);

	        // 3. Adding multiple elements
	        List<String> moreFruits = Arrays.asList("Mango", "Pineapple");
	        fruits.addAll(moreFruits);
	        System.out.println("After adding multiple elements: " + fruits);

	        // 4. Accessing elements
	        String secondFruit = fruits.get(1);
	        System.out.println("Element at index 1: " + secondFruit);

	        // 5. Updating elements
	        fruits.set(2, "Kiwi");
	        System.out.println("After updating index 2 to 'Kiwi': " + fruits);

	        // 6. Removing elements
	        fruits.remove("Banana"); // Remove by value
	        fruits.remove(0);        // Remove by index
	        System.out.println("After removing elements: " + fruits);

	        // 7. Searching elements
	        boolean hasMango = fruits.contains("Mango");
	        System.out.println("List contains 'Mango': " + hasMango);

	        // 8. List size
	        int size = fruits.size();
	        System.out.println("List size: " + size);

	        // 9. Iterating over list using for-each loop
	        System.out.print("Iterating using for-each loop: ");
	        for (String fruit : fruits) {
	            System.out.print(fruit + " ");
	        }
	        System.out.println();

	        // 10. Using Iterator
	        System.out.print("Iterating using Iterator: ");
	        Iterator<String> iterator = fruits.iterator();
	        while (iterator.hasNext()) {
	            System.out.print(iterator.next() + " ");
	        }
	        System.out.println();

	        // 11. Sorting
	        Collections.sort(fruits);
	        System.out.println("After sorting: " + fruits);

	        // 12. Sublist
	        if (fruits.size() >= 2) {
	            List<String> sublist = fruits.subList(0, 2);
	            System.out.println("Sublist (0 to 2): " + sublist);
	        } else {
	            System.out.println("Sublist not created: list has fewer than 2 elements.");
	        }

	        // 13. Clearing the list
	        fruits.clear();
	        System.out.println("After clearing: " + fruits);
	    }
	


}
