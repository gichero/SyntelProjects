package com.week1Group;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Member mariano = new Member();
        mariano.age = 20;
        mariano.setName("Mugen");


        System.out.println("name: " + mariano.getName());
        System.out.println("attribute: " + mariano.attribute);
        System.out.println("fruit: " + mariano.fruit);
        mariano.saysHello();
    }
}
