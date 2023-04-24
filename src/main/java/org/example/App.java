package org.example;

public class App 
{
    static public void main( String... args ) {
        Dog dog = new Dog("Labrador", true);

        dog.train(); // abstract
        dog.groom(); // abstract
        dog.walk(); // non-abstract (overridden)
        Dog.getMetaId(); // static (accessible unlike interface)
        dog.getMetaId(); // static (accessible unlike interface)
        long id = Pet.getMetaId(); // static
        System.out.println(id);
//        dog.helper(); private methods of superclass are not accessible
    }
}


class Dog extends Pet {
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

    // non-abstract methods can be overridden
    public void walk() {
        System.out.println("walking override...");
    }
}


abstract class Pet {
    public static long lookupId = 48928348293L;

    abstract void train();
    abstract void groom();

    void walk() {
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
