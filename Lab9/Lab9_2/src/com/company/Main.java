package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) { //Variant 4
	// write your code here
        String[] str = new String[]{"ab", "jb", "fj", "tdghj", "of", "hk", "ih"};
        System.out.println("Even numbers: ");
        Map<Character, Character> map = Stream.of(str)
                .collect(Collectors.toMap(
                i -> i.charAt(0),
                i -> i.charAt(1)
        ));
        System.out.println(map);
    }
}
