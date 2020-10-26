package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        ArrayDeque<Integer> bracketIndexes = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                bracketIndexes.push(i);
            } else if (input.charAt(i) == ')') {
                int startIndex = bracketIndexes.pop();
                System.out.println(input.substring(startIndex, i + 1));
            }
        }
    }
}
