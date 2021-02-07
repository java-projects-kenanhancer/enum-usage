package com.extuni.program4;

enum Color {
    RED, GREEN, BLUE
}

public class Main {

    public static void main(String[] args) {

        Color[] colorList = Color.values();

        for (Color color : colorList) {
            System.out.println(color + " at index " + color.ordinal());
        }

        Color blue = Color.valueOf("BLUE");

        System.out.println(blue);
    }
}
