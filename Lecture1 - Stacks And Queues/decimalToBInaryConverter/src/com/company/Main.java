package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = Integer.parseInt(in.nextLine());

        ArrayDeque<Integer> binary = new ArrayDeque<>();
        if (number == 0) {
            System.out.println(0);
            return;
        }

        while (number != 0) {
            binary.push(number % 2);
            number /= 2;
        }

        while (!binary.isEmpty()) {
            System.out.print(binary.pop());
        }
    }
}
