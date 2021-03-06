package player;

import behaviours.Spellcaster;

import java.util.ArrayList;

public class Wizard extends Player implements Spellcaster {

    private String creature;

    public Wizard(int healthPoints, final String spell) {
        super(healthPoints);
        this.spells = new ArrayList<String>() {{add(spell);}};
        this.creature = "Ogre";
        this.damageResistance = -1;
    }


    public void addSpell(String spell) {
        spells.add(spell);
    }

    public void removeSpell(String spell) {
        spells.remove(spell);
    }

    public String castSpell(String spell) {
        return spells.contains(spell) ? "Wizard casts " + spell : "Wizard doesn't know that spell";
    }

    public String getCreature() {
        return creature;
    }

    public void changeCreature(String creature) {
        this.creature = creature;
    }

    @Override
    public void fightEnemy() {
        System.out.println(castSpell("Fireball"));
        takeDamage();
        if (healthPoints <= 0) {
            System.out.println("You have died! Your total loot was " + getLoot() + " gold pieces");
        } else {
            System.out.println("Wizard has killed the " + currentRoom.getEnemy().getName());
        }
    }
}
