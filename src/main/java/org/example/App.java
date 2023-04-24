package org.example;

import java.io.*;

public class App {
    static public void main(String... args) {
        Person personOne = new Person(40, "John", false, "3242423");
        Person personTwo = new Person(50, "Lee", true, "test1233");
        Person personThree = new Person(60, "Danny", false, "9789232");

        try (
                FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/org/example/persons.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ) {
            objectOutputStream.writeObject(personOne);
            objectOutputStream.writeObject(personTwo);
            objectOutputStream.writeObject(personThree);
        } catch (Exception e) {
        }

        try (
                FileInputStream fileInputStream = new FileInputStream("src/main/java/org/example/persons.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ) {
            Person person1 = (Person) objectInputStream.readObject();
            Person person2 = (Person) objectInputStream.readObject();
            Person person3 = (Person) objectInputStream.readObject();

            System.out.println(person1);
            System.out.println(person2);
            System.out.println(person3);
        } catch (Exception e) {
            //
        }
    }
}

class Person implements Serializable {
    int age;
    String name;
    boolean isStudent;
    transient String password; // will not be serialized, thus will default to null when deserialized
    static String lookupId = "PERSON_12312312";

    Person(int age, String name, boolean isStudent, String password) {
        this.age = age;
        this.name = name;
        this.isStudent = isStudent;
        this.password = password;
    }

    @Override
    public String toString() {
        return this.name + ":" + this.age + ":" + this.isStudent + ":" + this.password;
    }
}