package efs.task.oop;

public class Villager implements Fighter {
    protected String name;
    protected int age;
    protected int health;

    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void sayHello() {
        System.out.println("Greetings traveler... I'm " + name + " and I'm " + age + " years old.");
    }

    @Override
    public void attack(Fighter victim) {
        int damage = (int) (100 - age * 0.5) / 10;
        if (health > 0) {
            victim.takeHit(damage);
        }
    }

    @Override
    public void takeHit(int damage) {
        if (health > 0) {
            health -= damage;
        }
    }
}
