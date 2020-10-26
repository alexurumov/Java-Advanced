import java.util.Arrays;
import java.util.Scanner;

public class ReverseMatrixDiagonals {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] dimentions = in.nextLine().split(" ");

        int rows = Integer.parseInt(dimentions[0]);
        int cols = Integer.parseInt(dimentions[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int startRow = rows - 1;
        int startCol = cols - 1;

        while (startCol >= 0) {

            int row = startRow;
            int col = startCol;

            while (row >= 0 && col >= 0 && row < rows && col < cols) {

                System.out.print(matrix[row][col] + " ");
                row--;
                col++;
            }

            System.out.println();

            startCol--;
        }

        startCol++;

        startRow--;

        while (startRow >= 0) {

            int row = startRow;
            int col = startCol;

            while (row >= 0 && col >= 0 && row < rows && col < cols) {

                System.out.print(matrix[row][col] + " ");
                row--;
                col++;
            }

            System.out.println();

            startRow--;

        }


    }
}
