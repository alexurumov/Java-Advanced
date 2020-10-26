import java.util.Scanner;

public class findTheRealQueen {

    private static int SIZE = 8;
    private static char QUEEN_SYMBOL = 'q';

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char [][] chessBoard = new char[SIZE][SIZE];

        for (int row = 0; row < SIZE; row++) {
            String[] arr = in.nextLine().split(" ");

            for (int col = 0; col < SIZE; col++) {
                chessBoard[row][col] = arr[col].charAt(0);
            }
        }

        for (int i = 0; i < SIZE; i++) {

            for (int j = 0; j < SIZE; j++) {

                if (chessBoard[i][j] == QUEEN_SYMBOL) {
                    if (isValidQueen(chessBoard, i, j)) {
                        System.out.println(i + " " + j);
                        return;
                    }
                }
            }
        }


    }

    private static boolean isValidQueen(char[][] board, int row, int col) {
        return isQueenColumnValid(board, col) &&
                isQueenRowValid(board, row) &&
                isQueenFirstDiagonalValid(board, row, col) &&
                isQueenSecondDiagonalValid(board, row, col);
    }

    private static boolean isQueenSecondDiagonalValid(char[][] board, int row, int col) {
        int queenCount = 0;

        for (int i = 1; row - i >= 0 && col + i < SIZE; i++) {
            if (board[row - i][col + i] == QUEEN_SYMBOL) {
                queenCount++;
            }
        }

        for (int i = 1; row + i < SIZE && col - i >= 0; i++) {
            if (board[row + i][col - i] == QUEEN_SYMBOL) {
                queenCount++;
            }
        }

        return queenCount == 0;
    }

    private static boolean isQueenFirstDiagonalValid(char[][] board, int row, int col) {

        int queenCount = 0;

        for (int i = 1; row - i >= 0 && col - i >= 0; i++) {
            if (board[row - i][col - i] == QUEEN_SYMBOL) {
                queenCount++;
            }
        }

        for (int i = 1; row + i < SIZE && col + i < SIZE; i++) {
            if (board[row + i][col + i] == QUEEN_SYMBOL) {
                queenCount++;
            }
        }

        return queenCount == 0;
    }

    private static boolean isQueenRowValid(char[][] board, int row) {

        int queenCount = 0;

        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == QUEEN_SYMBOL) {
                queenCount++;
            }
        }

        return queenCount == 1;
    }

    private static boolean isQueenColumnValid(char[][] board, int col) {

        int queenCount = 0;

        for (int i = 0; i < SIZE; i++) {
            if (board[i][col] == QUEEN_SYMBOL) {
                queenCount++;
            }
        }

        return queenCount == 1;
    }
}
