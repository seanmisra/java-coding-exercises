package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    static public void main( String... args ) {
        // concatenates left-to-right
        String test = "1" + 2 + 3;
        String testTwo = 1 + 2 + "3";

        System.out.println(test); // 123
        System.out.println(testTwo); // 33
    }
}
