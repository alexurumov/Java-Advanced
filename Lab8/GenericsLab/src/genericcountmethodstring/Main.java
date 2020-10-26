package genericcountmethodstring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

//        List<GenericBox<String>> list = new ArrayList<>();

        List<GenericBox<Double>> list = new ArrayList<>();

        while (n-- > 0) {
            String line = scanner.nextLine();
            double boxEl = Double.parseDouble(line);
            GenericBox<Double> box = new GenericBox<>(boxEl);
            list.add(box);
        }

//        String element = scanner.nextLine();
        double element = Double.parseDouble(scanner.nextLine());

        int count = getBiggerCount(list, element);
        System.out.println(count);
    }

//    private static int getBiggerCount(List<GenericBox<String>> list, String element) {
//
//        int bigger = 0;
//
//        for (GenericBox<String> box : list) {
//            if (element.compareTo(box.getElement()) < 0) {
//                bigger++;
//            }
//        }
//
//        return bigger;
//    }

    private static int getBiggerCount(List<GenericBox<Double>> list, double element) {

        int bigger = 0;


        for (GenericBox<Double> doubleGenericBox : list) {
            if (Double.compare(element, doubleGenericBox.getElement()) < 0) {
                bigger++;
            }
        }

        return bigger;
    }

}
