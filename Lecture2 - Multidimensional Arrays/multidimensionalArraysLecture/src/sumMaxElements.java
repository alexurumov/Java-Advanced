import java.util.Arrays;
import java.util.Scanner;

public class sumMaxElements {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] dimensions = Arrays.stream(in.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            int[] colData = Arrays.stream(in.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = colData;
        }

        int sum = 0;

        for (int i = 0; i < rows; i++) {
            sum += Arrays.stream(matrix[i]).sum();
        }

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);

    }
}
