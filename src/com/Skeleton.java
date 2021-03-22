package com;

public class Skeleton extends Boss {

    private int quantityOfArrows;

    public int getQuantityOfArrows() {
        return quantityOfArrows;
    }

    public void setQuantityOfArrows(int quantityOfArrows) {
        this.quantityOfArrows = quantityOfArrows;
    }

    public Skeleton(int health, int damage, Weapon weapon, int quantityOfArrows) {
        super(health, damage, weapon);

    }

    public String printInfo(){
        return super.printInfo() + quantityOfArrows;
    }

}
