package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayDeque<String> browser = new ArrayDeque<>();

        String line = in.nextLine();

        while(!line.equals("Home")) {

            if (line.equals("back")) {
                if (browser.size() <= 1) {
                    System.out.println("no previous URLs");
                } else {
                    browser.pop();
                    String current = browser.peek();
                    System.out.println(current);
                }
            } else {
                browser.push(line);
                System.out.println(browser.peek());
            }

            line = in.nextLine();
        }
    }
}
