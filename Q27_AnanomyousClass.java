//Create multiple threads using anonymous inner classes.
package Assignment1;

public class Q27_AnanomyousClass {

	public static void main(String[] args) {

		// 1: Student studying
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Student A is studying");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
				System.out.println("Student A finished study");
			}
		});

		// 2: Student writing exam
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Student B is writing exam");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
				System.out.println("Student B finished exam");
			}
		});

		// 3: Student playing
		Thread t3 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Student C is playing the Cricked");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
				System.out.println("Student C finished playing cricket");
			}
		});

		// Start threads
		t1.start();
		t2.start();
		t3.start();
	}
}

