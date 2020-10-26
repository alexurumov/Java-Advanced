import java.util.*;
import java.util.stream.Collectors;

public class Voina {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Set<Integer> firstPlayerDeck = new LinkedHashSet<>();

        List<Integer> first = Arrays.stream(in.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        firstPlayerDeck.addAll(first);

        Set<Integer> secondPlayerDeck = new LinkedHashSet<>();

        List<Integer> second = Arrays.stream(in.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        secondPlayerDeck.addAll(second);

        for (int i = 0; i < 50; i++) {

            if (firstPlayerDeck.isEmpty()) {
                System.out.println("Second player win!");
                return;
            }

            if (secondPlayerDeck.isEmpty()) {
                System.out.println("First player win!");
                return;
            }

            int firstPlayerCard = firstPlayerDeck.stream().findFirst().get();
            int secondPlayerCard = secondPlayerDeck.stream().findFirst().get();

            firstPlayerDeck.remove(firstPlayerCard);
            secondPlayerDeck.remove(secondPlayerCard);

            if (firstPlayerCard > secondPlayerCard) {

                firstPlayerDeck.add(firstPlayerCard);
                firstPlayerDeck.add(secondPlayerCard);

            } else if (firstPlayerCard < secondPlayerCard){

                secondPlayerDeck.add(firstPlayerCard);
                secondPlayerDeck.add(secondPlayerCard);

            } else {

                firstPlayerDeck.add(firstPlayerCard);
                secondPlayerDeck.add(secondPlayerCard);
            }

        }

        if (firstPlayerDeck.size() > secondPlayerDeck.size()) {
            System.out.println("First player win!");
        } else if (firstPlayerDeck.size() < secondPlayerDeck.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }

    }
}
