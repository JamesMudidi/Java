package com.james;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(final String[] args) {
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:mm:ss a 'on' mm dd, yyyy'.'");
        final LocalDateTime now = LocalDateTime.now();

        System.out.println("Hello World");
        System.out.println("The current time and date is " + dtf.format(now));
    }

}
