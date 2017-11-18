package main.java.models.hero;

import main.java.models.Health;

public class Hero {

    public Hero(String name, HeroType heroType) {
        this.name = name;
        this.health = heroType.HP;
        this.heroType = heroType;
    }

    private String name;
    private int health;
    private HeroType heroType;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public HeroType getHeroType() {
        return heroType;
    }
}
