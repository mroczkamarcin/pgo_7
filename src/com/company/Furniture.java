package com.company;

public class Furniture {

    private static final double vat = 0.23;
    private double price;
    private String name;

    public Furniture(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public double getPrice(double vat){
        return price*(1+vat);

    }
}
