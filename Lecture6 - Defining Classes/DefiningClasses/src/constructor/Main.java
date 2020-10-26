package constructor;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        IntStream
                .rangeClosed(1, n)
                .boxed()
                .map(num -> in.nextLine().split(" "))
                .map(data -> {
                    Car car;
                    if (data.length == 3) {
                        car = new Car(data[0], data[1], Integer.parseInt(data[2]));
                    } else {
                        car = new Car(data[0]);
                    }
                    return car;
                })
                .forEach(car -> System.out.println(car.getInfo()));

//        for (int i = 0; i < n; i++) {
//            String[] carParts = in.nextLine().split(" ");
//
//            Car car;
//
//            if (carParts.length == 3) {
//                car = new Car(carParts[0], carParts[1], Integer.parseInt(carParts[2]));
//            } else {
//                car = new Car(carParts[0]);
//            }
//
//            System.out.println(car.getInfo());
//        }
    }
}
