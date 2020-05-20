package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException { //Variant 6
	// write your code here
        System.out.println("Input string:");
        BufferedReader newReader = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile(":|;|'| |,|\\.");
        String[] setup = pattern.split(newReader.readLine());
        ArrayList<String> hash = new ArrayList<>();
        char[] alpfa = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for (char chr: alpfa){
            for (String str: setup) {
                if(str.length() > 1 && str.toLowerCase().charAt(0) == chr){
                    hash.add(str);
                }
            }
        }

        System.out.println(hash);
    }


}
