package org.example;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class App {
    static public void main(String... args) {
        Path path = Paths.get("src/main/java/org/example/test.txt");
        ArrayList<String> allLines = new ArrayList<>();

        // try with resources will automatically close the buffered reader after use
        try (BufferedReader bf = Files.newBufferedReader(path)) {
            String nextLine = bf.readLine();
            while (nextLine != null) {
                allLines.add(nextLine);
                nextLine = bf.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(allLines);
    }
}