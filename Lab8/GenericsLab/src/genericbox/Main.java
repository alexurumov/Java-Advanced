package genericbox;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {

            String line = scanner.nextLine();

            GenericBox box = null;

            try {
                int number = Integer.parseInt(line);
                box = new GenericBox<Integer>(number);
            } catch (Exception e) {
                box = new GenericBox<>(line);
            }
            System.out.println(box);

        }
    }
}
