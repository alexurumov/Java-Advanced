import java.util.*;
import java.util.stream.Collectors;

public class poisonousPlants {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

//        Deque<Integer> plants = new ArrayDeque<>();
//
//        Arrays.stream(in.nextLine().split("\\s+"))
//                .mapToInt(Integer::parseInt)
//                .forEach(e -> plants.push(e));
//
//        int days = 0;

        List<Integer> plants = Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> daysPlantsDie = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            daysPlantsDie.add(0);
        }

        Deque<Integer> plantStack = new ArrayDeque<>();

        plantStack.push(plants.get(0));

        for (int i = 1; i < n; i++) {

            int lastDay = 0;

            while (!plantStack.isEmpty() && plantStack.peek() >= plants.get(i)) {

                lastDay = daysPlantsDie.get(plants.indexOf(plantStack.pop()));

            }

            if (!plantStack.isEmpty()) {
                daysPlantsDie.set(i, lastDay + 1);
            }

            plantStack.push(plants.get(i));
        }

        daysPlantsDie.stream().max(Integer::compareTo).ifPresent(e -> System.out.println(e));

//        while (true) {
//
//            boolean deaths = false;
//
//            List<Integer> alivePlants = new ArrayList<>();
//
//            while (!plants.isEmpty()) {
//
//                int current = plants.pop();
//
//                if (!plants.isEmpty() && plants.peek() < current) {
//                    deaths = true;
//                } else {
//                    alivePlants.add(0, current);
//                }
//            }
//
//            if (deaths) {
//                days++;
//                for (int plant:alivePlants) {
//                    plants.push(plant);
//                }
//            } else {
//                System.out.println(days);
//                break;
//            }
//        }



    }
}
