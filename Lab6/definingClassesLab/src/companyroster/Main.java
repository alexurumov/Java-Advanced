package companyroster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        Map<String, Department> departments = new HashMap<>();

        while (n-- > 0) {

            String[] split = in.nextLine().split(" ");

            String departmentName = split[3];

            Employee employee = null;

            switch (split.length) {
                case 4:
                    employee = new Employee(split[0], Double.parseDouble(split[1]));
                    break;
                case 5:
                    if (split[4].contains("@")) {
                        employee = new Employee(split[0], Double.parseDouble(split[1]), split[4]);
                    } else {
                        employee = new Employee(split[0], Double.parseDouble(split[1]), Integer.parseInt(split[4]));
                    }
                    break;
                default:
                    employee = new Employee(split[0], Double.parseDouble(split[1]), split[4], Integer.parseInt(split[5]));
                    break;
            }

            if(!departments.containsKey(departmentName)) {
                departments.put(departmentName, new Department(departmentName));
            }

            departments.get(departmentName).getEmployees().add(employee);

        }

        departments.entrySet().stream()
                .sorted((d1, d2) -> Double.compare(d2.getValue().getAverageSalary(), d1.getValue().getAverageSalary()))
                .findFirst()
                .stream()
                .forEach(e -> {
                    System.out.printf("Highest Average Salary: %s%n", e.getKey());
                    e.getValue().getEmployees().stream()
                            .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                            .forEach(employee -> System.out.println(employee.getInfo()));
                });
    }
}
