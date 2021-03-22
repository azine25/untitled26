package com;

public class Boss extends GameEntity {

    Weapon weapon ;


    public Boss(int health, int damage, Weapon weapon) {
        super(health, damage);
        this.weapon = weapon;
    }
    public String printInfo(){
        return getWeapon().getType() + getWeapon().getName() +  getHealth() + getDamage();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}

