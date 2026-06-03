//Create a collection of Employee class and sort objects using comparable
//and comparator interfaces.
package Assignment1;

import java.util.*;

class Employee1 implements Comparable<Employee1> {
	int id;
	String name;
	double salary;

	Employee1(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// sort by id
	public int compareTo(Employee1 s) {
		return this.id - s.id;
	}

	void show() {
		System.out.println(id + " " + name + " " + salary);
	}
}

// sort by name
class SortByName implements Comparator<Employee1> {
	public int compare(Employee1 a, Employee1 b) {
		return a.name.compareTo(b.name);
	}
}

// sort by salary
class SortBySalary implements Comparator<Employee1> {
	public int compare(Employee1 a, Employee1 b) {
		return Double.compare(a.salary, b.salary);
	}
}

public class Q11_or_Q15_comparable_and_comparator {
	public static void main(String[] args) {

		ArrayList<Employee1> list = new ArrayList<>();

		list.add(new Employee1(3, "Hrutik", 55000));
		list.add(new Employee1(1, "Rahul", 42000));
		list.add(new Employee1(2, "Atharva", 48000));

		// Sort by ID
		Collections.sort(list);
		System.out.println("Sort by ID:");
		for (Employee1 s : list) {
			s.show();
		}

		// Sort by Name
		Collections.sort(list, new SortByName());
		System.out.println("\nSort by Name:");
		for (Employee1 s : list) {
			s.show();
		}

		// Sort by Salary
		Collections.sort(list, new SortBySalary());
		System.out.println("\nSort by Salary:");
		for (Employee1 s : list) {
			s.show();
		}
	}
}