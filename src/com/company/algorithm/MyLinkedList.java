package com.company.algorithm;

import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Sherzod");
        linkedList.add("Bekzod");
        linkedList.add("Sarvar");
        linkedList.add(1,"Element");
        linkedList.push("dsdsds");


        System.out.println(linkedList.toString());
    }
}
