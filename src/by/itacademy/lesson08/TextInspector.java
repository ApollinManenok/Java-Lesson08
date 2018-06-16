package by.itacademy.lesson08;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TextInspector {
    private static Logger LOGGER = Logger.getLogger(Main.class.getName());
    private String str;
    private MapContainer words;
    private SetContainer sortWords;

    public TextInspector(String str) {
        this.str = str;
        words = new MapContainer(this.str.split(" "));
        sortWords = new SetContainer(words.getKeys());
    }

    public void printSet() {
        System.out.println(sortWords);
    }

    public boolean checkWord(String word) {
        try {
            System.out.println("\"" + word + "\" occurs " + words.get(word) + " time(s)");
            return true;
        } catch (WordException e) {
            LOGGER.log(Level.WARNING, e.getMessage(), e);
            return false;
        }
    }
}


