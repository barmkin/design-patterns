package it.gb.videoGameCharacterFactory;

public class MageFactory implements CharacterFactory {
    public MageFactory() {
        super();
    }

    @Override
    public Character createCharacter(String name) {
        return new Mage(name);
    }
    
}
