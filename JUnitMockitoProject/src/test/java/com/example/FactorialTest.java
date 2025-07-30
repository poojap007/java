package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    void testValidFactorials() {
        assertEquals(1, Factorial.compute(0));
        assertEquals(1, Factorial.compute(1));
        assertEquals(120, Factorial.compute(5));
    }

    @Test
    void testNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.compute(-1));
    }
}
