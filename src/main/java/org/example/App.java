package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    static public void main( String... args ) {
        Dog firstDog = new Dog();
        Dog secondDog = new Dog("Spot", "testBreed");
        Dog thirdDog = new Dog("Furry", "Labrador", true, 5);
    }
}

class Dog {
    String name;
    String breed;
    boolean canBark;
    int age;

    // if we don't manually add, will not have no-args constructor, since there are other constructors
    Dog() {
    }

    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    Dog(String name, String breed, boolean canBark, int age) {
        this(name, breed); // this() must be first line
        this.canBark = canBark;
        this.age = age;
    }
}
