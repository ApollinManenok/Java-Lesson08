package by.itacademy.lesson08;

import java.util.Set;
import java.util.TreeSet;

public class SetContainer {
    private Set<String> sortWords = new TreeSet<>(new SortedByLength());

    public SetContainer(Set<String> sortWords) {
        this.sortWords.addAll(sortWords);
    }

    @Override
    public String toString() {
        return sortWords.toString();
    }
}
