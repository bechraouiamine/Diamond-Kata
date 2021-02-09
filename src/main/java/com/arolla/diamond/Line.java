package com.arolla.diamond;

/**
 * Created by aminebechraoui, on 09/02/2021, in com.arolla.diamond
 */
public class Line {
    int lineNumber;

    public Line(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getStringValue() {
        if (lineNumber == 3) {
            return "                       C   C                       \n";
        }
        return "                      D     D                      \n";
    }
}
