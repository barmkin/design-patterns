package it.gb.videoGameCharacterFactory;

import java.util.HashSet;
import java.util.Set;

public class Armor {
    private int armorClass;
    private Set<Character.CHARACTER_CLASS> classRequirements;

    public Armor(int armorClass, Character.CHARACTER_CLASS classRequirement) {
        super();
        this.armorClass = armorClass;
        this.classRequirements = new HashSet<Character.CHARACTER_CLASS>();
        this.classRequirements.add(classRequirement);
    }


    public Armor(int armorClass, Set<Character.CHARACTER_CLASS> classRequirements) {
        super();
        this.armorClass = armorClass;
        this.classRequirements = classRequirements;
    }

    public int getArmorClass() {
        return this.armorClass;
    }

    public Set<Character.CHARACTER_CLASS> getClassRequirements() {
        return this.classRequirements;
    }
}
