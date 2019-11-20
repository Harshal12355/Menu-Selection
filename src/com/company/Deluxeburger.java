package com.company;

public class Deluxeburger extends Burger {

    private String Fries;
    private double friesprice = 5;

    private String Drinks;
    private double drinksprice = 5;

    public Deluxeburger(String breadtype, String patty, String fries, String drinks) {
        super(breadtype, patty);
        Fries = fries;
        Drinks = drinks;
    }

    public String getFries() {
        return Fries;
    }

    public String getDrinks() {
        return Drinks;
    }
}
