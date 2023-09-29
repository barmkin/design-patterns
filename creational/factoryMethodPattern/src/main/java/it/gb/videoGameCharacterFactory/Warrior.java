package it.gb.videoGameCharacterFactory;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name, Character.CHARACTER_CLASS.Warrior);
    }

    @Override
    public int getBaseHealth() {
        return 12;
    }

    @Override
    public int getBaseAttackPower() {
        return 5;
    }

    @Override
    public int attack() {
        System.out.println("Warrior is attacking!");
        return this.getBaseAttackPower() + (this.hasWeapon ? ((int) (this.weaponAttack * 1.5f)) : 0);
    }

    @Override
    public void defend(int attackRoll, int damage) {
        System.out.println("Warrior defends!");
        if (attackRoll >= this.armorClass) {
            this.healthPoints -= damage;
            if (this.healthPoints <= 0) {
                System.out.println("Warrior is defeated!");
            }
        } else {
            System.out.println("Warrior avoids the attack!");
        }
    }

    @Override
    public String toString() {
        return "Warrior " + this.getName() +
            " - HP: " + this.getHealthPoints() +
            " - AC: " + this.armorClass;
    }
    
}
