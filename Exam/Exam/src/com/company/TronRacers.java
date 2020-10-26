package com.company;

import java.util.Scanner;

public class TronRacers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        char[][] matrix = new char[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i] = in.nextLine().toCharArray();
        }

        int[] firstStart = findCoordinates(matrix, 'f');
        int[] secondStart = findCoordinates(matrix, 's');

        while (true) {
            String[] movements = in.nextLine().split(" ");
            String firstMovement = movements[0];

            matrix = playerMovement(matrix, 'f', firstStart, firstMovement);

            if (isDead(matrix)) {
                printMatrix(matrix);
                break;
            }

            String secondMovement = movements[1];

            matrix = playerMovement(matrix, 's', secondStart, secondMovement);

            if (isDead(matrix)) {
                printMatrix(matrix);
                break;
            }

        }

    }

    private static boolean isDead(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 'x') {
                    return true;
                }
            }
        }
        return false;
    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static char[][] playerMovement(char[][] matrix, char player, int[] startCoordinates, String direction) {

        int startRow = startCoordinates[0];
        int startCol = startCoordinates[1];

        int nextRow = -1;
        int nextCol = -1;

        switch (direction) {
            case "down":
                nextCol = startCol;
                if (startRow == matrix.length - 1) {
                    nextRow = 0;
                } else {
                    nextRow = startRow + 1;
                }

                if (matrix[nextRow][nextCol] == '*') {
                    matrix[nextRow][nextCol] = player;
                } else {
                    matrix[nextRow][nextCol] = 'x';
                }
                break;
            case "up":
                nextCol = startCol;
                if (startRow == 0) {
                    nextRow = matrix.length - 1;
                } else {
                    nextRow = startRow - 1;
                }

                if (matrix[nextRow][nextCol] == '*') {
                    matrix[nextRow][nextCol] = player;
                } else {
                    matrix[nextRow][nextCol] = 'x';
                }
                break;
            case "right":
                nextRow = startRow;
                if (startCol == matrix.length - 1) {
                    nextCol = 0;
                } else {
                    nextCol = startCol + 1;
                }

                if (matrix[nextRow][nextCol] == '*') {
                    matrix[nextRow][nextCol] = player;
                } else {
                    matrix[nextRow][nextCol] = 'x';
                }
                break;
            case "left":
                nextRow = startRow;
                if (startCol == 0) {
                    nextCol = matrix.length - 1;
                } else {
                    nextCol = startCol - 1;
                }

                if (matrix[nextRow][nextCol] == '*') {
                    matrix[nextRow][nextCol] = player;
                } else {
                    matrix[nextRow][nextCol] = 'x';
                }
                break;
        }

        startCoordinates[0] = nextRow;
        startCoordinates[1] = nextCol;

        return matrix;
    }

    private static int[] findCoordinates(char[][] matrix, char player) {
        int[] coordinates = new int[2];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == player) {
                    coordinates[0] = i;
                    coordinates[1] = j;
                    break;
                }
            }
        }

        return coordinates;
    }
}
