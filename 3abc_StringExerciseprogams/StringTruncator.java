/*Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/

package lab_3;
import java.util.Scanner;

public class StringTruncator {

	    // User-defined function to truncate a string with ellipsis
	    public static String truncate(String str, int maxLength) {
	        if (str == null || maxLength <= 0) {
	            return "...";
	        }

	        // If string is shorter than or equal to maxLength, return it as is
	        if (str.length() <= maxLength) {
	            return str;
	        }

	        // Else, return the truncated string with ellipsis
	        return str.substring(0, maxLength) + "...";
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get string and max length from user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        System.out.print("Enter maximum length: ");
	        int length = scanner.nextInt();

	        // Call the truncate function
	        String result = truncate(input, length);
	        System.out.println("Truncated string: " + result);

	        scanner.close();
	    }
	


}
