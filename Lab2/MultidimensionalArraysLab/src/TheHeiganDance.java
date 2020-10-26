import java.util.Scanner;

public class TheHeiganDance {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // READ INPUT

        int [][] field = new int[15][15];

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                field[i][j] = 0;
            }
        }
        int playerRow = 7;
        int playerCol = 7;

        double heiganBlood = 3000000d;
        int playerBlood = 18500;

        double damageToHagen = Double.parseDouble(in.nextLine());

        String lastSpell = "";
        String lastOutcome = "";

        // PLAY THE GAME UNTIL SOMEONE DIES

        while (heiganBlood > 0 && playerBlood > 0) {

            if (lastSpell.equals("Cloud") && lastOutcome.equals("Hit")) {
                playerBlood -= 3500;
            }

            heiganBlood -= damageToHagen;
            if (heiganBlood <= 0){
                break;
            }

            if (playerBlood < 0) {
                break;
            }

            String[] round = in.nextLine().split(" ");
            String spell = round[0];

            int spellRow = Integer.parseInt(round[1]);
            int spellCol = Integer.parseInt(round[2]);

            field = matrixSpell(field, spellRow, spellCol, 1);

            if (field[playerRow][playerCol] == 1) {
                String outcome = escapedTheHit(field, playerRow, playerCol);
                lastOutcome = outcome;
                switch (outcome) {
                    case "Hit":
                        if (spell.equals("Cloud")) {
                            playerBlood -= 3500;
                        } else {
                            playerBlood -= 6000;
                        }
                        break;
                    case "Up":
                        playerRow--;
                        break;
                    case "Right":
                        playerCol++;
                        break;
                    case "Down":
                        playerRow++;
                        break;
                    case "Left":
                        playerCol--;
                        break;
                    default:
                        break;
                }
            }

            lastSpell = spell;

            field = matrixSpell(field, spellRow, spellCol, 0);

            if (playerBlood <= 0) {
                break;
            }
        }

        // PRINT

        if (lastSpell.equals("Cloud")) {
            lastSpell = "Plague Cloud";
        }

        System.out.print("Heigan: ");

        if (heiganBlood <= 0) {
            System.out.println("Defeated!");
        } else {
            System.out.printf("%.2f\n", heiganBlood);
        }

        System.out.print("Player: ");

        if (playerBlood <= 0) {
            System.out.printf("Killed by %s\n", lastSpell);
        } else {
            System.out.println(playerBlood);
        }

        System.out.println("Final position: " + playerRow + ", " + playerCol);

    }

    private static int[][] matrixSpell(int[][] field, int spellRow, int spellCol, int spell) {
        for (int i = Math.max(0, spellRow - 1); i < Math.min(field.length, spellRow + 2); i++) {
            for (int j = Math.max(0, spellCol - 1); j < Math.min(field[i].length, spellCol + 2); j++) {
                field[i][j] = spell;
            }
        }
        return field;
    }

    private static String escapedTheHit(int[][] field, int playerRow, int playerCol) {

        if (playerRow > 0) {
            if (field[playerRow - 1][playerCol] != 1) {
                return "Up";
            }
        }

        if (playerCol < 14) {
            if (field[playerRow][playerCol + 1] != 1) {
                return "Right";
            }
        }

        if (playerRow < 14) {
            if (field[playerRow + 1][playerCol] != 1) {
                return "Down";
            }
        }

        if (playerCol > 0) {
            if (field[playerRow][playerCol - 1] != 1) {
                return "Left";
            }
        }

        return "Hit";
    }
}
