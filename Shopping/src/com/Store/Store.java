package com.Store;

import java.util.HashMap;
import java.util.Map;

public class Store {
    private static Map<Product,Integer> cart;
    private static Map<Product,Integer> availItems;

    public Store() {
        cart = new HashMap<Product, Integer>();
        availItems = new HashMap<Product, Integer>();
    }

    public void addToAvailItems(Vendor vendor) {

        for (Product product : vendor.getMap().keySet()) {
            // System.out.println(product);
            if (vendor.checkItem(product) > 0) {
                this.availItems.put(product, vendor.checkItem(product));
                vendor.updateInventory(product, vendor.checkItem(product));
            } else
                System.out.println("Sufficient quantities are not available.");
        }
    }

    public void addToCart(Product key, Integer itemsToCart) {

        if (itemsToCart <= this.availItems.get(key).intValue()) {
            this.cart.put(key, itemsToCart);
            this.availItems.put(key,availItems.get(key)-itemsToCart);
            System.out.println(itemsToCart + " items added to cart.");
        }
        else
            System.out.println("Not enough items in stock.");

    }
    public Product getProduct(String name){
        for(Product product: this.availItems.keySet()){
            if(name.equals(product.getName())){
                return product;
            }
            else
                return null;
        }
        return null;
    }

    public int getNumberOfItemsInCart() {
        int items = 0;

        for (int q : cart.values())
            items += q;

        return items;
    }

    public int getItemQuantity(Product name) {
        if (this.cart.containsKey(name) && this.cart.get(name) > 0)
            return this.cart.get(name);
        else
            return 0;
    }

    public int getStoreStock(Product name) {
        if (this.availItems.containsKey(name) && this.availItems.get(name) > 0)
            return this.availItems.get(name);
        else
            return 0;
    }

    public void showInventory() {
        for (Product product : this.availItems.keySet()) {
            System.out.println("Store has: " + product + ", Quantity: " + availItems.get(product));
            //System.out.println(quantity);
        }
    }

    //methods created outside of main method to be used/referenced with the main class ( essentially global methods)
    public void viewCart(){
        //for each loop ( : signifies the 'each' for 'each' index) that loops over the cart object made up of products(variable) from
        // the Product class and the constructor in that class
        for(Product product: this.cart.keySet())
            System.out.println("Name: " +product.getName()+ ", Price: $"+product.getPrice());
    }
}