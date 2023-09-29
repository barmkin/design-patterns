package it.gb.videoGameCharacterFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public abstract class VideoGameCharacterFactoryApp {

    private static CharacterFactory selectCharacterFactory(Character.CHARACTER_CLASS characterClass) {
        switch (characterClass) {
            case Archer:
                return new ArcherFactory();
            case Mage:
                return new MageFactory();
            case Warrior:
                return new WarriorFactory();
            default:
                return null;
        }
    }
    
    private static int getArrayRandomIndex(int arrayLength) {
        Random random = new Random();
        return random.nextInt(arrayLength); // Generates a random index between 0 (inclusive) and arrayLength (exclusive)
    }

    public static void executeVideoGameCharacterFactoryApp() {

        // SELECT CLASS
        Character.CHARACTER_CLASS selectedClass = Character.CHARACTER_CLASS.Mage;
        // ADD NAME
        String name = "Hero";

        HashSet<Character.CHARACTER_CLASS> allClasses = new HashSet<>();
        allClasses.add(Character.CHARACTER_CLASS.Archer);
        allClasses.add(Character.CHARACTER_CLASS.Mage);
        allClasses.add(Character.CHARACTER_CLASS.Warrior);

        HashSet<Character.CHARACTER_CLASS> archerWarrior = new HashSet<>();
        archerWarrior.add(Character.CHARACTER_CLASS.Archer);
        archerWarrior.add(Character.CHARACTER_CLASS.Warrior);
        
        // Define items
        List<Armor> armorList = new ArrayList<Armor>();
        Armor mageArmor = new Armor(11, Character.CHARACTER_CLASS.Mage);
        armorList.add(mageArmor);
        Armor lightArmor = new Armor(11, allClasses);
        armorList.add(lightArmor);
        Armor mediumArmor = new Armor(11, archerWarrior);    
        armorList.add(mediumArmor);
        Armor heavyArmor = new Armor(11, Character.CHARACTER_CLASS.Warrior);
        armorList.add(heavyArmor);

        List<Weapon> weaponList = new ArrayList<Weapon>();
        Weapon sword = new Weapon(5, allClasses);
        weaponList.add(sword);
        Weapon battleAxe = new Weapon(12, Character.CHARACTER_CLASS.Warrior);
        weaponList.add(battleAxe);
        Weapon bow =  new Weapon(8, Character.CHARACTER_CLASS.Archer);
        weaponList.add(bow);

        CharacterFactory characterFactory = VideoGameCharacterFactoryApp.selectCharacterFactory(selectedClass);

        Character character = characterFactory.createCharacter(name);

        int randomArmorDropIndex = VideoGameCharacterFactoryApp.getArrayRandomIndex(armorList.size());
        if (!character.equip(armorList.get(randomArmorDropIndex))) {
            System.out.println("Cannot equip this armor");
        }

        int randomWeaponDropIndex = VideoGameCharacterFactoryApp.getArrayRandomIndex(weaponList.size());
        if (!character.equip(weaponList.get(randomWeaponDropIndex))) {
            System.out.println("Cannot equip this weapon");
        }

        character.attack();
        character.defend(11, 4);

        System.out.println(character.toString());

    }
}
