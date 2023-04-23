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

        if (firstString == secondString && secondString == thirdString) {
            System.out.println("The above three Strings recycle the same reference on the String literal pool (on the heap)");
        }

        String fourthString = "he".concat("llo");
        String fifthString = new String("hello");

        if (firstString != fourthString && firstString != fifthString) {
            System.out.println("The 4th and 5th strings do not refer to the String literal pool");
        }
    }
}
