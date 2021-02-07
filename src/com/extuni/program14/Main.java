package com.extuni.program14;

interface Greeting {
    String getMessage(String name);
}

enum EnglishGreeting implements Greeting {
    HELLO("Hello"), GOOD_BYE("Good bye"), GOOD_MORNING("Good morning");

    private final String message;

    public String getMessage(String name) {
        return this.message + " " + name;
    }

    EnglishGreeting(String message) {
        this.message = message;
    }
}

enum TurkishGreeting implements Greeting {
    HELLO("Merhaba"), GOOD_BYE("Gule gule"), GOOD_MORNING("Gunaydin");

    private final String message;

    public String getMessage(String name) {
        return this.message + " " + name;
    }

    TurkishGreeting(String message) {
        this.message = message;
    }
}

public class Main {

    public static void main(String[] args) {

        Greeting greeting = EnglishGreeting.GOOD_BYE;

        String message = greeting.getMessage("Kenan");

        System.out.println(message);

        greeting = TurkishGreeting.GOOD_BYE;

        message = greeting.getMessage("Kenan");

        System.out.println(message);
    }
}
