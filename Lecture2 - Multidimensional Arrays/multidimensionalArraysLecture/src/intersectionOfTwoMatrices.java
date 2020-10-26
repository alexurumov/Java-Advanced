import java.util.Arrays;
import java.util.Scanner;

public class intersectionOfTwoMatrices {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int m = Integer.parseInt(in.nextLine());
        int n = Integer.parseInt(in.nextLine());

        char[][] firstMatrix = new char[m][n];

        char[][] secondMatrix = new char[m][n];

        for (int row = 0; row < m; row++) {
            String[] arr = in.nextLine().split(" ");

            for (int col = 0; col < n; col++) {
                firstMatrix[row][col] = arr[col].charAt(0);
            }
        }

        for (int row = 0; row < m; row++) {
            String[] arr = in.nextLine().split(" ");

            for (int col = 0; col < n; col++) {
                secondMatrix[row][col] = arr[col].charAt(0);
            }
        }

        for (int row = 0; row < firstMatrix.length; row++) {

            for (int col = 0; col < firstMatrix[row].length; col++) {

                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    System.out.print("* ");
                } else {
                    System.out.print(firstMatrix[row][col] + " ");
                }
            }

            System.out.println();
        }
    }
}
