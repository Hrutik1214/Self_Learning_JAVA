//Create demo applications to illustrate different types of inheritance.
package Assignment1;

class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

// Single Inheritance
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

// Multilevel Inheritance
class SportsCar extends Car {
    void speed() {
        System.out.println("SportsCar runs fast");
    }
}

// Hierarchical Inheritance
class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding");
    }
}

class Truck extends Vehicle {
    void load() {
        System.out.println("Truck carries goods");
    }
}

// Multiple Inheritance using Interface
interface Electric {
    void charge();
}

class ElectricCar extends Car implements Electric {
    public void charge() {
        System.out.println("ElectricCar is charging");
    }
}

public class Q7_Inheritance {

    public static void main(String[] args) {

        System.out.println("Single Inheritance");
        Car c = new Car();
        c.start();
        c.drive();

        System.out.println("\nMultilevel Inheritance");
        SportsCar sc = new SportsCar();
        sc.start();
        sc.drive();
        sc.speed();

        System.out.println("\nHierarchical Inheritance");
        Bike b = new Bike();
        b.start();
        b.ride();

        Truck t = new Truck();
        t.start();
        t.load();

        System.out.println("\nMultiple Inheritance (Interface)");
        ElectricCar ec = new ElectricCar();
        ec.start();
        ec.drive();
        ec.charge();
    }
}