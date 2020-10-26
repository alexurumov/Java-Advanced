package com.company;

import java.util.Scanner;

public class Main {

    static long[] memory;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        memory = new long[n + 1];

        System.out.println(getFibo(n));
    }

    private static long getFibo(int n) {

        if (n < 2) {
            return 1;
        }

        if (memory[n] != 0) {
            return memory[n];
        }

        return memory[n] = getFibo(n - 1) + getFibo(n - 2);

    }
}
