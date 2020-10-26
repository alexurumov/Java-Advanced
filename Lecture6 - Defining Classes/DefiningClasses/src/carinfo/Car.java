package carinfo;

public class Car {

    private String make;
    private String model;
    private int horsePower;

    public String gerMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getInfo() {
        return String.format("The car is: %s %s - %d HP. ", this.gerMake(), this.getModel(), this.getHorsePower());
    }
}
