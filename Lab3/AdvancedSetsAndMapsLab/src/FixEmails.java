import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String name = in.nextLine();

        Map<String, String> emails = new LinkedHashMap<>();

        while (!name.equals("stop")) {
            String email = in.nextLine();
            String[] emailInParts = email.split("\\.");
            String emailSuffix = emailInParts[emailInParts.length - 1].toLowerCase();
            if (!emailSuffix.equals("us") && !emailSuffix.equals("uk") && !emailSuffix.equals("com")) {
                emails.put(name, email);
            }

            name = in.nextLine();
        }

        emails.entrySet().stream().forEach(es -> System.out.println(es.getKey() + " -> " + es.getValue()));
    }
}
