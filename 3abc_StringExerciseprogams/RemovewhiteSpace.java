/*Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()*/

package lab_3;
import java.util.Scanner;
public class RemovewhiteSpace {

	    // User-defined function to remove all whitespace from a string
	    public static String removeWhitespace(String str) {
	        if (str == null) return "";
	        return str.replaceAll("\\s+", ""); // \s+ matches all whitespace
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a string with whitespaces: ");
	        String input = scanner.nextLine();

	        // Call the function
	        String result = removeWhitespace(input);
	        System.out.println("String without whitespace: " + result);

	        scanner.close();
	    }
	


}
