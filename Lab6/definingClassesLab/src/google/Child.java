package google;

public class Child {

    private String name;
    private String birthday;

    public Child(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getInfo() {
        return String.format("%s %s", this.name, this.birthday);
    }
}
