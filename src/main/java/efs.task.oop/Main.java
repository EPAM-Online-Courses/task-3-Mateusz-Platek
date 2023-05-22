package efs.task.oop;

public class Main {
    public static void main(String[] args) {
        Villager Kashya = new Villager("Kashya", 30);
        ExtraordinaryVillager Akara = new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.SHELTER);
        Villager Gheed = new Villager("Gheed", 50);
        ExtraordinaryVillager DeckardCain = new ExtraordinaryVillager("Deckard Cain", 85, ExtraordinaryVillager.Skill.IDENTIFY);
        Villager Warriv = new Villager("Warriv", 35);
        Villager Flawia = new Villager("Flawia", 25);

        Object objectDeckardCain = DeckardCain;
        Object objectAkara = Akara;
        //objectAkara.sayHello - nie można użyć metod

        Kashya.sayHello();
        Akara.sayHello();
        Gheed.sayHello();
        DeckardCain.sayHello();
        Warriv.sayHello();
        Flawia.sayHello();

        Villager[] villagers = {Kashya, Akara, Gheed, DeckardCain, Warriv, Flawia};
        Monster[] monsters = {Monsters.andariel, Monsters.blacksmith};

        while (Monsters.monstersHealth > 0) {
            for (var villager : villagers) {
                if (villager.getHealth() > 0) {
                    System.out.println("Aktualnie walczacy osadnik to " + villager.getName());
                    for (var monster : monsters) {
                        if (monster.health > 0) {
                            villager.attack(monster);
                            monster.attack(villager);
                            break;
                        }
                    }
                    break;
                }
            }
            System.out.println("Potwory posiadaja jeszcze " + Monsters.monstersHealth + " punkty zycia");
        }

        System.out.println("Obozowisko ocalone!");

        Akara = (ExtraordinaryVillager) objectAkara;
        DeckardCain = (ExtraordinaryVillager) objectDeckardCain;

        Akara.sayHello();
        DeckardCain.sayHello();
    }
}
