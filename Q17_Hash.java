//Create an Employee HashSet collection and override equals &hashCode
//methods to understand how the set maintains uniqueness using these methods.
package Assignment1;

import java.util.HashSet;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Employee e = (Employee) obj;
        return this.id == e.id;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class Q17_Hash {
    public static void main(String[] args) {

        HashSet<Employee> set = new HashSet<>();

        set.add(new Employee(1, "Hrutik"));
        set.add(new Employee(2, "Rahul"));
        set.add(new Employee(3, "Atharva"));
        set.add(new Employee(1, "Hrutik"));

        System.out.println("Employees in HashSet:");
        for (Employee e : set) {
            System.out.println(e);
        }
    }
}