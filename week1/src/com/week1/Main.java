package com.week1;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(fizzBuzz());

    }

    public void fizzBuzz(){
        String str = "";
        for(int i=1; i<61; i++){
            String num = str;
            if(i%3 == 0) {
                num = "Fizz";
            }
            if(i%5 == 0){
                num = "Buzz";
            }
            num += i;
            System.out.println(num);
        }
    }
}
