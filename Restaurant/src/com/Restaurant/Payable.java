package com.Restaurant;

public interface Payable {

    public double getTotalAmountToBePaid();

    public double payBill(double amount);

    public String showMenu();
}
