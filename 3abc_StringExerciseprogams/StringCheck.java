/*Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty().*/

package lab_3;
import java.util.Scanner;
public class StringCheck {
	

	public class CheckStringNullOrEmpty {
	    
	    // User-defined function to check null or only whitespace
	    public static boolean isNullOrEmpty(String str) {
	        return str == null || str.trim().isEmpty();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Check using the function
	        if (isNullOrEmpty(input)) {
	            System.out.println("The string is null or contains only whitespace.");
	        } else {
	            System.out.println("The string is valid and contains characters.");
	        }

	        scanner.close();
	    }
	}


}
