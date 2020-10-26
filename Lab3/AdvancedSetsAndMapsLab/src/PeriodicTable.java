import java.util.*;

public class PeriodicTable {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        Set<String> periodicTable = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] compounds = in.nextLine().split(" ");
            periodicTable.addAll(Arrays.asList(compounds));
        }

        periodicTable.stream().forEach(e -> System.out.print(e + " "));
    }
}
