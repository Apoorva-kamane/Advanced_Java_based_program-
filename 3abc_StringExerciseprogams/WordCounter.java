/*Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()*/

package lab_3;

public class WordCounter {
	

	    // User-defined function to count words
	    public static int countWords(String str) {
	        if (str == null || str.trim().isEmpty()) {
	            return 0;
	        }

	        // Split the string by one or more whitespace characters
	        String[] words = str.trim().split("\\s+");
	        return words.length;
	    }

	    public static void main(String[] args) {
	        String text = "Java is a powerful programming language";
	        System.out.println(text);

	        int wordCount = countWords(text);
	        System.out.println("Number of words: " + wordCount);
	    }
	


}
