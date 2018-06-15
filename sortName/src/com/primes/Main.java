package com.primes;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void sortNames(){
        BufferedReader reader = null;
        BufferedWriter writer = null;

        ArrayList<String> names = new ArrayList<String>();

        try {

            reader = new BufferedReader(new FileReader("/names.txt"));

            String currentName = reader.readLine();
            while(currentName != null){
                names.add(currentName);
                currentName = reader.readLine();
            }
            Collections.sort(names);

            writer = new BufferedWriter(new FileWriter("/output.txt"));

            for(String name : names){
                writer.write(name);

            }

        }catch(IOException e){
            e.printStackTrace();
        }
        try {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

}
