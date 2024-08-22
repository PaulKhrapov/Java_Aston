package Heroes;

import Enemies.Enemy;

public class Archer extends Hero {
    private static int ARCHERDAMAGE = 10;
    private static int HEALTH = 35;

    public Archer(String name){
        super(name, HEALTH);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println("Лучник "+getName()+" атакует врага стрелами и наносит "+ARCHERDAMAGE+" урона!");
        enemy.takeDamage(ARCHERDAMAGE);
        enemy.checkHP();
    }

    public void takeDamage(int takeDamage){
        setHealth(HEALTH-=takeDamage);
    }
}
