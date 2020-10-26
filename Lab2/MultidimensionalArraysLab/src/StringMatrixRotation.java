import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // ROTATION

        String line = in.nextLine();
        String rotation = "";

        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i))) {
                rotation += line.charAt(i);
            }
        }

        int rotationDegrees = Integer.parseInt(rotation);
        int rotationTimes = rotationDegrees / 90 % 4;

        // READ MATRIX

        int cols = -1;

        line = in.nextLine();

        List<String> lines = new ArrayList<>();

        while (!line.equals("END")) {

            lines.add(line);
            if (line.length() > cols) {
                cols = line.length();
            }

            line = in.nextLine();
        }

        int rows = lines.size();

        char[][] matrix = fillMatrix(lines, rows, cols);

        // ROTATE MATRIX

        if (rotationTimes == 0) {
            printMatrix(matrix);
        } else {
            for (int i = 0; i < rotationTimes; i++) {
                char [][] newMatrix = rotateMatrix(matrix);
                matrix = newMatrix;

                if (i == rotationTimes - 1) {
                    printMatrix(newMatrix);
                }
            }
        }

        // PRINT MATRIX



    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i]);
        }
    }

    private static char[][] fillMatrix(List<String> lines, int rows, int cols) {

        char[][] matrix = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            int emptySpaces = cols - lines.get(i).length();

            for (int j = 0; j < cols - emptySpaces; j++) {
                matrix[i][j] = lines.get(i).charAt(j);
            }
            for (int j = cols - emptySpaces; j < cols; j++) {
                matrix[i][j] = ' ';
            }
        }
        return matrix;
    }

    private static char[][] rotateMatrix(char[][] matrix) {

        List<String> lines = new ArrayList<>();

        for (int j = 0; j < matrix[0].length; j++) {
            String currentLine = "";

            for (int i = matrix.length - 1; i >= 0; i--) {
                currentLine += matrix[i][j];
            }
            lines.add(currentLine);
        }

        int newRows = matrix[0].length;
        int newCols = matrix.length;

        char[][] newMatrix = fillMatrix(lines, newRows, newCols);

        return newMatrix;
    }
}
