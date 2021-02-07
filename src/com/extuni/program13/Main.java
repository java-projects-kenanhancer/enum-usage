package com.extuni.program13;

interface Greeting {
    abstract String getMessage(String name);
}

enum EnglishGreeting implements Greeting {

    HELLO {
        @Override
        public String getMessage(String name) {
            return "Hello " + name;
        }
    },
    GOOD_BYE {
        @Override
        public String getMessage(String name) {
            return "Good bye " + name;
        }
    },
    GOOD_MORNING {
        @Override
        public String getMessage(String name) {
            return "Good morning " + name;
        }
    };
}

enum TurkishGreeting implements Greeting {

    HELLO {
        @Override
        public String getMessage(String name) {
            return "Merhaba " + name;
        }
    },
    GOOD_BYE {
        @Override
        public String getMessage(String name) {
            return "Gule gule " + name;
        }
    },
    GOOD_MORNING {
        @Override
        public String getMessage(String name) {
            return "Gunaydin " + name;
        }
    };
}

public class Main {

    public static void main(String[] args) {

        Greeting greeting = TurkishGreeting.HELLO;

        String message = greeting.getMessage("Kenan");

        System.out.println(message);

        greeting = EnglishGreeting.HELLO;

        message = greeting.getMessage("Kenan");

        System.out.println(message);
    }
}
