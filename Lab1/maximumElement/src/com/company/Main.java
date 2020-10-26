package com.company;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] input = in.nextLine().split("\\s+");
            String command = input[0];
            switch (command){
                case "1":
                    numbers.push(Integer.parseInt(input[1]));
                    break;
                case "2":
                    numbers.pop();
                    break;
                case "3":
                    numbers.stream().max(Integer::compareTo).ifPresent(e -> System.out.println(e));
                    break;
                default:
                    break;

            }
        }
    }
}
