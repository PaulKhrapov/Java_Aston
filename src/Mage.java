public class Mage extends Hero{
    private static int DAMAGE = 6;

    public Mage(String name){
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println("Маг "+getName()+" атакует врага магией!");
        enemy.takeDamage(DAMAGE);
        System.out.println("Маг "+getName()+" нанёс " + DAMAGE +" урона. У противника осталось "+ enemy.getHealth() +" хп!");
    }
}
