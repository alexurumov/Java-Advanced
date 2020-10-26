package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split("\\s+");

        ArrayDeque<String> reversed = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            reversed.push(input[i]);
        }

        while (!reversed.isEmpty()) {
            System.out.print(reversed.pop() + ' ');
        }
    }
}



