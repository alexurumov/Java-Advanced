import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] numbersArr = in.nextLine().split(", ");

        List<Integer> evenNumbers = Arrays.stream(numbersArr)
                .map(Integer::parseInt)
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        List<String> numbers = evenNumbers.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());

        System.out.println(String.join(", ", numbers));

        evenNumbers.sort(Integer::compareTo);

        List<String> evenSorted = evenNumbers.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());

        System.out.println(String.join(", ", evenSorted));
    }
}
