public class Archer extends Hero {
    private static int DAMAGE = 4;

    public Archer(String name){
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println("Лучник "+getName()+" атакует врага стрелами!");
        enemy.takeDamage(DAMAGE);
        System.out.println("Лучник "+getName()+" нанёс " + DAMAGE +" урона. У противника осталось "+ enemy.getHealth() +" хп!");
    }
}
