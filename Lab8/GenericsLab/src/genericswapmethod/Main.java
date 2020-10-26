package genericswapmethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<GenericBox<String>> stringBoxList = new ArrayList<>();
//        List<GenericBox<Integer>> intBoxList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {

            String line = scanner.nextLine();

            GenericBox box = null;

//            try {
//                int number = Integer.parseInt(line);
//                box = new GenericBox<Integer>(number);
//                intBoxList.add(box);
//            } catch (Exception e) {
                box = new GenericBox<>(line);
                stringBoxList.add(box);
//            }

        }
        String[] split = scanner.nextLine().split(" ");

        int firstIndex = Integer.parseInt(split[0]);
        int secondIndex = Integer.parseInt(split[1]);

        if (!stringBoxList.isEmpty()) {
            swap(stringBoxList, firstIndex, secondIndex);
        }

//        if (!intBoxList.isEmpty()) {
//            swap(intBoxList, firstIndex, secondIndex);
//        }

        stringBoxList.forEach(System.out::println);
//        intBoxList.forEach(System.out::println);
    }

    private static <T> void swap(List<T> list, int firstIndex, int secondIndex) {
        T first = list.get(firstIndex);
        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex, first);
    }
}
