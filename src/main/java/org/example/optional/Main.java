package org.example.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
       Object result = Optional.of("Hello")
                .orElseGet(() -> "default value");
        System.out.println(result);

        Optional.empty()
                .ifPresentOrElse(email -> System.out.println("Sending mail to " + email),
                        () -> {
                            System.out.println("Cannot send an email at this point");
                        });
    }
}
