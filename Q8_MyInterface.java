//Implemention of functional Interface with anonymous class and lamda expression
package Assignment1;

public class Q8_MyInterface {
	public static void main(String[] args) {

		int a = 15;
		int b = 5;

		// Anonymous class
		Q8_Interface obj1 = new Q8_Interface() {
			public void calculate(int x, int y) {
				System.out.println("Anonymous Class");
				System.out.println("Subtraction: " + (x - y));
			}
		};
		obj1.calculate(a, b);

		// Lambda expression
		Q8_Interface obj2 = (x, y) -> {
			System.out.println("Lambda Expression");
			System.out.println("Multiplication: " + (x * y));
		};
		obj2.calculate(a, b);
	}
}
