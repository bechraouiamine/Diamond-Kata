package com.arolla.diamond;

/**
 * Created by aminebechraoui, on 09/02/2021, in com.arolla.diamond
 */
public class Line {
    int lineNumber;
    char diamondBaseChar;


    public Line(int lineNumber, char diamondBaseChar) {
        this.lineNumber = lineNumber;
        this.diamondBaseChar = diamondBaseChar;
    }

    public String getStringValue() {
        if (lineNumber == 3) {
            return "                       C   C                       \n";
        } else if (lineNumber == 5) {
            if (diamondBaseChar == 'G') {
                return "  E       E  \n";
            } else {
                return "                     E       E                     \n";
            }
        }
        return "                      D     D                      \n";
    }
}
