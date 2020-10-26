package carsalesman;

public class Car {
    private static final String MISSING_VALUE = "n/a";

    private String model;
    private Engine engine;
    private String weight;
    private String colour;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = MISSING_VALUE;
        this.colour = MISSING_VALUE;
    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine);
        this.weight = String.valueOf(weight);
    }

    public Car(String model, Engine engine, String colour) {
        this(model, engine);
        this.colour = colour;
    }

    public Car(String model, Engine engine, int weight, String colour) {
        this(model, engine, weight);
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return String.format("%s:%n%sWeight: %s%nColor: %s", this.model, this.engine, this.weight, this.colour);
    }
}
