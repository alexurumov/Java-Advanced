package carsalesman;

public class Engine {
    private static final String MISSING_VALUE = "n/a";

    private String model;
    private int power;
    private String displacement;
    private String efficiency;

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
        this.displacement = MISSING_VALUE;
        this.efficiency = MISSING_VALUE;
    }

    public Engine(String model, int power, int displacement) {
        this(model, power);
        this.displacement = String.valueOf(displacement);
    }

    public Engine(String model, int power, String efficiency) {
        this(model, power);
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, int displacement, String efficiency) {
        this(model, power, displacement);
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return String.format("%s:%nPower: %d%nDisplacement: %s%nEfficiency: %s%n", this.model, this.power, this.displacement, this.efficiency);
    }
}
