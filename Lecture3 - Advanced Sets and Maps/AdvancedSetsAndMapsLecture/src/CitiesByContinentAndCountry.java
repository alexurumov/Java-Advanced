import java.util.*;

public class CitiesByContinentAndCountry {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        LinkedHashMap<String, LinkedHashMap<String, List<String>>> continentsCountriesCities = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = in.nextLine().split(" ");
            String continent = input[0];
            String country = input[1];
            String city = input[2];

            if (!continentsCountriesCities.containsKey(continent)) {
                continentsCountriesCities.put(continent, new LinkedHashMap<>() {{ put(country, new ArrayList<>() {{add(city); }}); }});
            } else {
                if (!continentsCountriesCities.get(continent).containsKey(country)) {
                    continentsCountriesCities.get(continent).put(country, new ArrayList<>() {{add(city);}});
                } else {
                    continentsCountriesCities.get(continent).get(country).add(city);
                }
            }
        }

        continentsCountriesCities.entrySet().stream().forEach(es1 -> {
            System.out.println(es1.getKey() + ":");
            es1.getValue().entrySet().stream().forEach(es2 -> {
                System.out.printf("  %s -> ", es2.getKey());
                for (int i = 0; i < es2.getValue().size(); i++) {
                    if (i != es2.getValue().size() - 1) {
                        System.out.printf("%s, ", es2.getValue().get(i));
                    } else {
                        System.out.println(es2.getValue().get(i));
                    }
                }
            });
        });
    }
}
