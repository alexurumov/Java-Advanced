import java.util.*;
import java.util.stream.Collectors;

public class CustomComparator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> numbers = Arrays.stream(in.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));

        Comparator<Integer> comparator = ((a, b) -> {
            if (a % 2 == 0 && b % 2 != 0){
                return -1;
            } else if (b % 2 == 0 && a != 0) {
                return 1;
            }
            return a.compareTo(b);
        });

        numbers.stream().sorted(comparator).forEach(e -> System.out.print(e + " "));
    }
}
