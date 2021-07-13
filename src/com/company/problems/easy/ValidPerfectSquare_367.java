package com.company.problems.easy;

public class ValidPerfectSquare_367 {
    public static void main(String[] args){
        int a = 1;
        System.out.println(isPerfectSquare2(16));
        System.out.println(isPerfectSquare(1));
    }

    private static boolean isPerfectSquare2(int num){
        double input = Math.sqrt(num);
        try { //Try to make the input into an integer
            String s = String.valueOf(input).substring(0,(String.valueOf(input).length()-2));
            Integer.parseInt(s);
            return true; //Return true if it works
        }catch( Exception e ) {
            return false; //If it doesn't work return false
        }
    }

    private static boolean isPerfectSquare(int num){
        for (int i = 1; i*i <= num; i++) {
            if (i*i == num) return true;
        }
        return false;
    }
}
