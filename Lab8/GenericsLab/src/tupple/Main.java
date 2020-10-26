package tupple;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String[] secondLine = scanner.nextLine().split(" ");
        String[] thirdLine = scanner.nextLine().split(" ");

        Tupple<String, String> first = new Tupple<>(
                firstLine.substring(0, firstLine.lastIndexOf(" ")).trim(),
                firstLine.substring(firstLine.lastIndexOf(" ") + 1)
        );

        Tupple<String, Integer> second = new Tupple<>(
                secondLine[0], Integer.parseInt(secondLine[1])
        );

        Tupple<Integer, Double> third = new Tupple<>(
                Integer.parseInt(thirdLine[0]), Double.parseDouble(thirdLine[1])
        );

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
