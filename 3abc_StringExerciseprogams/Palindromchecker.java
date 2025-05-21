/*Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome():*/

package lab_3;
import java.util.Scanner;

public class Palindromchecker {

	

	    // User-defined function to check if a string is a palindrome
	    public static boolean isPalindrome(String str) {
	        if (str == null) return false;

	        // Remove non-alphanumeric characters and convert to lowercase
	        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        // Check if cleaned string is equal to its reverse
	        String reversed = new StringBuilder(cleaned).reverse().toString();
	        return cleaned.equals(reversed);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get input string from user
	        System.out.print("Enter a string to check for palindrome: ");
	        String input = scanner.nextLine();

	        // Call the function
	        if (isPalindrome(input)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is NOT a palindrome.");
	        }

	        scanner.close();
	    }
	


}
