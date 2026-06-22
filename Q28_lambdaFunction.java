//Create multiple threads using lamda expression.
package Assignment1;

public class Q28_lambdaFunction {
	public static void main(String[] args) {

		// Batsman Thread
		Thread batsman = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Batsman hits shot " + i);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
		});

		// Bowler Thread
		Thread bowler = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Bowler bowls ball " + i);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
		});

		// Umpire Thread
		Thread umpire = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Umpire gives decision for ball " + i);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
		});

		// Start all threads
		batsman.start();
		bowler.start();
		umpire.start();
	}

}
