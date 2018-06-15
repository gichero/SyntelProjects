package com.Store;

public class Product {

    private String name;
    private String description;
    private double price;


    private Product() {
    }

    public Product(String name, double price, String description) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Item name: " + this.name + ", Item price: " + this.price;
    }
}