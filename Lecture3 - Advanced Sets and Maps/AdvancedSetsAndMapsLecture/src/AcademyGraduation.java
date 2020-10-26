import java.util.*;
import java.util.stream.Collectors;

public class AcademyGraduation {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        TreeMap<String, double[]> graduation = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String student = in.nextLine();

            double[] grades = Arrays.stream(in.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

            graduation.put(student, grades);

        }

        graduation.entrySet().stream().forEach(es -> {
            double average = 0;
            for (double grade : es.getValue()) {
                average += grade;
            }
            average /= es.getValue().length;

            System.out.println(es.getKey() + " is graduated with " + average);
        });
    }
}
