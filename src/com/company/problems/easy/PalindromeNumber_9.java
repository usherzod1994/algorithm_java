package com.company.problems.easy;

public class PalindromeNumber_9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(2002));
        System.out.println(isPalindrome(2002));
    }

    private static boolean isPalindrome(int x){
        boolean result = false;
        if (x < 0){
            result = false;
        }else {
            if (x==0){
                result = true;
            }else {
                int reverse = reverse(x);
                if (reverse == 0 || reverse != x){
                    result =false;
                }else {
                    result = true;
                }
            }

        }
        return result;
    }

    private static int reverse(int x){
        int result = 0;
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        if (x != 0) {
            int y = 10;
            while (x % y == 0) {
                y *= 10;
            }
            y = y / 10;
            StringBuilder str = new StringBuilder();
            if (x < 0){
                String s = Integer.toString(x / y);;
                str.append(s.substring(1)).reverse();
                long l = Long.parseLong("-" + str);
                if (minValue > l){
                    result = 0;
                }else {
                    result = Integer.parseInt("-"+str);
                }
            }else {
                str.append(x / y).reverse();
                long l = Long.parseLong(str.toString());
                if(l > maxValue){
                    result = 0;
                }else {
                    result = Integer.parseInt(str.toString());
                }
            }
        }
        return result;
    }
}
