import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.jar.Attributes;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListOfPredicates {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        Set<Integer> setOfDividers = Arrays.stream(in.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toSet());

        List<Predicate<Integer>> listOfPredicates = new ArrayList<>();

        for (Integer divider : setOfDividers) {
            Predicate<Integer> predicate = num -> num % divider == 0;
            listOfPredicates.add(predicate);
        }


            IntStream.rangeClosed(1, n).boxed().forEach(num -> {
                boolean isValid = true;
                for (Predicate<Integer> predicate : listOfPredicates) {
                    if (!predicate.test(num)) {
                        isValid = false;
                        break;
                    }
                }
                if (isValid) {
                    System.out.print(num + " ");
                }
            });

    }
}
