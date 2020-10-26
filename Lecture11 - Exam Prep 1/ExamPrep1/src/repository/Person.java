package repository;

public class Person {

    private String name;
    private int age;
    private String birthdate;

    public Person(String name, int age, String birthdate) {
        this.name = name;
        this.age = age;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return String.format("Name: %s%nAge: %d%nBirthday: %s%n", this.name, this.age, this.birthdate);
    }
}
