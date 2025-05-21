package lab_3;
import java.util.Scanner;
public class SubstringCounter {
	

	

	    // User-defined function to count occurrences of a substring
	    public static int countOccurrences(String mainStr, String subStr) {
	        if (mainStr == null || subStr == null || subStr.isEmpty()) {
	            return 0;
	        }

	        int count = 0;
	        int index = 0;

	        // Loop through main string and count each match
	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length(); // Move past the last found substring
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get main string and substring from user
	        System.out.print("Enter the main string: ");
	        String mainStr = scanner.nextLine();

	        System.out.print("Enter the substring to search: ");
	        String subStr = scanner.nextLine();

	        // Call the user-defined function
	        int occurrences = countOccurrences(mainStr, subStr);
	        System.out.println("The substring \"" + subStr + "\" appears " + occurrences + " time(s).");

	        scanner.close();
	    }
	


}
