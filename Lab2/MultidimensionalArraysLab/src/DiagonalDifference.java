import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] input = in.nextLine().split(", ");

        int n = Integer.parseInt(input[0]);

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i] = Arrays.stream(in.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int difference = Math.abs(calcFirstDiagonal(matrix) - calcSecondDiagonal(matrix));

        System.out.println(difference);

    }

    private static int calcSecondDiagonal(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[matrix.length - 1 - i][i];
        }

        return sum;
    }

    private static int calcFirstDiagonal(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        return sum;
    }
}
