package lab_2;

public class StringOperationsDemo {
	    public static void main(String[] args) {

	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = "World";
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

	        // 3. String Comparison
	        String str3 = "hello";
	        System.out.println("str1 equals str3: " + str1.equals(str3));
	        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));

	        // 4. String Searching
	        System.out.println("str1 contains 'ell': " + str1.contains("ell"));
	        System.out.println("Index of 'o' in str1: " + str1.indexOf('o'));

	        // 5. Substring Operations
	        System.out.println("Substring of str2 from index 1: " + str2.substring(1));
	        System.out.println("Substring of str2 from 1 to 4: " + str2.substring(1, 4));

	        // 6. String Modification
	        System.out.println("str1 in uppercase: " + str1.toUpperCase());
	        System.out.println("str2 in lowercase: " + str2.toLowerCase());
	        System.out.println("str1 replaced 'l' with 'x': " + str1.replace('l', 'x'));

	        // 7. Whitespace Handling
	        String messy = "  Trim me   ";
	        System.out.println("Before trim: '" + messy + "'");
	        System.out.println("After trim: '" + messy.trim() + "'");

	        // 8. String Concatenation
	        String combined = str1 + " " + str2;
	        System.out.println("Concatenated string: " + combined);

	        // 9. String Splitting
	        String sentence = "Apple, Banana, Mango";
	        String[] fruits = sentence.split(", ");
	        System.out.println("Splitted fruits:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Java");
	        sb.append(" Programming");
	        sb.insert(0, "Welcome to ");
	        sb.replace(11, 15, "C++"); // Replace "Java" with "C++"
	        System.out.println("StringBuilder result: " + sb.toString());

	        // 11. String Formatting
	        String name = "Alice";
	        int age = 25;
	        String formatted = String.format("My name is %s and I am %d years old.", name, age);
	        System.out.println("Formatted string: " + formatted);

	        // 12. Validate Email
	        String email = "example@gmail.com";
	        boolean isValid = email.contains("@") && email.endsWith(".com") && email.startsWith("example");
	        System.out.println("Email validation result: " + isValid);
	    }
	


}
