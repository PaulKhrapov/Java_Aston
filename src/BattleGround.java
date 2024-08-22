public class BattleGround {
    public static void main(String[] args) {

        Enemy enemy1 = new Enemy(20);
        enemy1.checkHP();

        Archer archer1 = new Archer("Legolas");
        archer1.attackEnemy(enemy1);
        archer1.attackEnemy(enemy1);
        archer1.attackEnemy(enemy1);
        archer1.attackEnemy(enemy1);
        System.out.println(enemy1.isAlive());
        archer1.attackEnemy(enemy1);
        System.out.println(enemy1.isAlive());
    }
}
