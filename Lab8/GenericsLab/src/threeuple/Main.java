package threeuple;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split(" ");
        String[] secondLine = scanner.nextLine().split(" ");
        String[] thirdLine = scanner.nextLine().split(" ");

        Threeuple<String, String, String> first = new Threeuple<>(
                firstLine[0] + " " + firstLine[1], firstLine[2], firstLine[3]
        );

        Threeuple<String, Integer, Boolean> second = new Threeuple<>(
                secondLine[0], Integer.parseInt(secondLine[1]), secondLine[2].equals("drunk")
        );

        Threeuple<String, Double, String> third = new Threeuple<>(
                thirdLine[0], Double.parseDouble(thirdLine[1]), thirdLine[2]
        );

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
