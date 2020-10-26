package carinfo;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        IntStream
                .rangeClosed(1, n).boxed()
                .map(num -> in.nextLine().split(" "))
                .map(data -> {
                    Car car = new Car();
                    car.setMake(data[0]);
                    car.setModel(data[1]);
                    car.setHorsePower(Integer.parseInt(data[2]));
                    return car;
                })
                .forEach(car -> System.out.println(car.getInfo()));


//        for (int i = 0; i < n; i++) {
//            Car car = new Car();
//
//            String[] split = in.nextLine().split(" ");
//            car.setMake(split[0]);
//            car.setModel(split[1]);
//            car.setHorsePower(Integer.parseInt(split[2]));
//
//            System.out.println(car.getInfo());
//        }
    }

}
