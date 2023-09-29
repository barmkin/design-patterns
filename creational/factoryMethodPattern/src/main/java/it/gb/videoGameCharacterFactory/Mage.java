package it.gb.videoGameCharacterFactory;

public class Mage extends Character {

    public Mage(String name) {
        super(name, Character.CHARACTER_CLASS.Mage);
    }

    @Override
    public int getBaseHealth() {
        return 5;
    }

    @Override
    public int getBaseAttackPower() {
        return 8;
    }

    @Override
    public int attack() {
        System.out.println("Mage is casting a spell!");
        return this.getBaseAttackPower() + (this.hasWeapon ? ((int) (this.weaponAttack / 2)) : 0);
    }

    @Override
    public void defend(int attackRoll, int damage) {
        System.out.println("Mage defends!");
        if (attackRoll >= this.armorClass) {
            this.healthPoints -= damage;
            if (this.healthPoints <= 0) {
                System.out.println("Mage is defeated!");
            }
        } else {
            System.out.println("Mage use a magic shield!");
        }
    }

    @Override
    public String toString() {
        return "Mage " + this.getName() +
            " - HP: " + this.getHealthPoints() +
            " - AC: " + this.armorClass;
    }
    
}
