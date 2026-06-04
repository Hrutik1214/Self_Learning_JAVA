// Queue data structure using LinkedList and Queue collection.
package Assignment1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q16_Queue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();

		System.out.println("How many elements to add:");
		int n = sc.nextInt();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			q.add(sc.nextInt());
		}

		System.out.println("Queue: " + q);

		// remove front element
		q.remove();
		System.out.println("After remove: " + q);

		System.out.println("Front element: " + q.peek());
	}
}