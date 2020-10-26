package google;

import java.util.ArrayList;

public class Person {

    private Company company;
    private ArrayList<Pokemon> pokemons;
    private ArrayList<Parent> parents;
    private ArrayList<Child> children;
    private Car car;

    public Person() {
        this.company = null;
        this.pokemons = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.car = null;
    }

    public Company getCompany() {
        return company;
    }

    public Car getCar() {
        return car;
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public ArrayList<Parent> getParents() {
        return parents;
    }

    public ArrayList<Child> getChildren() {
        return children;
    }

    public void setCompany(String[] input) {
        String companyName = input[2];
        String department = input[3];
        double salary = Double.parseDouble(input[4]);
        this.company = new Company(companyName, department, salary);
    }

    public void setCar(String[] input) {
        String carModel = input[2];
        int carSpeed = Integer.parseInt(input[3]);
        this.car = new Car(carModel, carSpeed);
    }

    public void addPokemon(String[] input) {
        String pokName = input[2];
        String pokType = input[3];
        Pokemon pokemon = new Pokemon(pokName, pokType);
        this.getPokemons().add(pokemon);
    }

    public void addParents(String[] input) {
        String parentName = input[2];
        String parentBirghday = input[3];
        Parent parent = new Parent(parentName, parentBirghday);
        this.getParents().add(parent);
    }

    public void addChildren(String[] input) {
        String childName = input[2];
        String childBirghday = input[3];
        Child child = new Child(childName, childBirghday);
        this.getChildren().add(child);
    }
}
