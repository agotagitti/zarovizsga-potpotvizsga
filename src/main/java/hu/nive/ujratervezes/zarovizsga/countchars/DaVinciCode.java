package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DaVinciCode {

    private static final String CHARS = "01x";


    public int encode(String path, char c) {
        if (CHARS.indexOf(c) < 0) {
            throw new IllegalArgumentException("Invalid character");
        }
        String textFromFile;
        textFromFile = readFile(path);
        int countChar = 0;
        for (char actualChar : textFromFile.toCharArray()) {
            if (actualChar == c) {
                countChar++;
            }
        }
        return countChar;
    }

    private String readFile(String path) {
        String textFromFile;
        try {
            textFromFile = Files.readString(Path.of(path));

        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
        return textFromFile;
    }
}
