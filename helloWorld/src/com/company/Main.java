package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args){
        System.out.println("Hello World");
        int sum = add(35, 109);
        System.out.println(sum);
    }
    static int add(int a, int b){
        return a+b;
    }
}
