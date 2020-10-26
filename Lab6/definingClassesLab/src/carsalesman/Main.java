package carsalesman;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int enginesCount = Integer.parseInt(scanner.nextLine());

        Map<String, Engine> engines = new HashMap<>();
        List<Car> cars = new ArrayList<>();

        while (enginesCount-- > 0) {

            String[] split = scanner.nextLine().split(" ");
            String engineModel = split[0];
            int enginePower = Integer.parseInt(split[1]);

            Engine engine = null;
            switch (split.length) {
                case 2:
                    engine = new Engine(engineModel, enginePower);
                    break;
                case 3:
                    if (Character.isDigit(split[2].charAt(split[2].length() - 1))) {
                        int engineDisplacement = Integer.parseInt(split[2]);
                        engine = new Engine(engineModel, enginePower, engineDisplacement);
                    } else {
                        String engineEfficiency = split[2];
                        engine = new Engine(engineModel, enginePower, engineEfficiency);
                    }
                    break;
                default:
                    int engineDisplacement = Integer.parseInt(split[2]);
                    String engineEfficiency = split[3];
                    engine = new Engine(engineModel, enginePower, engineDisplacement, engineEfficiency);
                    break;
            }

            engines.put(engine.getModel(), engine);
        }

        int carsCount = Integer.parseInt(scanner.nextLine());

        while (carsCount-- > 0) {

            String[] split = scanner.nextLine().split(" ");
            String carModel = split[0];
            Engine carEngine = engines.get(split[1]);

            Car car = null;
            switch (split.length) {
                case 2:
                    car = new Car(carModel, carEngine);
                    break;
                case 3:
                    if (Character.isDigit(split[2].charAt(split[2].length() - 1))) {
                        int carWeight = Integer.parseInt(split[2]);
                        car = new Car(carModel, carEngine, carWeight);
                    } else {
                        String carColour = split[2];
                        car = new Car(carModel, carEngine, carColour);
                    }
                    break;
                default:
                    int carWeight = Integer.parseInt(split[2]);
                    String carColour = split[3];
                    car = new Car(carModel, carEngine, carWeight, carColour);
                    break;
            }

            cars.add(car);

        }

        cars.stream().forEach(System.out::println);

    }
}
