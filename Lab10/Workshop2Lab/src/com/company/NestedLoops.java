package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class NestedLoops {

    public static int[] arr;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        arr = new int[n];

        printNestedLoops(n, 0);
    }

    private static void printNestedLoops(int n, int begin) {

        if (begin >= n) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            arr[begin] = i;
            printNestedLoops(n, begin + 1);
        }
    }
}
