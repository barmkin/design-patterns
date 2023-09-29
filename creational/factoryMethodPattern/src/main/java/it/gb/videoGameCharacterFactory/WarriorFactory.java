package it.gb.videoGameCharacterFactory;

public class WarriorFactory implements CharacterFactory {

    @Override
    public Character createCharacter(String name) {
        return new Warrior(name);
    }
    
}
