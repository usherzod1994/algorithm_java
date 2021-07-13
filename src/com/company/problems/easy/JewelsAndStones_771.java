package com.company.problems.easy;

public class JewelsAndStones_771 {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("z","ZZ"));
    }

    private static int numJewelsInStones(String jewels, String stones){
        int count = 0;
        char[] chars = jewels.toCharArray();
        char[] chars1 = stones.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int i1 = 0; i1 < chars1.length; i1++) {
                if (chars[i] == chars1[i1]){
                    count++;
                }
            }
        }

        return count;
    }
}
