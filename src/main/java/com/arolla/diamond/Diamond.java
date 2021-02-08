package com.arolla.diamond;

/**
 * Created by aminebechraoui, on 08/02/2021, in com.arolla.diamond
 */
public class Diamond {
    private String diamondBaseChar;

    public Diamond(String inputChar) {
        diamondBaseChar = inputChar;
    }

    public void print() {
        if (diamondBaseChar.equals("D")) {
            System.out.print("   A   \n  B B  \n C   C \nD     D\n C   C \n  B B  \n   A   \n");
        } else if (diamondBaseChar.equals("C")) {
            System.out.print("  A  \n B B \nC   C\n B B \n  A  \n");
        } else if (diamondBaseChar.equals("B")) {
            System.out.print(" A \nB B\n A ");
        } else {
            System.out.print("A");
        }
    }
}
