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
        int[] arrOne = {1, 2, 3};
        int[] arrTwo = new int[]{1, 2, 3};
        int[] arrThree = new int[3]; arrThree[0] = 1; arrThree[1] = 2; arrThree[2] = 3;
        var arrFour = new int[3]; arrFour[0] = 1; arrFour[1] = 2; arrFour[2] = 3;
        int[] arrFive = IntStream.rangeClosed(1, 3).toArray();


        boolean compOne = Arrays.equals(arrOne, arrTwo);
        boolean compTwo = Arrays.equals(arrTwo, arrThree);
        boolean compThree = Arrays.equals(arrThree, arrFour);
        boolean compFour = Arrays.equals(arrFour, arrFive);

        // All 5 arrays above are equal
        if (compOne && compTwo && compThree && compFour) {
            System.out.println("All arrays are equal");
        }
    }
}
