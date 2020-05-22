package com.company;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException { //Variant 5
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input strings with ' ':");
        String[] mas = reader.readLine().split(" ");
        int latin_labels = 0;
        int result_labels = 0;
        String vowes = "eioauEIOUA";
        String nonVowes = "qwrtypsdfghjklzxcvbnmQWRTYPSDFGHJKLZXCVBNM";
        for (String word: mas) {
            if (word.matches("^[a-zA-Z0-9]+$")){
                latin_labels += 1;
                int vowes_num = 0;
                int nonVowes_num = 0;
                for (char label: word.toCharArray()) {
                    if(vowes.indexOf(label) != -1){
                        vowes_num += 1;
                    } else if (nonVowes.indexOf(label) != -1){
                        nonVowes_num += 1;
                    }
                }
                if ((vowes_num == nonVowes_num) && (vowes_num!=0)){
                    System.out.println(word);
                    result_labels += 1;
                }
            }
        }
        System.out.println("Result: " + result_labels);
    }
}
