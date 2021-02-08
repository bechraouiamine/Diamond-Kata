package com.arolla.diamond;

import com.arolla.diamond.Diamond;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aminebechraoui, on 08/02/2021, in PACKAGE_NAME
 */
public class DiamondTest {
    @Test
    void should_return_a_when_a_is_submitted() {
        // Given
        Diamond diamond;

        // When
        diamond = new Diamond("A");

        // Then
        assertEquals("A", diamond.print());
    }

    @Test
    void should_return_abba_when_b_is_submitted() {
        // Given
        Diamond diamond;

        // When
        diamond = new Diamond("B");

        // Then
        assertEquals(" A \nB B\n A ", diamond.print());
    }

}
