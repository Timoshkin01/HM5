package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(40);
        boss.setTypeOfProtection("kinetic");
        System.out.println("Boss info: " + boss.getHealth() + ", " + boss.getDamage() + ", " + boss.getTypeOfProtection());

        Hero[] heroes = createHeroes();
        for (Hero geroi: heroes) {
            System.out.println(geroi.getHealth() + ", " + geroi.getDamage() + ", " + geroi.getSuperAbility());
        }
    }

    public static Hero[] createHeroes (){
        Hero c1 = new Hero(250, 10, "Magical");
        Hero c2 = new Hero(230, 25, "Dodik");
        Hero c3 = new Hero(240, 15);
        Hero[] heroes = {c1, c2, c3};
        return heroes;
    }
}