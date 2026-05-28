//implement OOP principles Encapsulation, Abstraction, Inheritance and Polymorphism
package Assignment1;

abstract class Employee2 {
    private int id;
    private String name;

    public Employee2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    abstract void calculateSalary();
}

// Full Time Employee
class FullTimeEmployee extends Employee2 {
    private double salary;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    @Override
    void calculateSalary() {
        System.out.println("Full Time Salary: " + salary);
    }
}


class PartTimeEmployee extends Employee2 {
    private int hours;
    private double rate;

    public PartTimeEmployee(int id, String name, int hours, double rate) {
        super(id, name);  
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    void calculateSalary() {
        System.out.println("Part Time Salary: " + (hours * rate));
    }
}

public class Q6_OOP_Principles {
    public static void main(String[] args) {

        Employee2 a1 = new FullTimeEmployee(1, "Hrutik", 50000);
        Employee2 a2 = new PartTimeEmployee(2, "Gopal", 5, 500);

        System.out.println("Employee 1: " + a1.getName());
        a1.calculateSalary();

        System.out.println("Employee 2: " + a2.getName());
        a2.calculateSalary();
    }
}