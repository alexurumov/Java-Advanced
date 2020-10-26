import java.util.*;

public class HandsOfCards {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String line = in.nextLine();

        Map<String, Set<String>> playerDecks = new LinkedHashMap<>();

        while (!line.equals("JOKER")) {
            String[] cmd = line.split(": ");
            String player = cmd[0];

            playerDecks.putIfAbsent(player, new HashSet<>());

            String[] cards = cmd[1].split(", ");

            Collections.addAll(playerDecks.get(player), cards);

            line = in.nextLine();
        }

        playerDecks.entrySet().stream().forEach(es -> {
            System.out.print(es.getKey() + ": ");
            int value = 0;
            for (String card : es.getValue()) {
                char power = card.charAt(0);
                int sum = 0;
                if (Character.isDigit(power)) {
                    if (power == '1') {
                        sum = 10;
                    } else {
                        sum = power - '0';
                    }

                } else {
                    switch (power) {
                        case 'J':
                            sum = 11;
                            break;
                        case 'Q':
                            sum = 12;
                            break;
                        case 'K':
                            sum = 13;
                            break;
                        case 'A':
                            sum = 14;
                            break;
                        default:
                            break;
                    }
                }
                char type = card.charAt(card.length() - 1);
                switch (type) {
                    case 'S':
                        sum *= 4;
                        break;
                    case 'H':
                        sum *= 3;
                        break;
                    case 'D':
                        sum *= 2;
                        break;
                    case 'C':
                        sum *= 1;
                        break;
                    default:
                        break;
                }
                value += sum;
            }

            System.out.println(value);
        });
    }
}
