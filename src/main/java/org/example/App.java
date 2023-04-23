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
        Integer myInteger = 10; // autoboxing
        Integer myIntegerTwo = new Integer(10); // constructor
        Integer myIntegerThree = Integer.valueOf(10);
        Integer myIntegerFour = Integer.parseInt("10");

        boolean compOne = myInteger.equals(myIntegerTwo);
        boolean compTwo = myIntegerTwo.equals(myIntegerThree);
        boolean compThree = myIntegerThree.equals(myIntegerFour);

        if (compOne && compTwo && compThree) {
            System.out.println("All four are equal");
        }
    }
}
