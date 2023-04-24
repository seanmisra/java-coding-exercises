package org.example;

public class App 
{
    static public void main( String... args ) {
        Dog dog = new Dog("Labrador", true);

        dog.train(); // abstract
        dog.groom(); // abstract
        dog.walk(); // default
        long id = Pet.getMetaId(); // static
        System.out.println(id);

/*      dog.getMetaId(); does not compile
        Dog.getMetaId(); does not compile
        dog.helper(); does not compile */
    }
}


class Dog implements Pet {
    String breed;
    boolean canBark;

    Dog(String breed, boolean canBark) {
        this.breed = breed;
        this.canBark = canBark;
    }

    public void train() {
        System.out.println("training");
    }

    public void groom() {
        System.out.println("grooming");
    }

    // default methods can be overridden
    public void walk() {
        System.out.println("walking override...");
    }
}


interface Pet {
    long lookupId = 48928348293L;

    void train();
    void groom();

    default void walk() {
        System.out.println("walking...");
    }

    private void logging() {
        System.out.println(lookupId);
    }

    private void helper() {
        this.logging();
    }

    static long getMetaId() {
        return lookupId;
    }
}
