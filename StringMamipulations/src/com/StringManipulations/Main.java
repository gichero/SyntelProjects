package com.StringManipulations;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) {
	// write your code here
        StringExercises str = new StringExercises();
        String str1 = "Java";
        String str2 = "Programming";

        String str3 = str1 + " " + str2;
        System.out.println(str3);
        System.out.println(str3.length());
        str.strUpperLower("ABcdeFG");
        BufferedReader console = new BufferedReader(new InputStreamReader((System.in)));
        System.out.println("Enter a String:");
        String input = console.readLine();



    }
}
