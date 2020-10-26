import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String line = in.nextLine();

        Map<String, Integer> resources = new LinkedHashMap<>();

        while (!line.equals("stop")) {
            resources.putIfAbsent(line, 0);
            int quantity = Integer.parseInt(in.nextLine());
            resources.put(line, resources.get(line) + quantity);

            line = in.nextLine();
        }

        resources.entrySet().stream().forEach(es -> System.out.println(es.getKey() + " -> " + es.getValue()));
    }
}
