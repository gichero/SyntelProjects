package com.week1Group;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person sonny = new Person("Sonny", "sonny@gmail.com", "483-485-4948");
        Person jordan = new Person("Jordan", "jordan@aol.com", "495-586-3456");
        sonny.setPhone("123-434-4323");

        System.out.println("Sonny's Email is " + sonny.email);
        System.out.println("Jordan's Email is " + jordan.email);
        System.out.println("Sonny's phone number is" + sonny.phone);
        System.out.println("Jordans's phone number is" + jordan.phone);

        sonny.printGreeting(jordan);
        jordan.printGreeting(sonny);

    }
}
