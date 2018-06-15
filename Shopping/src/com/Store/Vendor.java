package com.Store;

import java.util.HashMap;
import java.util.Map;

public class Vendor {
    private String name;
    private HashMap<Product,Integer> availItems;

    private Vendor() {
        name = "Vendor";
        availItems = new HashMap<Product, Integer>();
    }

    public Vendor(String name) {
        this.name = name;
        availItems = new HashMap<Product, Integer>();
    }

    public void addToAvailItems(Product name, Integer quantity) {
        this.availItems.put(name,quantity);
    }

    public int checkItem(Product product) {
        return this.availItems.get(product);
    }

    public void showInventory() {
        for (Product product : this.availItems.keySet()) {
            System.out.println(this.name + " has: " + product + ", Quantity: " + availItems.get(product));
            //System.out.println(quantity);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void updateInventory(Product product, Integer quantity) {
        int updated = this.availItems.get(product)-quantity;
        this.availItems.replace(product,updated);
    }

    public HashMap<Product, Integer> getMap(){

        return availItems;
    }
}