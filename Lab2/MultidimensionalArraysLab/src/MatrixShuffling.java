import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] input = in.nextLine().split(" ");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = in.nextLine().split("\\s+");
        }

        String line = in.nextLine();

        while (!line.equals("END")) {

            String[] tokens = line.split("\\s+");

            if (inputIsValid(tokens, rows, cols)) {

                swapCells(matrix, tokens);

                printMatrix(matrix);

            } else {
                System.out.println("Invalid input!");
            }

            line = in.nextLine();
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void swapCells(String[][] matrix, String[] tokens) {
        int toSwapRow = Integer.parseInt(tokens[1]);
        int toSwapCol = Integer.parseInt(tokens[2]);
        int swapWithRow = Integer.parseInt(tokens[3]);
        int swapWithCol = Integer.parseInt(tokens[4]);

        String toSwap = matrix[toSwapRow][toSwapCol];

        String swapWith = matrix[swapWithRow][swapWithCol];

        matrix[toSwapRow][toSwapCol] = swapWith;

        matrix[swapWithRow][swapWithCol] = toSwap;
    }


    private static boolean inputIsValid(String[] tokens, int rows, int cols) {

        if (tokens.length != 5) {
            return false;
        }

        if (!tokens[0].equals("swap")) {
            return false;
        }

        if (Integer.parseInt(tokens[1]) < 0 || Integer.parseInt(tokens[1]) >= rows ||
                Integer.parseInt(tokens[3]) < 0 || Integer.parseInt(tokens[3]) >= rows) {
            return false;
        }

        if (Integer.parseInt(tokens[2]) < 0 || Integer.parseInt(tokens[4]) >= cols ||
                Integer.parseInt(tokens[2]) < 0 || Integer.parseInt(tokens[4]) >= cols) {
            return false;
        }

        return true;
    }

}
