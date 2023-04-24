package org.example;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    static public void main(String... args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        String formattedDate = zonedDateTime.format(DateTimeFormatter.ISO_OFFSET_DATE);
        System.out.println(formattedDate);
    }
}