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

}
