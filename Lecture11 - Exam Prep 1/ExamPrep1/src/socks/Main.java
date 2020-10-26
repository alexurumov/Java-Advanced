package socks;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> leftSocks = new ArrayDeque<>();
        ArrayDeque<Integer> rightSocks = new ArrayDeque<>();

        List<Integer> pairs = new ArrayList<>();

        Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .forEach(leftSocks::push);

        Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .forEach(rightSocks::offer);

        while (leftSocks.size() > 0 && rightSocks.size() > 0) {

            int leftSock = leftSocks.peek();
            int rightSock = rightSocks.peek();

            if (leftSock > rightSock) {
                leftSocks.pop();
                rightSocks.poll();
                pairs.add(leftSock + rightSock);
            } else if (rightSock > leftSock) {
                leftSocks.pop();
            } else {
                rightSocks.poll();
                leftSocks.poll();
                leftSocks.push(leftSock + 1);
            }
        }

        pairs.stream().max(Integer::compareTo).ifPresent(System.out::println);
        pairs.forEach(e -> System.out.print(e + " "));
    }
}
