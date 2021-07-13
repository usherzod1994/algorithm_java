package com.company.problems.easy;

public class Pow_50 {
    public static void main(String[] args) {
        double x = 5;
        int n = 2;
        double a = myPow(x,n);
        System.out.println(a);
    }

    private static double myPow(double x, int n) {
        return Math.pow(x,n);

    }
}
