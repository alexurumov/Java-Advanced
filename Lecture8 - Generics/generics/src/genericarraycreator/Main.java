package genericarraycreator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] arr = ArrayCreator.create(String.class, 10, "empty");
        Integer[] arrInt = ArrayCreator.create(10, 10);

        int count = 0;

        for (String s : arr) {
            System.out.println(count++ + " " + s);
        }

        count = -1;
        for (Integer integer : arrInt) {
            System.out.println(++count + " " + integer);
        }

    }
}
