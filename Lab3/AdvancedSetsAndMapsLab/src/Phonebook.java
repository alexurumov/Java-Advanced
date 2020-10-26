import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String line = in.nextLine();

        Map<String, String> phonebook = new HashMap<>();

        while (!line.equals("search")) {
            String[] contact = line.split("-");
            phonebook.put(contact[0], contact[1]);

            line = in.nextLine();
        }

        line = in.nextLine();

        while (!line.equals("stop")) {
            if (phonebook.containsKey(line)) {
                System.out.printf("%s -> %s\n", line, phonebook.get(line));
            } else {
                System.out.printf("Contact %s does not exist.\n", line);
            }

            line = in.nextLine();
        }
    }
}
