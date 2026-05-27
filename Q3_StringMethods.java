//Create String Demo class and perform different string manipulation
//methods.
package Assignment1;

public class Q3_StringMethods {

	public static void main(String[] args) {

		String str1 = "Welcome to Java";
		String str2 = "welcome to java";

		System.out.println(str1);
		System.out.println(str2);
		System.out.println("\nMethods: ");

		System.out.println("length: " + str1.length());
		System.out.println("uppercase: " + str1.toUpperCase());
		System.out.println("lowercase: " + str1.toLowerCase());
		System.out.println("equals: " + str1.equals(str2));
		System.out.println("equalsIgnoreCase: " + str1.equalsIgnoreCase(str2));
		System.out.println("contains: " + str1.contains("to"));
		System.out.println("indexOf: " + str1.indexOf('o'));
		System.out.println("lastIndexOf: " + str1.lastIndexOf('o'));
		System.out.println("substring: " + str1.substring(3));
		System.out.println("replace: " + str1.replace('a', 'x'));
		System.out.println("trim: " + str1.trim());
		System.out.println("concat: " + str1.concat(" " + str2));
		System.out.println("charAt: " + str1.charAt(2));
		System.out.println("isEmpty: " + str1.isEmpty());
		System.out.println("startsWith: " + str1.startsWith("Welcome"));
		System.out.println("endsWith: " + str1.endsWith("Java"));
	}
}