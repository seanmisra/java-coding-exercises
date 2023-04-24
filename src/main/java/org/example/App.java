package org.example;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class App {
    static public void main(String... args) {
        Path path = Paths.get("src/main/java/org/example/test.txt");
        List<String> linesToWrite = new ArrayList<>();
        linesToWrite.add("Hello how are you?");
        linesToWrite.add("This is the second line");
        linesToWrite.add("This is the third line");

        // default is to create the file if it does not exist
        try (BufferedWriter bw = Files.newBufferedWriter(path)) {
            for (String line: linesToWrite) {
                bw.write(line);
                bw.newLine();
            }
        } catch (Exception e) {

        }
    }
}