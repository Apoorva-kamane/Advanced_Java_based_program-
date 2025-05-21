/*Write a Java Program for Reversing the characters in a string using user defined function
reverseString().*/

package lab_3;
import java.util.Scanner;
public class StringReversal {
	    // User-defined function to reverse a string
	    public static String reverseString(String str) {
	        StringBuilder reversed = new StringBuilder(str);
	        return reversed.reverse().toString();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get string input from user
	        System.out.print("Enter a string to reverse: ");
	        String input = scanner.nextLine();

	        // Call the reverse function
	        String reversed = reverseString(input);
	        System.out.println("Reversed string: " + reversed);

	        scanner.close();
	    }
	

}
