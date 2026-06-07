package Assignment1;

import java.util.*;

class Animal {
    public String toString() {
        return "Animal";
    }
}

class Dog extends Animal {
    public String toString() {
        return "Dog";
    }
}

public class Q18_generic_assignments {

    // ? extends → read
    static void printAnimals(List<? extends Animal> list) {
        for (Animal a : list) {
            System.out.println(a);
        }
    }

    // ? super → write
    static void addDogs(List<? super Dog> list) {
        list.add(new Dog());
    }

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());

        List<Animal> animals = new ArrayList<>();

        System.out.println("Using ? extends:");
        printAnimals(dogs);

        System.out.println("\nUsing ? super:");
        addDogs(animals);
        System.out.println(animals);

        System.out.println("\nUsing ? (unbounded):");
        List<?> anyList = dogs;
        System.out.println(anyList);
    }
}
