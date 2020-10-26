import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String line = in.nextLine();

        HashSet<String> parkingLot = new HashSet<>();

        while (!line.equals("END")) {

            String[] input = line.split(", ");

            String cmd = input[0];
            String carNum = input[1];

            if (cmd.equals("IN")) {
                parkingLot.add(carNum);
            } else {
                parkingLot.remove(carNum);
            }

            line = in.nextLine();
        }

        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String car : parkingLot) {
                System.out.println(car);
            }
        }

    }
}
