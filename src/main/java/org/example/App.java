package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    static public void main( String... args ) {
        StringBuilder sb = new StringBuilder("hello");
        sb.append(" world");
        System.out.println(sb); // hello world

        String str = "hello";
        str.concat(" world");
        System.out.println(str); // hello
    }
}
