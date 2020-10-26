package rawdata;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> fragile = new LinkedHashSet<>();
        Set<String> flamable = new LinkedHashSet<>();

        while (n-- > 0) {

            String[] split = scanner.nextLine().split(" ");

            String model = split[0];
            int power = Integer.parseInt(split[2]);
            String cargoType = split[4];

            switch (cargoType) {
                case "fragile":
                    List<Double> tyres = Arrays.asList(Double.parseDouble(split[5]), Double.parseDouble(split[7]), Double.parseDouble(split[9]), Double.parseDouble(split[11]));
                    for (Double tyre : tyres) {
                        if (tyre < 1.0) {
                            fragile.add(model);
                            break;
                        }
                    }
                    break;
                default:
                    if (power > 250) {
                        flamable.add(model);
                    }
                    break;
            }
        }

        String line = scanner.nextLine();
        switch (line) {
            case "fragile":
                for (String s : fragile) {
                    System.out.println(s);
                }
                break;
            default:
                for (String s : flamable) {
                    System.out.println(s);
                }
                break;
        }
    }
}
