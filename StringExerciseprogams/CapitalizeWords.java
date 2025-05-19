package lab_3;
import java.util.Scanner;
public class CapitalizeWords {



	    // User-defined function to capitalize the first letter of each word
	    public static String capitalizeWords(String str) {
	        if (str == null || str.isEmpty()) return "";

	        String[] words = str.trim().split("\\s+"); // split by whitespace
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
	            if (word.length() > 0) {
	                // Capitalize first letter + rest of the word
	                result.append(Character.toUpperCase(word.charAt(0)))
	                      .append(word.substring(1).toLowerCase())
	                      .append(" ");
	            }
	        }

	        return result.toString().trim(); // remove trailing space
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get input string
	        System.out.print("Enter a sentence: ");
	        String input = scanner.nextLine();

	        // Call the function
	        String capitalized = capitalizeWords(input);
	        System.out.println("Capitalized sentence: " + capitalized);

	        scanner.close();
	    }
	


}
