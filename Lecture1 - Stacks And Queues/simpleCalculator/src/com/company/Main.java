package com.company;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] inputs = in.nextLine().split("\\s+");

        ArrayDeque<String> tokens = new ArrayDeque<>();
        Collections.addAll(tokens, inputs);

        while (tokens.size() > 1) {

            int firstNum = Integer.parseInt(tokens.pop());
            String operation = tokens.pop();
            int secondNum = Integer.parseInt(tokens.pop());

            int result = 0;
            if (operation.equals("+")) {
                result = firstNum + secondNum;
            } else {
                result = firstNum - secondNum;
            }

            tokens.push(String.valueOf(result));
        }

        System.out.println(tokens.pop());
    }
}
