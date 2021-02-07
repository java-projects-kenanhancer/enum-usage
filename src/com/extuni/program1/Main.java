package com.extuni.program1;

public class Main {

    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    enum PizzaStatus {
        ORDERED,
        READY,
        DELIVERED
    }

    enum Color {
        RED,
        GREEN,
        BLUE,
        YELLOW
    }

    enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    enum UserResponse {
        YES,
        NO
    }

    enum FileAccess {
        NONE,
        READ,
        WRITE,
        READWRITE
    }

    enum LogLevel {
        ERROR,
        WARNING,
        INFO,
        DEBUG
    }

    enum HttpRequestHeaders {
        ACCEPT,
        ACCEPT_CHARSET,
        ACCEPT_DATETIME,
        ACCEPT_ENCODING,
        ACCEPT_LANGUAGE
    }

    enum Status {
        ACTIVE,
        DEACTIVE,
        PENDING
    }

    enum Continents {
        NORTH_AMERICA,
        SOUTH_AMERICA,
        AFRICA,
        ASIA,
        EUROPE,
        ANTARTICA,
        AUSTRALIA
    }

    enum Weekend {
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    enum MediaTypes {
        JSON,
        XML
    }

    enum DefaultPorts {
        HTTP,
        HTTPS
    }

    enum DayOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    enum Weekdays {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    enum MimeType {
        CSV,
        HTML,
        JSON,
        XML,
        JPEG,
        PNG,
        PDF
    }

    enum HttpStatus {
        OK,
        CREATED,
        BAD_REQUEST,
        NOT_FOUND
    }

    enum Day {
        BeforeNoon,
        AfterNoon
    }

    enum Planet {
        MERCURY,
        VENUS,
        EARTH,
        MARS,
        JUPITER,
        SATURN,
        URANUS,
        NEPTUNE
    }

    public static void main(String[] args) {

        Color blue = Color.BLUE;
        Color red = Color.RED;
        HttpStatus httpStatus = HttpStatus.OK;
        httpStatus = HttpStatus.CREATED;

        for (Color color : Color.values()) {
            System.out.println(color);
        }
    }
}
