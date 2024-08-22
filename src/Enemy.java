public abstract class Enemy implements Mortal {
    private String nameZombie;
    private int health;

    public Enemy(String nameZombie, int health){
        this.nameZombie = nameZombie;
        this.health = health;
    }

    public String getNameZombie() {
        return nameZombie;
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
        System.out.println("У зомби "+getNameZombie()+" "+getHealth()+" хп!");
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public abstract void attackHero(Hero hero);
}
