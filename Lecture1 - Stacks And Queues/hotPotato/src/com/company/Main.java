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

        while (children.size() > 1) {
            for (int i = 0; i < n - 1; i++) {
                String currentChild = children.poll();
                children.offer(currentChild);
            }

            String child = children.poll();
            System.out.println("Removed " + child);

        }

        System.out.println("Last is " + children.poll());
    }
}
