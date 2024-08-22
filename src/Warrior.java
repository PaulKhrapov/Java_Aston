public class Warrior extends Hero{
    private static int WARRIORDAMAGE = 2;
    private static int HEALTH = 50;

    public Warrior(String name) {
        super(name, HEALTH);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println("Воин "+getName()+" атакует врага мечом!");
        enemy.takeDamage(WARRIORDAMAGE);
        System.out.println("Воин "+getName()+" нанёс " + WARRIORDAMAGE +" урона.");
        enemy.checkHP();
    }

    public void takeDamage(int takeDamage){
        setHealth(HEALTH-=takeDamage);
    }
}
