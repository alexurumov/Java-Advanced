package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiteFactorial {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int factorial = Integer.parseInt(in.nextLine());

        System.out.println(fact(factorial));
    }

    private static int fact(int factorial) {
        if (factorial == 1) {
            return 1;
        }

        return factorial * fact(factorial - 1);
    }
}
