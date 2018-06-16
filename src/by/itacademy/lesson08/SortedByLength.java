package by.itacademy.lesson08;

import java.util.Comparator;

public class SortedByLength implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        int result = str1.length() - str2.length();
        if (result == 0) {
            result = str1.compareTo(str2);
        }
        return result;
    }
}
