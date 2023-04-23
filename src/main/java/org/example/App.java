package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    static public void main( String... args ) {
        String test = "hello";
        String testTwo = test.concat(" world");

        System.out.println(test); // still hello
        System.out.println(testTwo); // hello world
    }
}
