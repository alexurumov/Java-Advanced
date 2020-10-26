package pokemontrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private static final int DEFAULT_VALUE = 0;

    private String name;
    private int badges;
    private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.badges = DEFAULT_VALUE;
        this.pokemons = new ArrayList<>();
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public String getName() {
        return name;
    }

    public boolean hasElement(String element) {

        for (Pokemon pokemon : pokemons) {
            if (pokemon.getElement().equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public int getBadges() {
        return badges;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public void clearDead() {
        List<Pokemon> negative = new ArrayList<>();
        for (Pokemon pokemon : pokemons) {
            if (pokemon.getHealth() <= 0) {
                negative.add(pokemon);
            }
        }

        this.getPokemons().removeAll(negative);
    }

    public void addBadges() {
        this.badges++;
    }
}
