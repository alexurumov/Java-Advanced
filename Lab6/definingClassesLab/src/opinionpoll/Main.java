package opinionpoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        while (n-- > 0) {

            String[] split = scanner.nextLine().split(" ");

            String name = split[0];
            int age = Integer.parseInt(split[1]);

            Person p = new Person(name, age);

            people.add(p);
        }

        people.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .filter(p -> p.getAge() > 30).forEach(p -> System.out.println(p.getName() + " - " + p.getAge()));
    }
}
