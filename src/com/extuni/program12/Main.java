package com.extuni.program12;

enum Greeting {
    HELLO {
        @Override
        String getMessage(String name) {
            return "Hello " + name;
        }
    },
    GOOD_BYE {
        @Override
        String getMessage(String name) {
            return "Good bye " + name;
        }
    },
    GOOD_MORNING {
        @Override
        String getMessage(String name) {
            return "Good morning " + name;
        }
    },
    GOOD_AFTERNOON {
        @Override
        String getMessage(String name) {
            return "Good afternoon " + name;
        }
    },
    GOOD_EVENING {
        @Override
        String getMessage(String name) {
            return "Good evening " + name;
        }
    },
    GOOD_NIGHT {
        @Override
        String getMessage(String name) {
            return "Good night " + name;
        }
    },
    TAKE_CARE {
        @Override
        String getMessage(String name) {
            return "Take car, " + name;
        }
    };

    abstract String getMessage(String name);
}

public class Main {

    public static void main(String[] args) {

        Greeting greeting = Greeting.GOOD_EVENING;

        String message = greeting.getMessage("Kenan");

        System.out.println(message);
    }
}
