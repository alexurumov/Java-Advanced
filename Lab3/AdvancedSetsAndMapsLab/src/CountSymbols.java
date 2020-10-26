import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String line = in.nextLine();

        TreeMap<Character, Integer> symbols = new TreeMap<>();

        for (int i = 0; i < line.length(); i++) {
            char current = line.charAt(i);
            symbols.putIfAbsent(current, 0);
            symbols.put(current, symbols.get(current) + 1);
        }

        symbols.entrySet().stream().forEach(es -> System.out.printf("%c: %d time/s\n", es.getKey(), es.getValue()));
    }
}
