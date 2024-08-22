public abstract class Hero {
    private String name;
    private int health;

    public Hero(String name, int health){
        this.name = name;
        this.health = health;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void checkHP(){
        System.out.println("У героя "+getName()+ " " +getHealth()+" хп!");
    }

    public abstract void attackEnemy(Enemy enemy);

    public void takeDamage(int takeDamage){
        setHealth(health-=takeDamage);
    }
}
