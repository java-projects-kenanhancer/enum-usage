package com.extuni.program7;

enum TrafficSignal {
    RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN");

    private final String action;

    public String getAction() {
        return this.action;
    }

    TrafficSignal(String action) {
        this.action = action;
    }
}

public class Main {

    public static void main(String[] args) {

        TrafficSignal[] signals = TrafficSignal.values();

        for (TrafficSignal signal : signals) {
            System.out.println("name: " + signal.name() + " action: " + signal.getAction() + " at index: " + signal.ordinal());
        }
    }
}
