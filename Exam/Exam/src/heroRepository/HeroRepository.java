package heroRepository;

import java.util.ArrayList;
import java.util.List;

public class HeroRepository {
    private List<Hero> data;

    public HeroRepository() {
        this.data = new ArrayList<>();
    }

    public void add(Hero hero) {
        this.data.add(hero);
    }

    public boolean remove(String heroName) {
        if (!this.data.isEmpty()) {
            return false;
        }
        List<Hero> toBeRemoved = new ArrayList<>();
        for (Hero hero : this.data) {
            if (hero.getName().equals(heroName)) {
                toBeRemoved.add(hero);
                break;
            }
        }
        this.data.remove(toBeRemoved.get(0));
        return true;
    }

    public Hero getHeroWithHighestStrength() {
        Hero highestS = null;

        int bestStrenght = -1;
        for (Hero hero : data) {
            if (hero.getItem().getStrength() > bestStrenght) {
                bestStrenght = hero.getItem().getStrength();
                highestS = hero;
            }
        }

        if (bestStrenght == -1) {
            throw new IllegalArgumentException("Method called on empty repository");
        }
        return highestS;
    }

    public Hero getHeroWithHighestAgility() {
        Hero highestAgility = null;

        int bestAgility = -1;
        for (Hero hero : data) {
            if (hero.getItem().getAgility() > bestAgility) {
                bestAgility = hero.getItem().getAgility();
                highestAgility = hero;
            }
        }

        if (bestAgility == -1) {
            throw new IllegalArgumentException("Method called on empty repository");
        }

        return highestAgility;
    }

    public Hero getHeroWithHighestIntelligence() {
        Hero highestIntelligence = null;

        int bestIntelligence = -1;
        for (Hero hero : data) {
            if (hero.getItem().getIntelligence() > bestIntelligence) {
                bestIntelligence = hero.getItem().getIntelligence();
                highestIntelligence = hero;
            }
        }

        if (bestIntelligence == -1) {
            throw new IllegalArgumentException("Method called on empty repository");
        }

        return highestIntelligence;
    }

    public int getCount() {
        return this.data.size();
    }

    @Override
    public String toString() {
        String result = "";
        for (Hero hero : data) {
            result += hero.toString() + "\n";
        }
        return result;
    }
}
