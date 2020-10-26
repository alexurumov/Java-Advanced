import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {

    public static void main(String[] args) {

        Consumer<String> printWithSir = word -> System.out.println("Sir " + word);

        Scanner in = new Scanner(System.in);

        String[] split = in.nextLine().split("\\s+");

        for (String word : split) {
            printWithSir.accept(word);
        }


    }
}
