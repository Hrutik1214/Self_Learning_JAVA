//Create a class Employee and encapsulate the data members

package Assignment1;

class EmployeeData {

	private int id;
	private String name;
	private double salary;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		} else {
			System.out.println("Invalid salary");
		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
}

class Q5_Emp {
	public static void main(String[] args) {

		EmployeeData e = new EmployeeData();

		e.setId(103);
		e.setName("Amit");
		e.setSalary(60000);

		System.out.println("Employee Details");
		System.out.println("ID: " + e.getId());
		System.out.println("Name: " + e.getName());
		System.out.println("Salary: " + e.getSalary());
	}
}