package Heroes;

import Enemies.Enemy;

public class Mage extends Hero {
    private static int MAGEDAMAGE = 6;
    private static int HEALTH = 30;

    public Mage(String name){
        super(name, HEALTH);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println("Маг "+getName()+" атакует врага магией!");
        enemy.takeDamage(MAGEDAMAGE);
        System.out.println("Маг "+getName()+" нанёс " + MAGEDAMAGE +" урона.");
        enemy.checkHP();
    }

    public void takeDamage(int takeDamage){
        setHealth(HEALTH-=takeDamage);
    }
}
