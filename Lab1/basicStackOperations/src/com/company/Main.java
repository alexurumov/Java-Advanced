package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] commands = in.nextLine().split("\\s+");
        int pushes = Integer.parseInt(commands[0]);
        int pops = Integer.parseInt(commands[1]);
        int isPresent = Integer.parseInt(commands[2]);

        String[] input = in.nextLine().split("\\s+");

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < pushes; i++) {
            numbers.push(Integer.parseInt(input[i]));
        }

        for (int i = 0; i < pops; i++) {
            numbers.pop();
        }

        if (numbers.isEmpty()) {
            System.out.println("0");
        } else {
            if (numbers.contains(isPresent)) {
                System.out.println("true");
            } else {
                if (numbers.size() > 1) {
                    numbers.stream().sorted((e1, e2) -> e2.compareTo(e1));
                }
                System.out.println(numbers.pop());
            }
        }
    }
}
