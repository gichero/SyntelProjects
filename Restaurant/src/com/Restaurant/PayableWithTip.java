package com.Restaurant;

public interface PayableWithTip extends Payable {

    public void addTipToTotal(double tipAmount);

}
