import java.util.Arrays;
import java.util.Scanner;

public class positionsOf {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] dimensions = Arrays.stream(in.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int matrixRows = dimensions[0];
        int matrixCols = dimensions[1];

        int[][] matrix = new int[matrixRows][];

        boolean isFound = false;

        for (int i = 0; i < matrixRows; i++) {
            int[] arr = Arrays.stream(in.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = arr;
        }

        int numberToFind = Integer.parseInt(in.nextLine());

        for (int row = 0; row < matrixRows; row++) {

            for (int col = 0; col < matrixCols; col++) {

                if (matrix[row][col] == numberToFind) {
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }
        }

        if (!isFound) {
            System.out.println("not found");
        }
    }
}
