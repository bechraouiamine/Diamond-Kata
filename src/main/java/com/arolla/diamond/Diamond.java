package com.arolla.diamond;

/**
 * Created by aminebechraoui, on 08/02/2021, in com.arolla.diamond
 */
public class Diamond {
    private static int UPPER_CASE = 64;
    private static int LOWER_CASE = 96;

    private char diamondBaseChar;

    public Diamond(char inputChar) {
        diamondBaseChar = inputChar;
    }

    public void print() {
        if (diamondBaseChar == 'D' || diamondBaseChar == 'd') {
            System.out.print("   A   \n  B B  \n C   C \nD     D\n C   C \n  B B  \n   A   \n");
        } else if (diamondBaseChar== 'C') {
            System.out.print("  A  \n B B \nC   C\n B B \n  A  \n");
        } else if (diamondBaseChar == 'B') {
            System.out.print(" A \nB B\n A ");
        } else {
            System.out.print("A");
        }
    }

}
