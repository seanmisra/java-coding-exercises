package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    static public void main( String... args ) {
        String firstString = "hello";
        String secondString = "hello";
        String thirdString = new String("hello").intern();
        String fourthString = "he".concat("llo");
        String fifthString = new String("hello");


        if (firstString.equals(secondString)
            && secondString.equals(thirdString)
            && thirdString.equals(fourthString)
            && fourthString.equals(fifthString)
        ) {
            System.out.println("All Strings above are equal via String.equals()");
        }
    }
}
