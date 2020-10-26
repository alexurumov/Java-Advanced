package com.company;

import java.util.*;

public class SumOfCoins {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String line = in.nextLine();
        LinkedHashMap<Integer, Integer> coinOccurences = new LinkedHashMap<>();

        Arrays.stream(line.replaceAll("Coins: ", "")
                .split(", "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .sorted((f, s) -> Integer.compare(s, f))
                .forEach(num -> coinOccurences.put(num, 0));

        int sum = Integer.parseInt(in.nextLine().split(": ")[1]);

        int coinsCounter = 0;

        for (Integer coinValue : coinOccurences.keySet()) {
            int count = sum / coinValue;
            //TODO: Might bug
            coinOccurences.put(coinValue, count);
            sum = sum % coinValue;
            coinsCounter += count;
        }

        if (sum == 0) {

            System.out.println("Number of coins to take: " + coinsCounter);
            coinOccurences.entrySet().stream().filter(es -> es.getValue() != 0).forEach(es -> {
                System.out.println(es.getValue() + " coin(s) with value " + es.getKey());
            });

        } else {
            System.out.println("Error");
        }

    }
}
