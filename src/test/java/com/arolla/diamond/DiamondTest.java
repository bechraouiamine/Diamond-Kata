package com.arolla.diamond;

import com.arolla.diamond.Diamond;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aminebechraoui, on 08/02/2021, in PACKAGE_NAME
 */
public class DiamondTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void beforeTests() throws IOException {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void afterTests() {
        System.setOut(originalOut);
        System.out.print(outContent);
    }

    @Test
    void should_return_a_when_a_is_submitted() {
        // Given
        Diamond diamond = new Diamond('A');

        // When
        diamond.print();

        // Then
        assertEquals("A", outContent.toString());
    }

    @Test
    void should_return_abba_when_b_is_submitted() {
        // Given
        Diamond diamond = new Diamond('B');

        // When
        diamond.print();

        // Then
        assertEquals(" A \nB B\n A ", outContent.toString());
    }

    @Test
    void should_return_c_diamond_when_c_is_submitted() {
        // Given
        Diamond diamond = new Diamond('C');

        // When
        diamond.print();

        // Then
        assertEquals("  A  \n B B \nC   C\n B B \n  A  \n", outContent.toString());
    }

    @Test
    void should_return_d_diamond_when_d_is_submitted() {
        // Given
        Diamond diamond = new Diamond('D');

        // When
        diamond.print();

        // Then
        assertEquals("   A   \n  B B  \n C   C \nD     D\n C   C \n  B B  \n   A   \n", outContent.toString());
    }

    @Test
    void should_return_d_diamond_when_lower_case_d_is_submitted() {
        // Given
        Diamond diamond = new Diamond('d');

        // When
        diamond.print();

        // Then
        assertEquals("   A   \n  B B  \n C   C \nD     D\n C   C \n  B B  \n   A   \n", outContent.toString());
    }

    @Test
    void should_return_z_diamond_when_z_is_submitted() {
        // Given
        Diamond diamond = new Diamond('Z');

        // When
        diamond.print();

        // Then
        assertEquals("                         A                         \n" +
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
                "                         A                         \n",
                outContent.toString());
    }

    @Test
    void should_return_the_3rd_line_of_Z_diamond() {
        // Given
        Diamond diamond = new Diamond('Z');

        // When
        Line line = diamond.buildLine(3);

        // Then
        assertEquals("                       C   C                       \n", line.getStringValue());

    }

    @Test
    void should_return_the_4th_line_of_Z_diamond() {
        // Given
        Diamond diamond = new Diamond('Z');

        // When
        Line line = diamond.buildLine(4);

        // Then
        assertEquals("                      D     D                      \n", line.getStringValue());

    }

}
