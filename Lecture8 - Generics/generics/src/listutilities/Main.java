package listutilities;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(10, 12, 30, -4, 5, -1);

        System.out.println(ListUtils.getMax(integers));
        System.out.println(ListUtils.getMin(integers));

    }
}
