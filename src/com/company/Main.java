package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world!");
        int x = 1999;
        int y = 10;
        while (x % y == 0) {
            y *= 10;
        }
        y = y/10;

        System.out.println(y);

    }
}
