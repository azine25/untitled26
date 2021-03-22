package com;

public class GameEntity {
    private int damage;
    private int health;

    public GameEntity(int health, int damege) {
        this.damage = damege;
        this.health = health;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}


