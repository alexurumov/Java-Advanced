import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FilterByAge {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        Map<String, Integer> peopleAndAges = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] split = in.nextLine().split(", ");
            peopleAndAges.put(split[0], Integer.parseInt(split[1]));
        }

        String condition = in.nextLine();
        int sortAge = Integer.parseInt(in.nextLine());
        String format = in.nextLine();

        switch (format) {
            case "name":
                if (condition.equals("older")) {
                    peopleAndAges.entrySet().stream().filter(es -> es.getValue() >= sortAge).forEach(es -> System.out.println(es.getKey()));
                } else {
                    peopleAndAges.entrySet().stream().filter(es -> es.getValue() < sortAge).forEach(es -> System.out.println(es.getKey()));
                }
                break;
            case "age":
                if (condition.equals("older")) {
                    peopleAndAges.entrySet().stream().filter(es -> es.getValue() >= sortAge).forEach(es -> System.out.println(es.getValue()));
                } else {
                    peopleAndAges.entrySet().stream().filter(es -> es.getValue() < sortAge).forEach(es -> System.out.println(es.getValue()));
                }
                break;
            case "name age":
                if (condition.equals("older")) {
                    peopleAndAges.entrySet().stream().filter(es -> es.getValue() >= sortAge).forEach(es -> System.out.println(es.getKey() + " - " + es.getValue()));
                } else {
                    peopleAndAges.entrySet().stream().filter(es -> es.getValue() < sortAge).forEach(es -> System.out.println(es.getKey() + " - " + es.getValue()));
                }
                break;
            default:
                break;

        }
    }
}
