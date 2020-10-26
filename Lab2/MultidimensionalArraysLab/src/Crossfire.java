import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Crossfire {

    private static int linesWithZeroes = 0;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] input = in.nextLine().split(" ");

        // FILL MATRIX

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];
        int number = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                number++;
                matrix[i][j] = number;
            }
        }

        // CROSSFIRE

        String line = in.nextLine();

        while (!line.equals("Nuke it from orbit")) {

            String[] crossfire = line.split(" ");

            int cfrow = Integer.parseInt(crossfire[0]);
            int cfcol = Integer.parseInt(crossfire[1]);
            int cfrange = Integer.parseInt(crossfire[2]);

            int[][] newMatrix = cfblast(matrix, cfrow, cfcol, cfrange);

            matrix = newMatrix.clone();

            line = in.nextLine();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != 0) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }

    }

    private static int[][] cfblast(int[][] matrix, int cfrow, int cfcol, int cfrange) {

        // HORIZONTAL BLAST

        if (cfrow >= 0 && cfrow < matrix.length) {
            for (int col = Math.max(0, (cfcol - cfrange)); col < Math.min(matrix[0].length, (cfcol + cfrange + 1)); col++) {
                matrix[cfrow][col] = 0;
            }
        }
        // VERTICAL BLAST

        if (cfcol >= 0 && cfcol < matrix[0].length) {
            for (int row = Math.max(0, (cfrow - cfrange)); row < Math.min(matrix.length, (cfrow + cfrange + 1)); row++) {
                matrix[row][cfcol] = 0;
            }
        }

        List< List<Integer> > rows = new ArrayList<>();

        for (int i = matrix.length - 1; i >= 0; i--) {

            int zeroesCount = 0;
            List<Integer> currentLine = new ArrayList<>();

            for (int j = matrix[i].length - 1; j >= 0 ; j--) {
                if (matrix[i][j] != 0) {
                    currentLine.add(0, matrix[i][j]);
                } else {
                    currentLine.add(matrix[i][j]);
                    zeroesCount++;
                }
            }
            if (zeroesCount == matrix[i].length) {
                rows.add(currentLine);
            } else {
                rows.add(0, currentLine);
            }

        }

        for (int i = 0; i < matrix.length; i++) {

            matrix[i] = rows.get(i).stream().mapToInt(Integer::intValue).toArray();
        }

        return matrix;
    }
}
