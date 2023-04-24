package org.example;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    static public void main(String... args) {
        // via Stream
        Optional<Integer> sumOptional = Stream.iterate(1, x -> x + 1).limit(100).reduce((next, total) -> {
            return next + total;
        });
        int sum = sumOptional.get();
        System.out.println(sum);

        // via IntStream
        OptionalInt sumIntOptional = IntStream.rangeClosed(1, 100).reduce((next, total) -> {
            return next + total;
        });
        int sumTwo = sumIntOptional.getAsInt();
        System.out.println(sumTwo);

        // IntStream also has sum() function
        int sumThree = IntStream.rangeClosed(1, 100).sum();
        System.out.println(sumThree);

        if (sum != sumTwo || sum != sumThree) {
            throw new RuntimeException("summing with streams did not work");
        }
    }
}