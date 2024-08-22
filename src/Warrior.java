public class Warrior extends Hero{
    private static int DAMAGE = 2;

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println("Воин "+getName()+" атакует врага мечом!");
        enemy.takeDamage(DAMAGE);
        System.out.println("Воин "+getName()+" нанёс " + DAMAGE +" урона. У противника осталось "+ enemy.getHealth() +" хп!");
    }
}
