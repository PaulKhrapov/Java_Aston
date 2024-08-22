public class Enemy implements Mortal {
    private int health;

    public Enemy(int health){
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage){
        setHealth(health-=damage);
    }

    public void checkHP(){
        System.out.println("У противника "+getHealth()+" хп!");
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
