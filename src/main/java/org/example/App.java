package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{

    {
        System.out.println("Inside instance initializer block -- CALLED 2nd");
    }

    static {
        System.out.println("Inside static initializer block -- CALLED 1st");
    }

    App() {
        System.out.println("Inside constructor -- CALLED 3rd");
    }

    static public void main( String... args ) {
        new App(); // invokes instance initializer, then constructor
    }
}
