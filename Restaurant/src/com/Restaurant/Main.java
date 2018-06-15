package com.Restaurant;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args)throws Exception {
	// write your code here
        System.out.println("***************Please Make Order******************");

        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);

        Boolean pass = true;
        int choice = 0;
        while(pass) {
            System.out.println("Choose restaurant type: Pick; 1. sit down or 2. eat-and-go \n");
            try {
                choice = Integer.parseInt(br.readLine());
                pass = false;
            }catch(NumberFormatException e){
                System.out.println("Please enter 1 or 2");
                pass = true;
            }
        }

        Cashier cashier = new Cashier();
        Waiter waiter = new Waiter();

        String restaurantChoice;
        switch(choice){
            case 1: restaurantChoice = "1";
                System.out.println(cashier.showMenu());
            break;
            case 2: restaurantChoice = "2";
                System.out.println(waiter.showMenu());
            break;
            default: restaurantChoice = "Invalid entry";
                System.out.println("Please enter 1 or 2");
            break;
        }








    }
}
