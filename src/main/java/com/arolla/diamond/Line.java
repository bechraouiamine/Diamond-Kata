package com.arolla.diamond;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.generate;

/**
 * Created by aminebechraoui, on 09/02/2021, in com.arolla.diamond
 */
public class Line {
    public static final String CARRIAGE_RETURN = "\n";
    private static String ONE_SPACE = " ";
    int lineNumber;
    char diamondBaseChar;


    public Line(int lineNumber, char diamondBaseChar) {
        this.lineNumber = lineNumber;
        this.diamondBaseChar = diamondBaseChar;
    }

    public String getStringValue() {
        if (lineNumber == 3) {
            return generateIndentation(23) + "C"+generateIndentation(3)+"C" + generateIndentation(23) + CARRIAGE_RETURN;
        } else if (lineNumber == 5) {
            if (diamondBaseChar == 'G') {
                return generateIndentation(2) + "E" + generateIndentation(7) + "E" + generateIndentation(2) + CARRIAGE_RETURN;
            } else {
                return generateIndentation(21) + "E" +generateIndentation(7)+ "E" + generateIndentation(21) + CARRIAGE_RETURN;
            }
        }
        return generateIndentation(22) + "D" +generateIndentation(5) + "D" + generateIndentation(22)+ CARRIAGE_RETURN;
    }

    private String generateIndentation(Integer spaceNumber) {
        return generate(() -> ONE_SPACE)
                .limit(spaceNumber)
                .collect(joining());
    }
}
