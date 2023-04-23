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
        try {
            System.exit(0); // terminates JVM
        } catch (Exception e) {
            System.out.println("Caught error");
        } finally {
            System.out.println("Almost always executed");
        }
    }
}
