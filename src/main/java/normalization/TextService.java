package normalization;

import java.util.Map;

public class TextService {

    public String getNormalizationText(String text) {
        return text.toLowerCase().toLowerCase().replaceAll("[^A-Za-zА-Яа-я0-9\\s]", "");
    }

    public String replaceRusSimilarChars(String text) {
        Map<Character, Character> similarCharacters = Map.of(
                'a', 'а',
                'e', 'е',
                'o', 'о',
                'p', 'р',
                'c', 'с',
                'y', 'у',
                'x', 'х',
                '6', 'б',
                '0', 'о'
        );

        String[] wordsArray = text.split(" ");

        for (int i = 0; i < wordsArray.length; i++) {
            for (char c :
                    similarCharacters.keySet()) {
                if (wordsArray[i].contains(Character.toString(c))) {
                    wordsArray[i] = wordsArray[i].replaceAll(Character.toString(c), String.valueOf(similarCharacters.get(c)));
                }
            }
        }

        return String.join(" ", wordsArray);
    }
}
