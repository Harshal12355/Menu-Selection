package com.company;

public class Healthyburger extends Burger {
    private String topping1;
    private double topping1price = 2.0;

    private String topping2;
    private double topping2price = 2.0;

    private String topping3;
    private double topping3price = 2.0;

    private String topping4;
    private double topping4price = 2.0;

    public Healthyburger(String breadtype, String patty, String topping1, String topping2, String topping3, String topping4) {
        super(breadtype, patty);
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
        this.topping4 = topping4;
    }

    public String getTopping1() {
        return topping1;
    }

    public String getTopping2() {
        return topping2;
    }

    public String getTopping3() {
        return topping3;
    }

    public String getTopping4() {
        return topping4;
    }
}
