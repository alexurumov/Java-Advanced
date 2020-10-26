package comparingobjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        List<Person> people = new ArrayList<>();

        while (!line.equals("END")) {

            String[] input = line.split(" ");
            Person person = new Person(input[0], Integer.parseInt(input[1]), input[2]);

            people.add(person);

            line = in.nextLine();
        }

        int index = Integer.parseInt(in.nextLine());

        try {
            Person currentPerson = people.get(index);
            int equalNum = 0;

            for (Person person : people) {
                if (person.compareTo(currentPerson) == 0) {
                    equalNum++;
                }
            }

            System.out.printf("%d %d %d", equalNum, people.size() - equalNum, people.size());
        } catch (Exception e) {
            System.out.println("No matches");
        }



    }
}
