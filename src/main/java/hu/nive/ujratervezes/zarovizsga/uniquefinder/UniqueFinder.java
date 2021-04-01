package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueFinder {

    public List<Character> uniqueChars(String string) {
        if (string == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        Set<Character> charSet = new LinkedHashSet<>();
        for(char actualChar : string.toCharArray()) {
            charSet.add(actualChar);
        }
        return new ArrayList<>(charSet);
    }


}
