package it.gb.textFormattingEngine;

import java.util.ArrayList;
import java.util.List;

public class CharacterFactory {
    
    private List<Character> cache;
    private int cacheMissCount;
    private int cacheHitCount;

    public CharacterFactory() {
        super();
        this.cache = new ArrayList<Character>();
        this.cacheMissCount = 0;
        this.cacheHitCount = 0;
    }

    public Character getCharacter(char character) {
        
        for (Character c : cache) {
            if (c.getCharacter() == character) {
                this.cacheHitCount++;
                return c;
            }
        }

        Character c = new ConcreteCharacter(character);
        cache.add(c);
        this.cacheMissCount++;

        return c;
    }

    public void printCacheStatistics() {
        System.out.println("Miss Count: " + this.cacheMissCount);   // Number of new cache items 
        System.out.println("Hit Count: " + this.cacheHitCount);    // Number of reused Characters! RAM space saved!"
    }
}
