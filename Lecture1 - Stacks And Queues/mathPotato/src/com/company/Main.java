package com.company;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] names = in.nextLine().split("\\s+");
        int n = Integer.parseInt(in.nextLine());

        ArrayDeque<String> children = new ArrayDeque<>();

        Collections.addAll(children, names);

        int round = 0;
        while (children.size() > 1) {
            round++;
            for (int i = 0; i < n - 1; i++) {
                String currentChild = children.poll();
                children.offer(currentChild);
            }
            if (isPrime(round)) {
                System.out.println("Prime " + children.peek());
            } else {
                String child = children.poll();
                System.out.println("Removed " + child);
            }


        }

        System.out.println("Last is " + children.poll());
    }

    private static boolean isPrime(int round) {
        if (round == 1) {
            return false;
        }
        for (int i = 2; i < round; i++) {
            if (round % i == 0) {
                return false;
            }
        }

        return true;
    }
}
