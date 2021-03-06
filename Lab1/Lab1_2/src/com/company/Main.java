package com.company;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input numbers with ' ':");
        String[] mas = reader.readLine().split(" ");
        int[] fibonachi = new int[mas.length+1];
        fibonachi[0] = 1;
        fibonachi[1] = 1;
        for (int i = 2; i <= mas.length; i++){
            fibonachi[i] = fibonachi[i-1] + fibonachi[i-2];
        }
        System.out.println("Fibonacci numbers");
        for (int retval : fibonachi) {
            System.out.print(String.valueOf(retval) + " ");
        }
    }
}
