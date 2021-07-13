package com.company.problems;


public class DefangingAnIPAddress_1108 {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String str = defangIPaddr("255.100.50.0");
        System.out.println(str);
    }

    private static String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
