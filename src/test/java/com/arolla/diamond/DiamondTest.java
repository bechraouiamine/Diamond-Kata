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
        Diamond diamond = new Diamond("A");

        // When
        diamond.print();

        // Then
        assertEquals("A", outContent.toString());
    }

    @Test
    void should_return_abba_when_b_is_submitted() {
        // Given
        Diamond diamond = new Diamond("B");

        // When
        diamond.print();

        // Then
        assertEquals(" A \nB B\n A ", outContent.toString());
    }

    @Test
    void should_return_c_diamond_when_c_is_submitted() {
        // Given
        Diamond diamond = new Diamond("C");

        // When
        diamond.print();

        // Then
        assertEquals("  A  \n B B \nC   C\n B B \n  A  \n", outContent.toString());
    }

    @Test
    void should_return_d_diamond_when_d_is_submitted() {
        // Given
        Diamond diamond = new Diamond("D");

        // When
        diamond.print();

        // Then
        assertEquals("   A   \n  B B  \n C   C \nD     D\n C   C \n  B B  \n   A   \n", outContent.toString());
    }

    @Test
    void should_return_d_diamond_when_lower_case_d_is_submitted() {
        // Given
        Diamond diamond = new Diamond("d");

        // When
        diamond.print();

        // Then
        assertEquals("   A   \n  B B  \n C   C \nD     D\n C   C \n  B B  \n   A   \n", outContent.toString());
    }
}
