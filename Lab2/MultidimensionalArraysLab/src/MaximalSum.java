import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] input = in.nextLine().split(" ");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(in.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int max = Integer.MIN_VALUE;
        int x = -1;
        int y = -1;

        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                int current = sumOf3x3(matrix, i, j);
                if (current > max) {
                    max = current;
                    x = i;
                    y = j;
                }
            }
        }

        System.out.printf("Sum = %d\n%d %d %d\n%d %d %d\n%d %d %d", max,
                matrix[x][y], matrix[x][y + 1], matrix[x][y + 2],
                matrix[x + 1][y], matrix[x + 1][y + 1], matrix[x + 1][y + 2],
                matrix[x + 2][y], matrix[x + 2][y + 1], matrix[x + 2][y + 2]);


    }

    private static int sumOf3x3(int[][] matrix, int i, int j) {
        return matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2] +
                matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2] +
                matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];
    }
}
