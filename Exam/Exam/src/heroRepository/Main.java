package heroRepository;

public class Main {

    public static void main(String[] args) {

        HeroRepository heroRepository = new HeroRepository();

        Item item = new Item(23, 35, 48);

        Hero hero = new Hero("Hero Name", 24, item);
        heroRepository.add(hero);
        heroRepository.remove("Hero Name");

        Item secondItem = new Item(100, 20, 13);
        Hero secondHero = new Hero("Sasho", 125, secondItem);

        Item thirdItem = new Item(50, 60, 2);
        Hero thirdHero = new Hero("Gosho", 100, thirdItem);

        heroRepository.add(secondHero);
        heroRepository.add(thirdHero);
        System.out.println("-------------------------------------");

        System.out.println(heroRepository.getHeroWithHighestIntelligence());
        System.out.println(heroRepository.getHeroWithHighestAgility());
        System.out.println(heroRepository.getHeroWithHighestStrength());
        System.out.println(heroRepository.getCount());

    }
}
