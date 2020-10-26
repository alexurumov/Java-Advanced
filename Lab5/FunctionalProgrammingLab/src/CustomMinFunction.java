import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class CustomMinFunction {

    public static void main(String[] args) {

        Function<int[], Integer> min = arr -> Arrays.stream(arr).reduce(Integer::min).getAsInt();

        Scanner in = new Scanner(System.in);

        int[] ints = Arrays.stream(in.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(min.apply(ints));
    }
}
