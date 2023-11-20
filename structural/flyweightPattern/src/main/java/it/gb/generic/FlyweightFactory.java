package it.gb.generic;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, List<Flyweight>> cache;

    public FlyweightFactory() {
        super();
        cache = new HashMap<String, List<Flyweight>>();
    }

    /** This method is over-complicated for exercise... */
    public Flyweight getFlyweight(String repeatingStringHeader, String repeatingStringFooter) {
        
        // Map
        byte[] mapByteKey = {};

        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            mapByteKey = digest.digest(
                    (repeatingStringHeader + repeatingStringFooter).getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        String mapStringKey = new String(mapByteKey);

        List<Flyweight> flyweights = null;
        
        // Check cache
        if (cache.containsKey(mapStringKey)) {
            flyweights = cache.get(mapStringKey);

            if (flyweights.size() == 1) { // single hit cache
                System.out.println("Cache HIT");
                return flyweights.get(0);
            } else if (flyweights.size() > 1) { // multi-hit cache
                System.out.println("Cache MULTI-HIT!");
                for (Flyweight flyweight : flyweights) {
                    if (flyweight.getRepeatingStringHeader().equals(repeatingStringHeader) &&
                            flyweight.getRepeatingStringFooter().equals(repeatingStringFooter)) {
                        return flyweight;
                    }
                }
            }
        }

        // Not in cache, create element...
        System.out.println("Cache MISS");
        Flyweight flyweight = new Flyweight(repeatingStringHeader, repeatingStringFooter);
        if (flyweights == null) {
            flyweights = new ArrayList<Flyweight>();
        }
        flyweights.add(flyweight);

        // ...add to cache...
        cache.put(mapStringKey, flyweights);

        // ...and return it
        return flyweight;
    }

}
