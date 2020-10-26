package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayDeque<String> back = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();

        String line = in.nextLine();
        String current = "";

        while(!line.equals("Home")) {

            if (line.equals("back")) {

                if (back.isEmpty()) {
                    System.out.println("no previous URLs");
                    line = in.nextLine();
                    continue;
                } else {
                    forward.push(current);
                    current = back.pop();
                }

            } else if (line.equals("forward")) {

                if (forward.isEmpty()) {
                    System.out.println("no next URLs");
                    line = in.nextLine();
                    continue;
                } else {
                    back.push(current);
                    current = forward.pop();
                }

            } else {
                if (current.equals("")) {
                    current = line;
                } else {
                    back.push(current);
                    current = line;
                }
                forward.clear();

            }

            System.out.println(current);

            line = in.nextLine();
        }


    }
}
