package com.company;

import smartarray.SmartArray;

public class Main {

    public static void main(String[] args) {

        SmartArray smartArray = new SmartArray();

        for (int i = 1; i < 5; i++) {
            smartArray.add(i);
        }

        smartArray.insertAt(0, 0);

        smartArray.forEach(System.out::println);

        System.out.println(smartArray.contains(0));
    }
}
