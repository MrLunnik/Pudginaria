package main.java.models.hero;

public enum HeroType {

    WARRIOR(100, 10),
    MAGE(50, 50),
    ARCHER(70, 30);

    int HP;
    int damage;

    HeroType(int HP, int damage) {
        this.HP = HP;
        this.damage = damage;
    }

}
