package com.company.algorithm;

import java.util.Stack;

public class SortExamples {
    public static void main(String[] args) {
        myfun(1);

        /*Stack<String> strings = new Stack<>();

        strings.add("Salom");
        strings.add("dsdsds");
        strings.add("dsdsds1");
        strings.add("dsdsds2");
        strings.add("dsdsds3");

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }*/
    }


    // SELECTION SORT
    private static void selectionSort(int[] arr){
    }

    //rekursiya
    private static void myfun(int a){
        System.out.println(a);
        if (a == 10)
            return;
            myfun(a+1);
    }
}
