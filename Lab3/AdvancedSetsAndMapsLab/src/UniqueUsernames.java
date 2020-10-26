import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        LinkedHashSet<String> usernames = new LinkedHashSet<>();

        int n = Integer.parseInt(in.nextLine());

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            usernames.add(name);
        }

        usernames.stream().forEach(e -> System.out.println(e));
    }
}
