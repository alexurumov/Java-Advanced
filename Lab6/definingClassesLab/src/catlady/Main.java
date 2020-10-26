package catlady;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        ArrayList<Cat> cats = new ArrayList<>();

        while (!line.equals("End")) {

            String[] split = line.split(" ");

            String breed = split[0];
            String name = split[1];
            double param = Double.parseDouble(split[2]);

            Cat cat = null;

            if (breed.equals("StreetExtraordinaire")) {

                cat = new StreetExtraordinaire(name, param);

            } else if (breed.equals("Siamese")) {

                cat = new Siamese(name, param);

            } else {

                cat = new Cymric(name, param);

            }

            cats.add(cat);

            line = scanner.nextLine();
        }

        String outputCat = scanner.nextLine();

        for (Cat cat : cats) {
            if (cat.getName().equals(outputCat)) {
                System.out.println(cat);
            }
        }

    }
}
