package it.gb.textFormattingEngine;

import java.util.ArrayList;
import java.util.List;

public abstract class TextFormattingEngineApp {

    public static void executeTextFormattingEngineApp() {

        // Init text
        String fullText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin dictum dolor nec enim rhoncus, "
                + "non venenatis lorem laoreet. Proin sit amet diam et lorem faucibus volutpat. "
                + "Nulla non tortor interdum, ultrices nulla a, pulvinar urna. Maecenas molestie consectetur diam, "
                + "quis condimentum nisi condimentum at. Proin non efficitur erat. Curabitur convallis varius quam, "
                + "a lacinia nunc lobortis a. Nam sit amet ligula nibh. Aenean aliquam sapien nulla, id molestie sapien posuere quis. "
                + "Cras rutrum vehicula magna et dapibus. Cras et suscipit nisl. In eu efficitur erat. Nunc id euismod odio, "
                + "ultrices elementum nisi. Nulla sed eleifend lectus, sed pharetra ante. ";

        char[] charArray = fullText.toCharArray();

        // Create a "Flyweight" representation (note: Java already do optimization for String! This is intended for exercise)
        CharacterFactory characterFactory = new CharacterFactory();
        List<Character> characterList = new ArrayList<Character>();

        for (char ch : charArray) {
            characterList.add(characterFactory.getCharacter(ch));
        }

        // Print statistic
        characterFactory.printCacheStatistics();

    }
}
