package com.company.problems;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ValidAnagram_242 {
    public static void main(String[] args) {
        boolean a = isAnagram("ab","a");
        System.out.println(a);
    }

    private static boolean isAnagram(String s, String t) {
        return Arrays.stream(s.split("")).sorted().collect(Collectors.joining())
                .equals(Arrays.stream(t.split("")).sorted().collect(Collectors.joining()));
    }
}
