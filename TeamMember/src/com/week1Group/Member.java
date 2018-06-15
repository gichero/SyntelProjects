package com.week1Group;

public class Member extends Person implements Greeting {

    static final String attribute = "BS";
    static final String fruit = "Dragonfruit";

    public Member(){

    }

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName (String input) {
        this.name = input;
    }

    public String getName() {
        return this.name;
    }
    public void saysHello(){
        System.out.println("Java Rocks!!!");
    }

}
