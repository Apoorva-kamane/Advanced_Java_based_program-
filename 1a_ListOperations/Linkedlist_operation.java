/*Develop a Java program for adding elements [Apple, Banana, Orange] into  a LinkedList to perform the following operations with 
different functions directed as follows
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list*/


package lab_1;
import java.util.*;

public class Linkedlist_operation {

	    public static void main(String[] args) {
	        // Initialize LinkedList
	        LinkedList<String> linkedList = new LinkedList<>();

	        // 1. Adding elements
	        linkedList.add("Apple");
	        linkedList.add("Banana");
	        linkedList.add("Orange");
	        System.out.println("After adding elements: " + linkedList);

	        // 2. Adding element at specific index
	        linkedList.add(1, "Grapes");
	        System.out.println("After adding 'Grapes' at index 1: " + linkedList);

	        // 3. Adding multiple elements
	        List<String> moreFruits = Arrays.asList("Mango", "Pineapple");
	        linkedList.addAll(moreFruits);
	        System.out.println("After adding multiple elements: " + linkedList);

	        // 4. Accessing elements
	        String fruitAtIndex2 = linkedList.get(2);
	        System.out.println("Element at index 2: " + fruitAtIndex2);

	        // 5. Updating elements
	        linkedList.set(2, "Kiwi");
	        System.out.println("After updating index 2 to 'Kiwi': " + linkedList);

	        // 6. Removing elements
	        linkedList.remove("Banana"); // Remove by value
	        linkedList.remove(0);        // Remove by index
	        System.out.println("After removing elements: " + linkedList);

	        // 7. Searching elements
	        boolean hasMango = linkedList.contains("Mango");
	        System.out.println("List contains 'Mango': " + hasMango);

	        // 8. List size
	        int size = linkedList.size();
	        System.out.println("List size: " + size);

	        // 9. Iterating over list using for-each loop
	        System.out.print("Iterating using for-each loop: ");
	        for (String fruit : linkedList) {
	            System.out.print(fruit + " ");
	        }
	        System.out.println();

	        // 10. Using Iterator
	        System.out.print("Iterating using Iterator: ");
	        Iterator<String> iterator = linkedList.iterator();
	        while (iterator.hasNext()) {
	            System.out.print(iterator.next() + " ");
	        }
	        System.out.println();

	        // 11. Sorting
	        Collections.sort(linkedList);
	        System.out.println("After sorting: " + linkedList);

	        // 12. Sublist
	        if (linkedList.size() >= 2) {
	            List<String> sublist = linkedList.subList(0, 2);
	            System.out.println("Sublist (0 to 2): " + sublist);
	        } else {
	            System.out.println("Sublist not created: list has fewer than 2 elements.");
	        }

	        // 13. Clearing the list
	        linkedList.clear();
	        System.out.println("After clearing: " + linkedList);
	    }
	

	


}
