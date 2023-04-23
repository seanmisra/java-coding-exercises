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
        byte testOne = 10;
        byte testTwo = 20;

/*      does not compile bc of type promotion to int
        byte testThree = testOne + testTwo;*/

        int testThree = testOne + testTwo; // binary operator includes type promotion
        byte testFour = ++testOne; // unary operator DOES NOT include type promotion

        System.out.println(testThree);
        System.out.println(testFour);
    }
}
