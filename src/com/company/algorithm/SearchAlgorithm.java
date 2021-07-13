package com.company.algorithm;

import java.util.Arrays;

public class SearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,9,10,11};
        int item = 10;
        int result = linearSearch(arr, item);
        int result2 = binarySearch(arr, item);
        System.out.println(result);
        System.out.println(result2);

    }

    // Linear Search
    private static int linearSearch(int[] arr, int item){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item)
                return i;
        }
        return -1;
    }

    // Binary Search
    private static int binarySearch(int[] arr, int item){
        int[] arrSorted = Arrays.stream(arr).sorted().toArray();
        int low = 0;
        int high = arrSorted.length-1;
        while (low <= high){
            int mid = (low + high)/2;
            int guess = arrSorted[mid];

            if (guess == item)
                return mid;

            if (guess > item){
                high = mid - 1;
            }else {
                low = mid+1;
            }
        }
        return -1;
    }
}
