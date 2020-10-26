import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {

    public static void main(String[] args) {
        Consumer<String> printWord = System.out::println;

        Scanner in = new Scanner(System.in);

        String[] split = in.nextLine().split("\\s+");

        for (String word : split) {
            printWord.accept(word);
        }

    }
}
