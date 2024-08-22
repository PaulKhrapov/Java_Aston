public class BattleGround {
    public static void main(String[] args) {

        EnemyZombieArcher enmZmbArch = new EnemyZombieArcher("zombArch");
        Archer archer1 = new Archer("Legolas");
        enmZmbArch.checkHP();
        archer1.checkHP();
        System.out.println("");

        while (enmZmbArch.isAlive()) {
            enmZmbArch.attackHero(archer1);
            archer1.attackEnemy(enmZmbArch);
            System.out.println("");
        }
    }
}
