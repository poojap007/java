package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilTest {
    @Test
    void testValidDivision() {
        assertEquals(5, MathUtil.divide(10, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> MathUtil.divide(5, 0));
    }
}
