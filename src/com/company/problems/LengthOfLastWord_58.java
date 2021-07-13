package com.company.problems;

public class LengthOfLastWord_58 {
    public static void main(String[] args) {
        String str = "java";

//        int size = lengthOfLastWord(str);

        String[] s = str.split(" ");
        System.out.println(s.length + " " + s[s.length - 1].length());

    }

    private static int lengthOfLastWord(String str) {
        String[] s = str.split(" ");
        if (s.length == 0){
            return 0;
        }else {
            return s[s.length - 1].length();
        }
    }
}
