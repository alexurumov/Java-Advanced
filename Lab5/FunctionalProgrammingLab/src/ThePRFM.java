import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Predicate;

public class ThePRFM {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] names = in.nextLine().split(" ");

        String line = in.nextLine();

        Map<String, Predicate<String>> predicates = new HashMap<>();

        while (!line.equals("Print")) {

            String[] split = line.substring(line.indexOf(";") + 1).split(";");
            String name = split[0] + split[1];

            if (line.contains("Add")) {
                Predicate<String> predicate = null;
                switch (split[0]) {
                    case "Starts with":
                        predicate = str -> str.startsWith(split[1]);
                        break;
                    case "Ends with":
                        predicate = str -> str.endsWith(split[1]);
                        break;
                    case "Length":
                        predicate = str -> str.length() == Integer.parseInt(split[1]);
                        break;
                    case "Contains":
                        predicate = str -> str.contains(split[1]);
                        break;
                    default:
                        break;
                }

                predicates.putIfAbsent(name, predicate);

            } else {
                predicates.remove(name);
            }

            line = in.nextLine();
        }

        for (String name : names) {
            boolean isValid = true;

            for (String predicate : predicates.keySet()) {
                if (predicates.get(predicate).test(name)){
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                System.out.print(name + " ");
            }
        }

        

    }
}
