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
        if (diamondBaseChar == 'Z') {
            System.out.print("                         A                         \n" +
                    "                        B B                        \n" +
                    "                       C   C                       \n" +
                    "                      D     D                      \n" +
                    "                     E       E                     \n" +
                    "                    F         F                    \n" +
                    "                   G           G                   \n" +
                    "                  H             H                  \n" +
                    "                 I               I                 \n" +
                    "                J                 J                \n" +
                    "               K                   K               \n" +
                    "              L                     L              \n" +
                    "             M                       M             \n" +
                    "            N                         N            \n" +
                    "           O                           O           \n" +
                    "          P                             P          \n" +
                    "         Q                               Q         \n" +
                    "        R                                 R        \n" +
                    "       S                                   S       \n" +
                    "      T                                     T      \n" +
                    "     U                                       U     \n" +
                    "    V                                         V    \n" +
                    "   W                                           W   \n" +
                    "  X                                             X  \n" +
                    " Y                                               Y \n" +
                    "Z                                                 Z\n" +
                    " Y                                               Y \n" +
                    "  X                                             X  \n" +
                    "   W                                           W   \n" +
                    "    V                                         V    \n" +
                    "     U                                       U     \n" +
                    "      T                                     T      \n" +
                    "       S                                   S       \n" +
                    "        R                                 R        \n" +
                    "         Q                               Q         \n" +
                    "          P                             P          \n" +
                    "           O                           O           \n" +
                    "            N                         N            \n" +
                    "             M                       M             \n" +
                    "              L                     L              \n" +
                    "               K                   K               \n" +
                    "                J                 J                \n" +
                    "                 I               I                 \n" +
                    "                  H             H                  \n" +
                    "                   G           G                   \n" +
                    "                    F         F                    \n" +
                    "                     E       E                     \n" +
                    "                      D     D                      \n" +
                    "                       C   C                       \n" +
                    "                        B B                        \n" +
                    "                         A                         \n");
        } else if (diamondBaseChar == 'D' || diamondBaseChar == 'd') {
            System.out.print("   A   \n  B B  \n C   C \nD     D\n C   C \n  B B  \n   A   \n");
        } else if (diamondBaseChar== 'C') {
            System.out.print("  A  \n B B \nC   C\n B B \n  A  \n");
        } else if (diamondBaseChar == 'B') {
            System.out.print(" A \nB B\n A ");
        } else {
            System.out.print("A");
        }
    }

    public Line buildLine(int lineNumber) {
        return new Line(lineNumber, diamondBaseChar);
    }
}
