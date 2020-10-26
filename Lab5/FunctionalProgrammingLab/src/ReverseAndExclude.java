import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.reverse(numbers);

        int n = Integer.parseInt(in.nextLine());

        BiFunction<List<Integer>, Integer, List<Integer>> reverseAndExclude = ((list, num) -> list.stream().filter(e -> e % num != 0).collect(Collectors.toList()));

        reverseAndExclude.apply(numbers, n).stream().forEach(e -> System.out.print(e + " "));
    }
}
