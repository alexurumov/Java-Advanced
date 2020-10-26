package google;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Map<String, Person> people = new HashMap<>();

        while (!input[0].equals("End")) {

            String personName = input[0];
            people.putIfAbsent(personName, new Person());

            String cmd = input[1];

            switch (cmd) {
                case "company":
                    people.get(personName).setCompany(input);
                    break;
                case "pokemon":
                    people.get(personName).addPokemon(input);
                    break;
                case "parents":
                    people.get(personName).addParents(input);
                    break;
                case "children":
                    people.get(personName).addChildren(input);
                    break;
                case "car":
                    people.get(personName).setCar(input);
                    break;
                default:
                    break;
            }

            input = scanner.nextLine().split(" ");
        }

        String printPerson = scanner.nextLine();

        System.out.println(printPerson);

        people.entrySet().stream().filter(es -> es.getKey().equals(printPerson)).forEach(e -> {
            System.out.println("Company: ");
            Company company = e.getValue().getCompany();
            if (company != null) {
                System.out.println(company.getInfo());
            }

            System.out.println("Car: ");
            Car car = e.getValue().getCar();
            if (car != null) {
                System.out.println(car.getInfo());
            }

            System.out.println("Pokemon: ");
            e.getValue().getPokemons().forEach(pok -> System.out.println(pok.getInfo()));

            System.out.println("Parents: ");
            e.getValue().getParents().forEach(par -> System.out.println(par.getInfo()));

            System.out.println("Children: ");
            e.getValue().getChildren().forEach(ch -> System.out.println(ch.getInfo()));
        });

    }
}
