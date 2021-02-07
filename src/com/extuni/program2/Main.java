package com.extuni.program2;

enum PizzaStatus {
    ORDERED(5),
    READY(2),
    DELIVERED(0);

    private int timeToDelivery;

    public int getTimeToDelivery() {
        return timeToDelivery;
    }

    PizzaStatus(int timeToDelivery) {
        this.timeToDelivery = timeToDelivery;
    }
}

public class Main {

    public static void main(String[] args) {
        PizzaStatus pizzaStatus;
        pizzaStatus = PizzaStatus.READY;
        System.out.println(pizzaStatus == PizzaStatus.READY);
    }
}
