import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<String> names = Arrays.stream(in.nextLine().split(" "))
                .collect(Collectors.toList());

        String line = in.nextLine();

        while (!line.equals("Party!")) {

            String[] split = line.split(" ");

            if (split[0].equals("Remove")) {

                Predicate<String> predicate = null;
                switch (split[1]) {
                    case "StartsWith":
                        predicate = str -> !str.startsWith(split[2]);
                        break;
                    case "EndsWith":
                        predicate = str -> !str.endsWith(split[2]);
                        break;
                    case "Length":
                        predicate = str -> str.length() != Integer.parseInt(split[2]);
                        break;
                }

                names = names.stream().filter(predicate).collect(Collectors.toList());

            } else {

                Predicate<String> predicate = null;
                switch (split[1]) {
                    case "StartsWith":
                        predicate = str -> str.startsWith(split[2]);
                        break;
                    case "EndsWith":
                        predicate = str -> str.endsWith(split[2]);
                        break;
                    case "Length":
                        predicate = str -> str.length() == Integer.parseInt(split[2]);
                        break;
                    default:
                        break;
                }

                List<String> doubleNames = names.stream().filter(predicate).collect(Collectors.toList());

                for (String doubleName : doubleNames) {
                    names.add(names.indexOf(doubleName), doubleName);
                }
            }

            line = in.nextLine();
        }

        if (names.isEmpty()) {
            System.out.println("Nobody is going to the party!");
            return;
        }

        Collections.sort(names);

        System.out.println(names.toString().replaceAll("[\\[\\]]", "") + " are going to the party!");
    }
}
