package org.example;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    static public void main(String... args) {
        Map<Double, Long> countMap = Stream.generate(() -> Math.floor(Math.random() * 5) + 1)
                .limit(1000).collect(Collectors.groupingBy(
                        x -> x, Collectors.counting()
                ));
        System.out.println(countMap);
    }
}