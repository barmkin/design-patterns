package it.gb.videoGameCharacterFactory;

import java.util.HashSet;
import java.util.Set;

public class Weapon {
    private int weaponDamage;
    private Set<Character.CHARACTER_CLASS> classRequirements;

    public Weapon(int damage, Character.CHARACTER_CLASS classRequirement) {
        super();
        this.weaponDamage = damage;
        this.classRequirements = new HashSet<Character.CHARACTER_CLASS>();
        this.classRequirements.add(classRequirement);
    }

    public Weapon(int damage, Set<Character.CHARACTER_CLASS> classRequirements) {
        super();
        this.weaponDamage = damage;
        this.classRequirements = classRequirements;
    }

    public int getWeaponDamage() {
        return this.weaponDamage;
    }

    public Set<Character.CHARACTER_CLASS> getClassRequirements() {
        return this.classRequirements;
    }

}
