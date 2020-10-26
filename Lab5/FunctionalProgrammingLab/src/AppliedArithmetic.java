import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetic {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] numbers = Arrays.stream(in.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<int[], int[]> add = arr -> Arrays.stream(arr).map(e -> ++e).toArray();
        Function<int[], int[]> multiply = arr -> Arrays.stream(arr).map(e -> e * 2).toArray();
        Function<int[], int[]> subtract = arr -> Arrays.stream(arr).map(e -> --e).toArray();
        Consumer<int[]> print = arr -> Arrays.stream(arr).forEach(e -> System.out.print(e + " "));

        String line = in.nextLine();

        while (!line.equals("end")) {

            switch (line) {
                case "add":
                    numbers = add.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtract.apply(numbers);
                    break;
                default:
                    print.accept(numbers);
                    System.out.println();
                    break;
            }

            line = in.nextLine();
        }
    }
}

