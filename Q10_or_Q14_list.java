//Create a list of java defined wrapper classes and perform
//insert/delete/search/iterate/sort operations.
package Assignment1;

import java.util.ArrayList;
import java.util.Collections;

public class Q10_or_Q14_list {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(5);
		list.add(30);
		list.add(20);

		System.out.println("After Insertion " + list);

		if (list.remove(Integer.valueOf(5)))
			;
		System.out.println("After Deletion: " + list);

		if (list.contains(20)) {
			System.out.println("20 found in list");
		} else {
			System.out.println("20 not found");
		}

		System.out.println("Iterating list");
		for (Integer num : list) {
			System.out.println(num);
		}
		Collections.sort(list);
		System.out.println("After sorting: " + list);

	}
}
