package it.gb.textFormattingEngine;

public class ConcreteCharacter implements Character {
    
    private char character;

    
    public ConcreteCharacter(char character) {
        super();
        this.character = character;
    }
    
    public char getCharacter() {
        return character;
    }

    @Override
    public void display() {
        System.out.println("[" + System.identityHashCode(this.character) + "]");
        System.out.println(this.character);
    }
}
