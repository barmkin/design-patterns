package it.gb.videoGameCharacterFactory;

public class Archer extends Character {

    public Archer(String name) {
        super(name, Character.CHARACTER_CLASS.Archer);
    }

    @Override
    public int getBaseHealth() {
        return 8;
    }

    @Override
    public int getBaseAttackPower() {
        return 6;
    }

    @Override
    public int attack() {
        System.out.println("Archer is making a ranged attack!");
        return this.getBaseAttackPower() + (this.hasWeapon ? this.weaponAttack : 0);
    }

    @Override
    public void defend(int attackRoll, int damage) {
        System.out.println("Archer defends!");
        if (attackRoll >= this.armorClass) {
            this.healthPoints -= damage;
            if (this.healthPoints <= 0) {
                System.out.println("Archer is defeated!");
            }
        } else {
            System.out.println("Archer avoids the attack!");
        }
    }

    @Override
    public String toString() {
        return "Archer " + this.getName() +
            " - HP: " + this.getHealthPoints() +
            " - AC: " + this.armorClass;
    }
    
}
