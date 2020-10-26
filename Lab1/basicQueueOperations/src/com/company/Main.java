package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] commands = in.nextLine().split("\\s+");
        int adds = Integer.parseInt(commands[0]);
        int polls = Integer.parseInt(commands[1]);
        int isPresent = Integer.parseInt(commands[2]);

        String[] input = in.nextLine().split("\\s+");

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < adds; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }

        for (int i = 0; i < polls; i++) {
            numbers.poll();
        }

        if (numbers.isEmpty()) {
            System.out.println("0");
        } else {
            if (numbers.contains(isPresent)) {
                System.out.println("true");
            } else {
                if (numbers.size() > 1) {
                    numbers.stream().min(Integer::compareTo).ifPresent(e -> System.out.println(e));
                }
            }
        }
    }
}