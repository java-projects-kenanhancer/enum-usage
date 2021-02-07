package com.extuni.program3;

enum Color {
    RED, GREEN, BLUE;

    private Color() {
        System.out.println("Constructor called for : " + this.toString());
    }

    public void colorInfo() {
        System.out.println("Universal Color");
    }
}

public class Main {

    public static void main(String[] args) {

        Color color = Color.BLUE;

        System.out.println(color);

        color.colorInfo();
    }
}
