package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    static public void main(String... args) {
        Person personOne = new Person("Bob", 30);
        personOne.addTrait("Happy"); personOne.addTrait("Loud"); personOne.addTrait("Fun");

        Person personTwo = new Person("Tom", 40);
        personTwo.addTrait("Nice"); personTwo.addTrait("Smart"); personTwo.addTrait("Great");

        Person personThree = new Person("Alex", 50);
        personThree.addTrait("Pleasant"); personThree.addTrait("Interesting"); personThree.addTrait("Attentive");

        // example using Map
        List<String> personList = Stream.of(personOne, personTwo, personThree)
                .map((Person person) -> person.name + ":" + person.age).collect(Collectors.toList());
        System.out.println(personList);

        List<String> traitList = Stream.of(personOne, personTwo, personThree)
                .flatMap((Person person) -> person.traits.stream()).collect(Collectors.toList());
        System.out.println(traitList);
    }
}

class Person {
    String name;
    int age;
    ArrayList<String> traits = new ArrayList<>();

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void addTrait(String trait) {
        this.traits.add(trait);
    }
}