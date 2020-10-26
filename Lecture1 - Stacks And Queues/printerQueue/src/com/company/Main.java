package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        ArrayDeque<String> printer = new ArrayDeque<>();

        while (!line.equals("print")) {

            if (line.equals("cancel")) {
                if (printer.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printer.poll());
                }
            } else {
                printer.add(line);
            }

            line = in.nextLine();
        }

        while (!printer.isEmpty()) {
            System.out.println(printer.poll());
        }
    }
}
