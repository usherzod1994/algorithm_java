package com.company.problems;

import java.util.Arrays;
import java.util.List;

public class TruncateSentence_1816 {
    public static void main(String[] args) {
        String str = "Hello how are you Contestant";
        int k = 4;
        String result = truncateSentence(str,k);
        System.out.println(result);

    }

    private static String truncateSentence(String s, int k) {

      /*  List<String> s1 = Arrays.asList(s.split(" ")).subList(0,k);

        return s1.toString().replaceAll(",", "").replaceAll("\\[", "").replaceAll("\\]", "");*/

        String[] words = s.split(" ");
        String[] truncated = new String[k];


        for (int i = 0; i < k; ++i)
            truncated[i] = words[i];

        return String.join(" ", truncated);
    }


}
