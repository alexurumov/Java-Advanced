import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOfElements {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] setLengths = in.nextLine().split(" ");

        int n = Integer.parseInt(setLengths[0]);

        Set<Integer> first = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(in.nextLine());
            first.add(number);
        }

        int m = Integer.parseInt(setLengths[1]);

        Set<Integer> second = new LinkedHashSet<>();

        for (int i = 0; i < m; i++) {
            int number = Integer.parseInt(in.nextLine());
            second.add(number);
        }

        for (Integer number : first) {
            if (second.contains(number)) {
                System.out.print(number + " ");
            }
        }

    }
}
