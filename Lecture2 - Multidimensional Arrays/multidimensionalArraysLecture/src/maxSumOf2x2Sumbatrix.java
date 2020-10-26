import java.util.Arrays;
import java.util.Scanner;

public class maxSumOf2x2Sumbatrix {

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

        int max = Integer.MIN_VALUE;
        int maxRow = -1;
        int maxCol = -1;

        for (int i = 0; i < rows - 1; i++) {

            for (int j = 0; j < cols - 1; j++) {

                int current = sumFromTopLeft(matrix, i, j);

                if (current > max) {
                    max = current;
                    maxRow = i;
                    maxCol = j;
                }

            }
        }

        System.out.printf("%d %d\n%d %d\n%d",
                matrix[maxRow][maxCol],
                matrix[maxRow][maxCol + 1],
                matrix[maxRow + 1][maxCol],
                matrix[maxRow + 1][maxCol + 1],
                max);

    }

    private static int sumFromTopLeft (int[][] matrix, int row, int col) {
        return matrix[row][col] +
                matrix[row][col + 1] +
                matrix[row + 1][col] +
                matrix[row + 1][col + 1];
    }
}
