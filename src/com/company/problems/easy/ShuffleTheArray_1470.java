package com.company.problems.easy;

public class ShuffleTheArray_1470 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int n = 3;
        int [] num = shuffle(nums, n);
    }

    private static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        int j = 0;
        for (int i = 0; i < n; i++) {
           result[j] = nums[i];
           j++;
           result[j] = nums[n+i];
           j++;
        }
        return result;
    }
}
