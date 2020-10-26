package pokemontrainer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Map<String, Trainer> trainers = new LinkedHashMap<>();

        while (!input[0].equals("Tournament")) {

            Pokemon pokemon = new Pokemon(input[1], input[2], Integer.parseInt(input[3]));

            if (!trainers.containsKey(input[0])) {
                Trainer trainer = new Trainer(input[0]);
                trainers.put(trainer.getName(), trainer);
            }

            trainers.get(input[0]).getPokemons().add(pokemon);

            input = scanner.nextLine().split(" ");
        }

        String cmd = scanner.nextLine();

        while (!cmd.equals("End")) {

            pokemonAction(trainers, cmd);

            cmd = scanner.nextLine();
        }

//        for (String trainer : trainers.keySet()) {
//            List<Pokemon> filteredPokemons = trainers.get(trainer).getPokemons().stream().filter(pokemon -> pokemon.getHealth() > 0).collect(Collectors.toList());
//            trainers.get(trainer).setPokemons(filteredPokemons);
//        }
//
        trainers.entrySet().stream().sorted((t1, t2) -> Integer.compare(t2.getValue().getBadges(), t1.getValue().getBadges()))
                .forEach(t -> System.out.println(t.getKey() + " " + t.getValue().getBadges() + " " + t.getValue().getPokemons().size()));
    }
    private static void pokemonAction(Map<String, Trainer> trainers, String cmd) {

        for (String trainer : trainers.keySet()) {

            if (trainers.get(trainer).hasElement(cmd)) {

                trainers.get(trainer).addBadges();
            } else {

                trainers.get(trainer).getPokemons().stream().forEach(Pokemon::reduceHealth);
            }

            trainers.get(trainer).clearDead();
        }

    }
}
