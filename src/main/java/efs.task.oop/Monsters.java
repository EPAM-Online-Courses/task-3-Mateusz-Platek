package efs.task.oop;

public class Monsters {
    static final Monster andariel = new Monster(10, 70) {
        @Override
        public void attack(Fighter victim) {
            if (super.health > 0) {
                victim.takeHit(super.damage);
            }
        }

        @Override
        public void takeHit(int damage) {
            if (super.health > 0) {
                super.health -= damage;
                monstersHealth -= damage;
            }
        }
    };

    static final Monster blacksmith = new Monster(100, 25) {
        @Override
        public void attack(Fighter victim) {
            if (super.health > 0) {
                victim.takeHit(super.damage);
            }
        }

        @Override
        public void takeHit(int damage) {
            if (super.health > 0) {
                super.health -= damage + 5;
                monstersHealth -= damage + 5;
            }
        }
    };

    public static int monstersHealth = andariel.health + blacksmith.health;
}
