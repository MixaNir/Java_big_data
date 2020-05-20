package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException { //Variant 5
	// write your code here
        BufferedReader newReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input K:");
        int k = Integer.parseInt(newReader.readLine());
        System.out.println("Input string or 'end':");
        String inser = "KEK";

        StringBuffer str = new StringBuffer(newReader.readLine());
        while (str.toString()!="end"){
            if(str.length() >= k){
                str.insert(k, inser);
                System.out.println(str);
            } else {
                System.out.println("String too short!");
            }
            str = new StringBuffer(newReader.readLine());
        }

    }
}
