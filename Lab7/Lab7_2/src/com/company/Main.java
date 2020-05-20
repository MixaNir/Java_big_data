package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException { //Variant 7
	// write your code here
        BufferedReader newReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input string:");
        int min = 100000;
        int max = 0;
        String[] str = newReader.readLine().split(" ");
        for (String line: str) {
            if (line.length() > max){
                max = line.length();
            }
            if(line.length() < min){
                min = line.length();
            }
        }
        ArrayList<String> min_str = new ArrayList<String>();
        ArrayList<String> max_str = new ArrayList<String>();
        for (String line: str) {
            if (line.length() == min){
                min_str.add(line);
            }
            if (line.length() == max){
                max_str.add(line);
            }
        }
        System.out.println("All words with min length:");
        System.out.println(min_str);
        System.out.println("All words with max length:");
        System.out.println(max_str);
    }
}
