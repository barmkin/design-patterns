package it.gb.videoGameCharacterFactory;

public class ArcherFactory implements CharacterFactory {

    public ArcherFactory() {
        super();
    }

    @Override
    public Character createCharacter(String name) {
        return new Archer(name);
    }
    
}
