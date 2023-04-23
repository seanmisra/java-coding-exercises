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
        int x = 1;

        // does not evaluate both sides
        boolean a = (true) || (++x == 2);
        System.out.println(x); // so x will still equal one

        // ALWAYS evaluates both sides
        boolean b = (true) | (++x == 2);
        System.out.println(x); // so x is incremented
    }
}
