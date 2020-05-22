package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main { //Variant 5

    public static void main(String[] args) throws IOException {
	// write your code here
        int[] polynom1;
        int[] polynom2;
        BufferedReader newReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        System.out.println("Input polynomial degree: ");
        int deg = scan.nextInt();
        polynom1 = new int[deg+1]; //[deg0, deg1, deg2,...]
        polynom2 = new int[deg+1]; //[deg0, deg1, deg2,...]
        System.out.println("Input polynomial 1 coefficients through ' ': ");
        String[] plnm1 = newReader.readLine().split(" ");;
        int i = deg;
        for (String line: plnm1) {
            polynom1[i] = Integer.parseInt(line);
            i--;
        }
        System.out.println(Arrays.toString(polynom1));

        System.out.println("Input polynomial 2 coefficients through ' ': ");
        String[] plnm2 = newReader.readLine().split(" ");;
        i = deg;
        for (String line: plnm2) {
            polynom2[i] = Integer.parseInt(line);
            i--;
        }
        System.out.println(Arrays.toString(polynom2));

        int[] result = new int[deg+deg+1];
        for (int k = 0; k <= deg; k++){
            for (int m = 0; m <= deg; m++){
                result[k+m] += polynom1[k] * polynom2[m];
            }
        }
        System.out.println("Result from lower degree to higher: ");
        System.out.println(Arrays.toString(result));
    }
}
