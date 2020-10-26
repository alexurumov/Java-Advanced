package familytree;

import java.util.ArrayList;

public class PrintPerson extends Person {
    private ArrayList<Person> parents;
    private ArrayList<Person> children;

    public PrintPerson() {
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public ArrayList<Person> getParents() {
        return parents;
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public String parentsInfo() {
        StringBuilder result = new StringBuilder();

        for (Person parent : parents) {
            result.append(parent.getInfo()).append("\n");
        }

        return result.toString();
    }

    public String childrenInfo() {
        StringBuilder result = new StringBuilder();

        for (Person child : children) {
            result.append(child.getInfo()).append("\n");
        }

        return result.toString();
    }

    public String getInfo() {
        return String.format("%s %s %s %n" +
                        "Parents: %n" +
                        "%s" +
                        "Children: %n" +
                        "%s"
                , this.getFirstName(), this.getLastName(), this.getBirthday(), parentsInfo(), childrenInfo());
    }
}
