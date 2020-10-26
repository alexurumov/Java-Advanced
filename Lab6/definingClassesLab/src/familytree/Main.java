package familytree;

import jdk.jshell.PersistentSnippet;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Person> people = new ArrayList<>();

        ArrayList<String> relations = new ArrayList<>();

        String line = scanner.nextLine();

        while (!line.equals("End")) {

            if (line.contains(" - ")) {

               relations.add(line);

            } else {

                String[] split = line.split(" ");
                Person currentPerson = new Person();
                currentPerson.setPeopleDetails(currentPerson, split, people);

            }

            line = scanner.nextLine();
        }

        PrintPerson printPerson = new PrintPerson();

        String firstName = people.get(0).getFirstName();
        String lastName = people.get(0).getLastName();
        String birthday = people.get(0).getBirthday();

        printPerson.setFirstName(firstName);
        printPerson.setLastName(lastName);
        printPerson.setBirthday(birthday);

        for (String relation : relations) {

            String[] split = relation.split(" - ");

            String parentDetails = split[0];
            String childDetails = split[1];

            Person parent = sortRelation(parentDetails, relation, people);
            Person child = sortRelation(childDetails, relation, people);

            if (printPerson.getBirthday().equals(parent.getBirthday())) {
                printPerson.getChildren().add(child);
            } else if (printPerson.getBirthday().equals(child.getBirthday())) {
                printPerson.getParents().add(parent);
            }

        }

        System.out.println(printPerson.getInfo());

    }

    private static Person sortRelation(String details, String relation, ArrayList<Person> people) throws CloneNotSupportedException {

        Person current = null;

        if (details.contains("/")) {

            String birthday = details;

            for (Person person : people) {
                if (person.getExistingByBirthday(birthday) != null) {
                    current = (Person) person.getExistingByBirthday(birthday).clone();
                    break;
                }
            }

        } else {

            String[] names = details.split(" ");
            String firstName = names[0];
            String lastName = names[1];


            for (Person person : people) {
                if (person.getExistingByNames(firstName, lastName) != null) {
                    current = (Person) person.getExistingByNames(firstName, lastName).clone();
                    break;
                }
            }

        }

        return current;
    }


}
