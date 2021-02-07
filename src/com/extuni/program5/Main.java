package com.extuni.program5;

public class Main {

    enum Color { RED, GREEN, BLUE }

    enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }

    public static void main(String[] args) {

        Color c1 = Color.BLUE;

        Color c2 = Color.valueOf("RED");

        Day d1 = Day.WEDNESDAY;

        Day d2 = Day.valueOf("SATURDAY");

        System.out.println(c1);

        System.out.println(c2);

        System.out.println(d1);

        System.out.println(d2);
    }
}
