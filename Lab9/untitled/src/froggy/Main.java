package froggy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] stones = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        Lake lake = new Lake(stones);

        StringBuilder stringBuilder = new StringBuilder();

        for (Integer stone : lake) {
            stringBuilder.append(stone).append(", ");
        }

        System.out.println(stringBuilder.toString().substring(0, stringBuilder.lastIndexOf(", ")));
    }
}
