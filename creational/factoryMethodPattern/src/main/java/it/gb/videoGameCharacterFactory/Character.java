package it.gb.videoGameCharacterFactory;

public abstract class Character {
    /* GENERIC */
    private String name;
    private CHARACTER_CLASS characterClass;

    /* ENUMS */
    public static enum CHARACTER_CLASS {
        Warrior,
        Mage,
        Archer
    }

    /* DEFENSES */
    int healthPoints;
    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        if (this.healthPoints > this.getBaseHealth()) {
            healthPoints = this.getBaseHealth();
        }
        this.healthPoints = healthPoints;
    }

    int armorClass;
    boolean hasArmor;

    public abstract int getBaseHealth();

    /* ATTACK */
    int baseAttack;
    int weaponAttack;
    boolean hasWeapon;

    public abstract int getBaseAttackPower();

    /* METHODS */

    public Character(String name, CHARACTER_CLASS characterClass) {
        super();
        this.name = name;
        this.characterClass = characterClass;

        this.healthPoints = this.getBaseHealth();
        this.armorClass = 10;
        this.hasArmor = false;

        this.baseAttack = this.getBaseAttackPower();
        this.weaponAttack = 0;
        this.hasWeapon = false;
    }

    public String getName() {
        return name;
    }

    public CHARACTER_CLASS getCharacterClass() {
        return characterClass;
    }

    public boolean equip(Weapon weapon) {
        if (weapon != null && weapon.getClassRequirements().contains(this.characterClass)) {
            this.hasWeapon = true;
            this.weaponAttack = weapon.getWeaponDamage();
            return true;
        } else {
            return false;
        }
    }

    public boolean equip(Armor armor) {
        if (armor != null && armor.getClassRequirements().contains(this.characterClass)) {
            this.hasArmor = true;
            this.armorClass = armor.getArmorClass();
            return true;
        } else {
            return false;
        }
    }

    public abstract int attack();
    public abstract void defend(int attackRoll, int damage);

}
