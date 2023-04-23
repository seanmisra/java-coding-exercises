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

        x++; // unary operator; 2

        int y = x + 1; // binary operator; 3

        int z = y == 3 ? 4 : 5; // ternary operator; 4

        System.out.println(z);
    }
}
