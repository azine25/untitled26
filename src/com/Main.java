package com;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(500,50,new Weapon("Sword "," Katana "));
        Skeleton skeleton = new Skeleton(200,10,new Weapon("Physical"," Bow " ), 27);
        Skeleton skeleton1 = new Skeleton(100,20,new Weapon("Magical"," Spirit " ), 37);

        System.out.println(boss.printInfo()+
                " \n" + skeleton.printInfo()+
                " \n" + skeleton1.printInfo());

    }
}
