package com.company;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) { //Variant 4
	// write your code here
        int[] num = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println("Even numbers: ");
        IntStream.of(num)
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
        System.out.println("Not even numbers: ");
        IntStream.of(num)
                .filter(x -> x % 2 == 1)
                .forEach(System.out::println);
    }
}
