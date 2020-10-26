package rawdata;

import java.util.List;

public class Car {
    private String model;
    private int power;
    private String cargoType;
    private List<Double> tyres;

    public Car(String model, int power, String cargoType, List<Double> tyres) {
        this.model = model;
        this.power = power;
        this.cargoType = cargoType;
        this.tyres = tyres;
    }
}
