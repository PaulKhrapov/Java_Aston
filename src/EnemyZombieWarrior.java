public class EnemyZombieWarrior extends Enemy{
    private static int HEALTH = 30;
    private static int ZMBWARRRDAMAGE = 4;

    public EnemyZombieWarrior(String nameZombie) {
        super(nameZombie, HEALTH);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Зомби "+getNameZombie()+" атакует врага мечом!");
        hero.takeDamage(ZMBWARRRDAMAGE);
        System.out.println("Зомби "+getNameZombie()+" нанёс " + ZMBWARRRDAMAGE +" урона.");
        hero.checkHP();
    }
}
