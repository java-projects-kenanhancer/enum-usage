package com.extuni.program9;

enum Currency {
    DOLAR("USD", "US Dollar"), EURO("EUR", "Euro"), POUND("GBP", "British Pound");

    private final String shortCode;

    private final String shortName;

    public String getShortCode() {
        return this.shortCode;
    }

    public String getShortName() {
        return this.shortName;
    }

    Currency(String shortCode, String shortName) {
        this.shortCode = shortCode;
        this.shortName = shortName;
    }
}

public class Main {
    public static void main(String[] args) {
        Currency[] currencies = Currency.values();

        for (Currency currency : currencies) {
            System.out.println("name: " + currency.name() + " short code: " + currency.getShortCode() + " short name: " + currency.getShortName());
        }
    }
}
