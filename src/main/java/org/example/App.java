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
        int y = 1;

        int a = x++; // x is incremented, but not used for assignment
        int b = ++y; // y is increment AND used for assignment

        System.out.println(x); // 2
        System.out.println(y); // 2
        System.out.println(a); // 1
        System.out.println(b); // 2
    }
}
