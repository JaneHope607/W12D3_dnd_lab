package player;

import behaviours.Melee;

public class Knight extends Player implements Melee {

    public Knight(int healthPoints, String weapon) {
        super(healthPoints);
        this.weapon = weapon;
        this.damageResistance = 5;
    }

    public String fight() {
        return "Knight is fighting";
    }

    public void changeWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void fightEnemy() {
        System.out.println(fight());
        takeDamage();
        System.out.println("Knight has killed the " + currentRoom.getEnemy().getName());
    }
}
