import java.util.*;

public class AverageStudentsGrades {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        Map<String, List<Double>> studentRecord = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] line = in.nextLine().split(" ");
            String student = line[0];
            double grade = Double.parseDouble(line[1]);

            List<Double> grades = new ArrayList<>();

            studentRecord.putIfAbsent(student, grades);

            grades = studentRecord.get(student);

            grades.add(grade);
            studentRecord.put(student, grades);

        }

        studentRecord.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(es -> {
            double sum = 0d;
            System.out.print(es.getKey() + " -> ");
            for (double grade : es.getValue()) {
                sum += grade;
                System.out.printf("%.2f ", grade);
            }

            System.out.printf("(avg: %.2f)\n", sum / es.getValue().size());

        });

    }
}
