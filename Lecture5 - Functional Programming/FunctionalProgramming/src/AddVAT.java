import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVAT {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<Double> words = Arrays.stream(in.nextLine().split(", "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        UnaryOperator<Double> addVat = d -> d * 1.2;

        System.out.println("Prices with VAT: ");
        words.stream().map(addVat).forEach(e -> System.out.printf("%.2f\n", e));

    }
}
