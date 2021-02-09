package com.arolla.diamond;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.generate;

/**
 * Created by aminebechraoui, on 09/02/2021, in com.arolla.diamond
 */
public class Line {
    private static int UPPER_CASE = 64;
    private static int LOWER_CASE = 96;

    private static final String CARRIAGE_RETURN = "\n";
    private static String ONE_SPACE = " ";
    int lineNumber;
    char diamondBaseChar;


    public Line(int lineNumber, char diamondBaseChar) {
        this.lineNumber = lineNumber;
        this.diamondBaseChar = diamondBaseChar;
    }

    public String getStringValue() {
        return generateIndentation(getExtremeSpacing())
                + getLineCharacters() + generateIndentation(getMiddleSpacing()) +
                getLineCharacters() + generateIndentation(getExtremeSpacing()) + CARRIAGE_RETURN;
    }

    private String generateIndentation(Integer spaceNumber) {
        return generate(() -> ONE_SPACE)
                .limit(spaceNumber)
                .collect(joining());
    }

    private int getDiamondBaseCharAlphabeticOrder() {
        int diamondBaseCharCodePoint =         String.valueOf(diamondBaseChar).codePointAt(0);
        return diamondBaseCharCodePoint > LOWER_CASE ? diamondBaseCharCodePoint - LOWER_CASE : diamondBaseCharCodePoint - UPPER_CASE;
    }

    private int getExtremeSpacing() {
        return getDiamondBaseCharAlphabeticOrder() - lineNumber;
    }

    private int getMiddleSpacing() {
        return 2 * (lineNumber - 2) + 1;
    }

    private char getLineCharacters() {
        return (char)(UPPER_CASE+lineNumber);
    }
}
