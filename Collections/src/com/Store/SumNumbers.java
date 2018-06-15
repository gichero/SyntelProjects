package com.Store;

public class SumNumbers {

    int[] myArray = {12, 23, 34, 45, 56, 67, 78, 89};
    int sum=0;



    public void sumNum(){

        for(int i = 0; i < myArray.length; i++){
            sum += myArray[i];
        }

        System.out.println(sum);
    }
}
