package familytree;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable {
    private static final String DEFAULT_VALUE = "";

    private String firstName;
    private String lastName;
    private String birthday;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = DEFAULT_VALUE;
    }

    public Person(String birthday) {
        this.birthday = birthday;
        this.firstName = DEFAULT_VALUE;
        this.lastName = DEFAULT_VALUE;
    }

    public Person(String firstName, String lastName, String birthday) {
        this(firstName, lastName);
        this.birthday = birthday;
    }

    public Person() {
        this.firstName = DEFAULT_VALUE;
        this.lastName = DEFAULT_VALUE;
        this.birthday = DEFAULT_VALUE;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Person getExistingByBirthday(String birthday) {
        if (this.birthday.equals(birthday)) {
            return this;
        }

        return null;
    }

    public Person getExistingByNames(String firstName, String lastName) {
        if (this.firstName.equals(firstName) && this.lastName.equals(lastName)) {
            return this;
        }

        return null;
    }

    public void setPeopleDetails(Person currentPerson, String[] split, List<Person> people) {
        switch (split.length) {

            case 1:
                String birthday = split[0];
                currentPerson = new Person(birthday);
                people.add(currentPerson);
                break;
            case 2:
                String firstName = split[0];
                String lastName = split[1];
                currentPerson = new Person(firstName, lastName);
                people.add(currentPerson);
                break;
            default:
                String firstNameFull = split[0];
                String lastNameFull = split[1];
                String birthdayFull = split[2];

                boolean isFound = false;

                for (Person person : people) {
                    if (person.getExistingByBirthday(birthdayFull) != null) {
                        person.getExistingByBirthday(birthdayFull).setFirstName(firstNameFull);
                        person.getExistingByBirthday(birthdayFull).setLastName(lastNameFull);
                        isFound = true;
                        break;
                    }
                }
                if (!isFound) {
                    for (Person person : people) {
                        if (person.getExistingByNames(firstNameFull, lastNameFull) != null) {
                            person.getExistingByNames(firstNameFull, lastNameFull).setBirthday(birthdayFull);
                            isFound = true;
                            break;
                        }
                    }
                }

                if (!isFound) {
                    currentPerson = new Person(firstNameFull, lastNameFull, birthdayFull);
                    people.add(currentPerson);
                }

                break;

        }
    }

    public String getInfo() {
        return String.format("%s %s %s", this.firstName, this.lastName, this.birthday);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
