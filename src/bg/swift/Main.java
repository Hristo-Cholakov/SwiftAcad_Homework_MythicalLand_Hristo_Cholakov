package bg.swift;

public class Main {

    public static void main(String[] args) {
	int turn = 0;

        Hero hero = new Hero("Mario", 10);
        Monster bear = new Monster(20, 30);
        Monster wolf = new Monster(10, 5);
        Monster ant = new Monster(0, 5);

        while (!(hero.hasCompletedLevel() || hero.isHeroDead())) {
            turn++;
            switch (turn) {
                case 3:
                    bear.attack(hero);
                    break;
                case 10:
                    hero.sleeping();
                    break;
                case 11:
                    hero.tumble();
                    break;
                case 12:
                    wolf.attack(hero);
                default:
                    hero.running();
            }
            System.out.printf("%s ", hero.getProgress());
            if (hero.getProgress() >= 100) {
                System.out.println();
                System.out.printf("Bam bam bam! Fireworks and champagne! Completed in %s turns.", turn);
            }

            }
    }
}
