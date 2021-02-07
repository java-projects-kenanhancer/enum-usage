package com.extuni.program8;

enum Direction {
    EAST("E"), WEST("W"), NORTH("N"), SOUTH("S");

    private final String shortCode;

    public String getShortCode() {
        return this.shortCode;
    }

    Direction(String shortCode) {
        this.shortCode = shortCode;
    }
}

public class Main {

    public static void main(String[] args) {

        Direction[] directions = Direction.values();

        for (Direction direction : directions) {
            System.out.println("name: " + direction.name() + " short code: " + direction.getShortCode() + " at index: " + direction.ordinal());
        }

        System.out.println(Direction.valueOf("WEST"));
    }
}
