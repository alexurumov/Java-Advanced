import java.util.Scanner;

public class MatrixOfPalindromes {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] input = in.nextLine().split(" ");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = palMatrix(rows, cols);

        printMatrix(matrix);

    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static String[][] palMatrix(int rows, int cols) {

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                String cell = "";
                char first = (char) (i + 97);
                char second = (char) (j + i + 97);
                cell = cell + first + second + first;
                matrix[i][j] = cell;
            }
        }

        return matrix;
    }
}
