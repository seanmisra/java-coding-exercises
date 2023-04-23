package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    static public void main( String... args ) {
        int test = 10;
        long testTwo = test; // since long is broader than int no casting required

        long testThree = 10;
        int testFour = (int) testThree; // since int is narrower than long casting is required
    }
}
