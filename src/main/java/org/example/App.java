package org.example;

public class App 
{
    static public void main( String... args ) {
        Dog dog = new Dog("Furry", "Labrador", true, 5);
    }
}

/*Can extend ONE superclass, but implement multiple interfaces
All abstract interface methods must be implemented (w/o losing visibility)
Default interface methods can optionally be overridden*/
class Dog extends Animal implements Pet, WalkablePet {
    String breed;
    boolean canBark;

    Dog(String name, String breed, boolean canBark, int age) {
        super(age, name);
        this.breed = breed;
        this.canBark = canBark;
    }

    public void train() {
        System.out.println("training");
    }

    public void groom() {
        System.out.println("grooming");
    }

    public void walk() {
        System.out.println("walking override...");
    }
}

class Animal {
    int age;
    String name;

    Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

interface Pet {
    void train();
    void groom();
}

interface WalkablePet {
    int legs = 4; // public static final by default

    default void walk() {
        System.out.println("walking");
    }
}
