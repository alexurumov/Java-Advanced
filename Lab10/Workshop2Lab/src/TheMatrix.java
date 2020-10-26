import java.util.Arrays;
import java.util.Scanner;

public class TheMatrix {

    public static char[][] matrix;
    public static char toBeReplaced;
    public static char colour;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] dimensions = in.nextLine().split(" ");

        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        matrix = new char[rows][cols];

        for (int r = 0; r < rows; r++) {
            matrix[r] = in.nextLine().replaceAll(" +", "").toCharArray();
        }

        colour = in.nextLine().charAt(0);

        int[] indexes = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int startRow = indexes[0];
        int startCol = indexes[1];

        toBeReplaced = matrix[startRow][startCol];

        paintMatrix(startRow, startCol);

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }

    }

    private static void paintMatrix(int r, int c) {

        if (!isInBounds(r, c) || matrix[r][c] == colour || matrix[r][c] != toBeReplaced) {
            return;
        }

        matrix[r][c] = colour;

        paintMatrix(r + 1, c);
        paintMatrix(r - 1, c);
        paintMatrix(r, c + 1);
        paintMatrix(r, c - 1);

    }

    private static boolean isInBounds(int r, int c) {
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }
}
