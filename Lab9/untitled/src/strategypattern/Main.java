package strategypattern;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        TreeSet<Person> peopleByName = new TreeSet<>(new NameComparator());
        TreeSet<Person> peopleByAge = new TreeSet<>(new AgeComparator());

        while (n-- > 0) {

            String[] input = in.nextLine().split(" ");
            Person person = new Person(input[0], Integer.parseInt(input[1]));
            peopleByName.add(person);
            peopleByAge.add(person);

        }
        for (Person person : peopleByName) {
            System.out.println(person.toString());
        }

        for (Person person : peopleByAge) {
            System.out.println(person.toString());
        }
    }
}
