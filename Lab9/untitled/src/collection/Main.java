package collection;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] data = Arrays.stream(scanner.nextLine().split(" ")).skip(1).toArray(String[]::new);

        ListyIterator listyIterator = new ListyIterator(Arrays.asList(data));

        String line = scanner.nextLine();

        while (!line.equals("END")) {

            switch (line) {

                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    try {
                        System.out.println(listyIterator.print());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "PrintAll":
                    for (String s : listyIterator) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                    break;

            }

            line = scanner.nextLine();
        }
    }
}
