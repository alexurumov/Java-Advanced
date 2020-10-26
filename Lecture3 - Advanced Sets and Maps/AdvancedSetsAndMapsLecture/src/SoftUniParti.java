import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParti {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String line = in.nextLine();

        Set<String> guestList = new TreeSet<>();

        while (!line.equals("PARTY")) {

            guestList.add(line);

            line = in.nextLine();
        }

        line = in.nextLine();

        while (!line.equals("END")) {

            guestList.remove(line);

            line = in.nextLine();
        }

        System.out.println(guestList.size());

        for (String guest : guestList) {
            System.out.println(guest);
        }
    }
}
