package com.Restaurant;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Cashier implements Payable{

    private Map<String, Double> menu = new HashMap<String, Double>();
    private List<String> order = new ArrayList<String>();
    private double totalAmount;


    public Cashier() {
        menu.put("1. Chicken nuggets", 1.99);
        menu.put("2. Chicken Burger", 2.49);
        menu.put("3. Potato Fries", 2.09);
        menu.put("4. Beef Burger", 1.99);
        menu.put("5. Sweet Potato Fries", 2.29);
    }

    public Cashier(HashMap menu, ArrayList order, double totalAmount){
        this.menu = menu;
        this.order = order;
        this.totalAmount = totalAmount;
    }

    public Map<String, Double> getMenu() {
        return menu;
    }

    public List<String> getOrder() {

        return order;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double getTotalAmountToBePaid() {

        return totalAmount;
    }

    public double payBill(double amount) {
        return 0;
    }

    public String showMenu(){
        String builder = "";
        for(String foodName :(this.menu).keySet()){
            builder += foodName +" : $"+(this.menu).get(foodName)+"\n";
        }
        return builder;
    }




}
