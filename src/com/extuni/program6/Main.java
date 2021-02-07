package com.extuni.program6;

enum Fruit {
    APPLE("RED"), BANANA("YELLOW"), GRAPES("GREEN");

    private final String color;

    public String getColor() {
        return this.color;
    }

    // enum constructor - cannot be public or protected
    Fruit(String color) {
        this.color = color;
    }
}

public class Main {

    public static void main(String[] args) {

        Fruit[] fruits = Fruit.values();

        for (Fruit fruit : fruits) {
            System.out.println("name: " + fruit.name() + " color:" + fruit.getColor() + " at index: " + fruit.ordinal());
        }
    }
}
