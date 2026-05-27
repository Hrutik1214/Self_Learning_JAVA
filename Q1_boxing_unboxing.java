// Create sample classes to understand boxing & unboxing.

package Assignment1;

class Q1_boxing_unboxing {
	public static void main(String[] args) {

		int i = 110;
		double d = 25.5;
		char c = 'A';
		boolean b = false;

		// boxing = Primitive -> Object
		Integer objInt = i;
		Double objDouble = d;
		Character objChar = c;
		Boolean objBool = b;

		System.out.println("BOXING");
		System.out.println("Int Obj: " + objInt);
		System.out.println("Double Obj: " + objDouble);
		System.out.println("Char Obj: " + objChar);
		System.out.println("Bool Obj: " + objBool);

		// unboxing = Object -> Primitive
		int i2 = objInt;
		double d2 = objDouble;
		char c2 = objChar;
		boolean b2 = objBool;

		System.out.println("\nUNBOXING");
		System.out.println("int: " + i2);
		System.out.println("double: " + d2);
		System.out.println("char: " + c2);
		System.out.println("boolean: " + b2);
	}
}