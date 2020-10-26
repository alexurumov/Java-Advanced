import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        String[] names = in.nextLine().split("\\s+");

        Predicate<String> predicateForNames = name -> name.length() <= n;

        Arrays.stream(names).filter(predicateForNames::test).forEach(System.out::println);
    }
}
