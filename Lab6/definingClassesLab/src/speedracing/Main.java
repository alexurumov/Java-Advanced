package speedracing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] split = in.nextLine().split(" ");

            String model = split[0];
            double fuel = Double.parseDouble(split[1]);
            double consumption = Double.parseDouble(split[2]);

            Car car = new Car(model,fuel, consumption);

            cars.put(model, car);
        }

        String line = in.nextLine();

        while (!line.equals("End")) {

            String[] split = line.split(" ");

            String model = split[1];
            int distance = Integer.parseInt(split[2]);

            if(!cars.get(model).Drive(distance)) {
                System.out.println("Insufficient fuel for the drive");
            }

            line = in.nextLine();
        }

        cars.entrySet().stream().forEach(es -> System.out.println(es.getValue().getInfo()));
    }
}
