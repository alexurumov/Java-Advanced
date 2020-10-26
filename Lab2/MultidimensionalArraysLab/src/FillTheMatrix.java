import java.util.Scanner;

public class FillTheMatrix {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] input = in.nextLine().split(", ");

        int n = Integer.parseInt(input[0]);

        int[][] matrix = new int[n][n];

        String methodType = input[1];

        if (methodType.equals("A")) {
            matrix = matrixA(n);
        } else {
            matrix = matrixB(n);
        }

        printMatrix(matrix);


    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] matrixB(int n) {
        int[][] matrix = new int[n][n];
        int number = 0;

        for (int col = 0; col < n; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < n; row++) {
                    number++;
                    matrix[row][col] = number;
                }
            } else {
                    for (int row = n - 1; row >= 0; row--) {
                        number++;
                        matrix[row][col] = number;
            }

            }
        }
        return matrix;
    }

    private static int[][] matrixA(int n) {

        int[][] matrix = new int[n][n];
        matrix[0][0] = 1;

        int number = 0;

        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                number++;
                matrix[row][col] = number;
            }
        }

        return matrix;
    }
}
