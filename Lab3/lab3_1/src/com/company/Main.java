package com.company;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;;


public class Main {

    public static void main(String[] args) throws IOException{ //variant 7
	// write your code here
        Fraction[] fract;
        BufferedReader newReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input column of fractions: ");
        String[] mas;
        int k = scanner.nextInt();
        fract = new Fraction[k];
        for (int i = 0; i < k; i++){
            System.out.println("Please input " + (i+1) + " fraction: ");
            mas = newReader.readLine().split(" ");
            fract[i] = new Fraction(Integer.parseInt(mas[0]), Integer.parseInt(mas[1]));
        }
        System.out.println("Your data fraction: ");
        for (int i = 0; i < k; i++){
            System.out.println(fract[i].get_fraction());
        }
        fract = fract[0].ChangeFraction(fract);
        System.out.println("Refactored data fraction: ");
        for (int i = 0; i < k; i++){
            System.out.println(fract[i].get_fraction());
        }
    }
}
