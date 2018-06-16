package by.itacademy.lesson08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapContainer {
    private Map<String, Integer> words = new HashMap<>();

    public MapContainer(String[] split) {
        for (String word : split) {
            if (words.containsKey(word))
                words.put(word, words.get(word) + 1);
            else
                words.put(word, 1);
        }
    }

    public Integer get(String key) throws WordException {
        if (!words.containsKey(key))
            throw new WordException("No such word: \"" + key + "\"");
        return words.get(key);
    }

    public Set<String> getKeys() {
        return words.keySet();
    }
}

