package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    static public void main(String... args) {
        LocalDateTime nowDateTime = LocalDateTime.now();
        String formattedDate = nowDateTime.format(DateTimeFormatter.ISO_DATE);
        System.out.println(formattedDate);
    }
}