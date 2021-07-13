package com.company.problems;

public class ReverseInteger_7 {
    public static void main(String[] args) {
        System.out.println(reverse(-2147483647));


    }

    private static int reverse(int x){
        /*int result = 0;
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
        return result;*/

        long reversed = 0;
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;

        // run loop until num becomes 0
        while(x != 0) {

            // get last digit from num
            int digit = x % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            x /= 10;
        }

        if (reversed > maxValue || reversed < minValue){
            return 0;
        }else {
            return (int) reversed;
        }
    }
}
