package org.example;

public class App 
{
    static public void main( String... args ) {
        Dog dog = new Dog("Furry", "Labrador", true, 5);
    }
}

class Dog extends Animal {
    String breed;
    boolean canBark;

    Dog(String name, String breed, boolean canBark, int age) {
        super(name, age); // super is required here, as there is no default no-args constructor for superclass Animal
        this.canBark = canBark;
        this.breed = breed;
    }
}

class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
