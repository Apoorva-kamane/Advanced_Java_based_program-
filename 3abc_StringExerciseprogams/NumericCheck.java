package lab_3;
import java.util.Scanner;
public class NumericCheck {


	    // User-defined function to check if a string is numeric
	    public static boolean isNumeric(String str) {
	        if (str == null || str.isEmpty()) {
	            return false;
	        }

	        // Check each character
	        for (char ch : str.toCharArray()) {
	            if (!Character.isDigit(ch)) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get input string from user
	        System.out.print("Enter a string to check: ");
	        String input = scanner.nextLine();

	        // Check if numeric
	        if (isNumeric(input)) {
	            System.out.println("The string contains only numeric characters.");
	        } else {
	            System.out.println("The string contains non-numeric characters.");
	        }

	        scanner.close();
	    }
	


}
