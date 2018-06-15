package com.Store;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static java.lang.String.valueOf;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static Store store = new Store();
    public static void main(String[] args) {
//        System.out.println("Please enter item name?");
//        String input=" ";
//        input = sc.nextLine();

        Product shirt = new Product(" Shirt", 10, "Pink");
        Product pants = new Product(" Pants", 30, "Black");
        Product shoes = new Product(" Shoes", 20, "White");
        Product hats = new Product(" Hats", 20, "Balck");
        Product socks = new Product(" Socks", 10, "White");

        Product orange = new Product("orange", 5, "sunkist fruit");
        Product mango = new Product("mango", 5, "delicious");
        Product grapes = new Product("grapes", 5, "wine makers");
        Product apples = new Product("apple", 5, "keep the doctor away");
        Product apricot = new Product("apricot", 5, "questionable");

        Product donuts = new Product(" Donuts", 3, "Plain");
        Product cupcakes = new Product("Cupcakes", 4, "Blue Berry");
        Product chocolate = new Product("Chocolate", 2, "Kitkat");
        Product bacon = new Product(" Bacon", 4, "Spicy");
        Product coke = new Product(" Coke", 2, "Lemon");


        //initialzing new vendor using Vendor class
        Vendor walmart = new Vendor("walmart");
        //using addProduct method from Vendor class to add products to the new vendor
        walmart.addToAvailItems(shirt, 2);
        walmart.addToAvailItems(pants, 4);
        walmart.addToAvailItems(shoes, 0);
        walmart.addToAvailItems(socks, 1);
        walmart.addToAvailItems(hats, 3);

        //initialzing new vendor using Vendor class
        Vendor target = new Vendor("target");
        //using addProduct method from Vendor class to add products to the new vendor
        target.addToAvailItems(orange, 0);
        target.addToAvailItems(mango, 3);
        target.addToAvailItems(apples, 5);
        target.addToAvailItems(apricot, 2);
        target.addToAvailItems(grapes, 2);

        //initialzing new vendor using Vendor class
        Vendor kroger = new Vendor("kroger");
        //using addProduct method from Vendor class to add products to the new vendor
        kroger.addToAvailItems(donuts, 1);
        kroger.addToAvailItems(cupcakes, 2);
        kroger.addToAvailItems(bacon, 0);
        kroger.addToAvailItems(chocolate, 4);
        kroger.addToAvailItems(coke, 1);




//        walmart.showInventory();
//        target.showInventory();
//        kroger.showInventory();

        store.addToAvailItems(walmart);
        store.addToAvailItems(target);
        store.addToAvailItems(kroger);
        store.showInventory();


        //start of interaction
        int status = 2;
        System.out.println("Enter 1 to view cart");
        System.out.println("Enter 2 to view available Inventory ");
        System.out.println("Enter 3 to view available Item's Name and Price ");
        System.out.println("Enter 4 to remove items from cart ");
        System.out.println("Enter 5 to checkOut  ");

        //while loop looping through status cases; loop keeps running while status does not equal 5; when status equals 5 the loop will stop running
        while (status != 5) {

            //asking for UI
            System.out.println("Please make a selection");


            //resetting the status variable to equal the scanner. the scanner object has inherited the method nextInt; will change the status to move to
            // the next integer
            status = sc.nextInt();


            //switch statement displays the code (here it is methods) that is related to the integer; break signifies moving to the next integer(which we have called status)
            switch (status) {
                case 1:
                    store.viewCart();
                    break;
                case 2:
                    //  availableInventory();
                    break;
                case 3:
                    try {
                        System.out.println("Enter a product name");
                        String productString;
                        productString = sc.nextLine();
                        System.out.println("Enter quantity");
                        int count;
                        count = sc.nextInt();
                        store.addToCart(store.getProduct(productString), count);
                    }catch (Exception e) {
                        System.out.println(e);
                    }



                    break;
                case 4:
                    //  removeFromCart();
                    break;
                case 5:
                    //  checkOut();
                    break;
            }
        }
    }


//    //addToCart method
//    public static void addToCart() {
//        //set int value to 1 and calling it i
//        int i=1;
//        //for loop starts at index 1. loops through the whole storeInventory list(storeInventory.size()) and iterates one time after every loop
//        for( i=1; i<storeInventory.size(); i++){
//            //prints out the index of the storeInventory but prints the name instead of the index number(becuase of the name dot notation)
//            System.out.println(i+". "+storeInventory.get(i).name);
//        }
//
//        System.out.println("Please select inventory item");
//
//        //user input moves scanner to next integer(nextInt())
//        int input = sc.nextInt();
//
//        //if statement uses java default get method (which takes user input) to the storeInventory list if the quantity of the item is greater
//        // than 0; that item is added to the cart using java default add method (which takes previous step as argument)
//        if (storeInventory.get(input).quantity > 0) {
//            cart.add(storeInventory.get(input));
//            //that item is removed from storeInventory list
//            storeInventory.get(input).quantity--;
//
//        }else
//            //printed output if the item in storeInventory = 0
//            System.out.println("Sorry. Item is out of stock. Check back later.");
//    }

    //removeFromCart method
//    public static void removeFromCart(){
//        //set int and index variable to start loop
//        int i=0;
//        //for loop starts at index 1. loops through the whole storeInventory list(storeInventory.size()) and iterates one time after every loop
//        for( i=0; i<cart.size(); i++){
//            //prints out the index of the storeInventory but prints the name instead of the index number(becuase of the name dot notation)
//            System.out.println(i+". "+cart.get(i).name);
//        }


//        System.out.println("Please select inventory item");
//        //user input moves scanner to next integer(nextInt())
//        int input = sc.nextInt();
//        //java default remove method being passed the user input for the item to remove from the cart
//
//        cart.remove(cart.get(input));
//        //incrementing the quantity back and moving the item in storeInventory
//        storeInventory.get(input).quantity ++;
//    }
//
//    //available inventory method
//    public static void availableInventory(){
//        //for each loop ( : signifies 'each' for 'each' index) loop over storeInventory list which has items
//        // (pro) from Product class(made by the constructor in Product class)
//        for(Product pro: storeInventory){
//            //if statement says if the quantity of item (pro) is greater than 0 print item(pro)
//            if(pro.quantity>0)
//                System.out.println(pro.toString());
//        }
//    }
//
//    //checkOut method
//    public static void checkOut(){
//        //set int to 0 and name it total
//        int total = 0;
//        //for each loop ( : signifies 'each' for 'each' index) loops over cart list which has items(product) from Product
//        // class (made by the constructor in Product class)
//        for(Product product: cart) {
//            //prints product name and price to the command line
//            System.out.println("Name: " + product.name + ", Price: $" + product.price);
//            //increments the total variable to add and equal all prices of the products in cart
//            total += product.price;
//        }
//        //print total
//        System.out.println("Total: $"+total);
//        //exit the program..... gracefully
//        System.exit(0);
    //  }

}
