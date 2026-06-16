//Create a Deadlock class to demonstrate deadlock in multithreading environment.
package Assignment1;

public class Q23_DeadLock {

	String name;
	int marks;

	Q23_DeadLock(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	public static void main(String[] args) {

		Q23_DeadLock resource1 = new Q23_DeadLock("Rohit", 264);
		Q23_DeadLock resource2 = new Q23_DeadLock("Virat", 200);

		Thread t1 = new Thread(() -> {
			synchronized (resource1) {
				System.out.println("Thread 1 locked " + resource1.name);

				try {
					Thread.sleep(100);
				} catch (Exception e) {
				}

				System.out.println("Thread 1 waiting for " + resource2.name);
				synchronized (resource2) {
					System.out.println("Thread 1 locked " + resource2.name);
				}
			}
		});

		Thread t2 = new Thread(() -> {
			synchronized (resource2) {
				System.out.println("Thread 2 locked " + resource2.name);

				try {
					Thread.sleep(100);
				} catch (Exception e) {
				}

				System.out.println("Thread 2 waiting for " + resource1.name);
				synchronized (resource1) {
					System.out.println("Thread 2 locked " + resource1.name);
				}
			}
		});

		t1.start();
		t2.start();
	}
}
