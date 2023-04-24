package org.example;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {
    static public void main(String... args) {
        Path path = Paths.get("src/main/java/org/example/test.txt");
        try {
            List<String> allLines  = Files.readAllLines(path);
            allLines.forEach(line -> System.out.println(line));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}