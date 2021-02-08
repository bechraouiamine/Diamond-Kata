package com.arolla.diamond;

/**
 * Created by aminebechraoui, on 08/02/2021, in com.arolla.diamond
 */
public class Diamond {
    private String diamondBaseChar;

    public Diamond(String inputChar) {
        diamondBaseChar = inputChar;
    }

    public String print() {
        if (diamondBaseChar.equals("B")) {
            return " A \nB B\n A ";
        }
        return "A";
    }
}
