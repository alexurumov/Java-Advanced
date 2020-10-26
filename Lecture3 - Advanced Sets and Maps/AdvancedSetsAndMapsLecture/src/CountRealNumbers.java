import java.util.*;

public class CountRealNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Map<Double, Integer> occurrences = new LinkedHashMap<>();

        double[] numbers = Arrays.stream(in.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        for (double number : numbers) {
            occurrences.putIfAbsent(number, 0);
            occurrences.put(number, occurrences.get(number) + 1);
        }

        occurrences.entrySet().stream().forEach(es -> System.out.printf("%.1f -> %d\n", es.getKey(), es.getValue()));
    }
}
