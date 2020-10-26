package scale;

public class Main {

    public static void main(String[] args) {

        Scale<Integer> integerScale = new Scale<>(5, 7);

        System.out.println(integerScale.getHeavier());

        Scale<String> stringScale = new Scale<>("a", "c");

        System.out.println(stringScale.getHeavier());
    }
}
