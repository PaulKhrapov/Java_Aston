public class EnemyZombieArcher extends Enemy{
    private static int HEALTH = 20;
    private static int ZMBARCHRDAMAGE = 5;

    public EnemyZombieArcher(String nameZombie) {
        super(nameZombie, HEALTH);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Зомби "+getNameZombie()+" атакует героя мечом и наносит "+ZMBARCHRDAMAGE+ " урона!");
        hero.takeDamage(ZMBARCHRDAMAGE);
        hero.checkHP();
    }
}
