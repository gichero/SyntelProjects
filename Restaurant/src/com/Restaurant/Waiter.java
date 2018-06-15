package com.Restaurant;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;



public class Waiter implements PayableWithTip {

    private Map<String, Double> menu = new HashMap<String, Double>();
    private List<String> order = new ArrayList<String>();
    private double total;
    private double tipAmount;

    public Waiter() {

        menu.put("Pilau", 4.56);
        menu.put("Chapati", 1.46);
        menu.put("Mukimo", 3.06);
        menu.put("Githeri", 2.96);
        menu.put("Nyama Choma", 6.67);
    }

    public Waiter(HashMap menu, ArrayList order, double total, double tipAmount){
        this.menu = menu;
        this.order = order;
        this.total = total;
        this.tipAmount = tipAmount;
    }

    public Map<String, Double> getMenu() {
        return menu;
    }

    public double getTotal() {
        return total;
    }

    public double getTipAmount() {
        return tipAmount;
    }

    public void addTipToTotal(double tipAmount) {
        total += tipAmount;

    }

    public double getTotalAmountToBePaid() {
        return 0;
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

//    public void getOrder(){
//
//    }

}
