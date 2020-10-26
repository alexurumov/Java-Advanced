import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindEvensOrOdds {

    public static void main(String[] args) {

        Predicate<Integer> filterEven = x -> x % 2 == 0;
        Predicate<Integer> filterOdd = x -> x % 2 != 0;

        Scanner in = new Scanner(System.in);

        String[] split = in.nextLine().split(" ");

        String type = in.nextLine();

        int lowerBound = Integer.parseInt(split[0]);
        int upperBound = Integer.parseInt(split[1]);

        Predicate<Integer> byType = filterEven;

        if (type.equals("odd")) {
            byType = filterOdd;
        }

        IntStream.rangeClosed(lowerBound, upperBound)
                .boxed()
                .filter(byType)
                .forEach(e -> System.out.print(e + " "));

    }
}
