package org.example;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    static public void main(String... args) {
        Person personOne = new Person("Mark", 20);
        Person personTwo = new Person("Bob", 20);
        Person personThree = new Person("Sarah", 30);
        Person personFour = new Person("Sarah", 40);
        Person personFive = new Person("Alex", 50);
        Person personSix = new Person("Alex", 20);
        Person personSeven = new Person("Alex", 70);

        List<Person> personList = new ArrayList<>();
        personList.add(personOne);
        personList.add(personTwo);
        personList.add(personThree);
        personList.add(personFour);
        personList.add(personFive);
        personList.add(personSix);
        personList.add(personSeven);

        Comparator<Person> comparator = Comparator.comparing((Person person) -> person.name).thenComparingInt((Person person) -> person.age);
        personList.sort(comparator);

        System.out.println(personList);
    }
}

class Person {
    public String name;
    public int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name:" + this.name + "--age:" + this.age;
    }
}
