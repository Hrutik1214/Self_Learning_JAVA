//Use different methods of java defined wrapper classes. 

package Assignment1;

public class Q2_WrapperClass {

	public static void main(String[] args) {

		Integer obj1 = Integer.valueOf(100); // primitive to object
		System.out.println("valueOf: " + obj1);

		int num = Integer.parseInt("200"); // string to int
		System.out.println("parseInt: " + num);

		String str = obj1.toString(); // object to string
		System.out.println("toString: " + str);

		Integer a = 150;
		Integer b = 100;
		System.out.println("compareTo: " + a.compareTo(b)); // compare two values

		Integer x = 100;
		Integer y = 100;
		System.out.println("equals: " + x.equals(y)); // check equality

		Double d1 = 11.5;
		System.out.println("double: " + d1.doubleValue()); // to double

		Character ch = 'A';
		System.out.println("char: " + ch.charValue()); // to char

		Boolean flag = true;
		System.out.println("boolean: " + flag.booleanValue()); // to boolean
	}
}