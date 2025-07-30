package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    @Test
    void testReverseRegular() {
        assertEquals("cba", StringUtil.reverse("abc"));
    }

    @Test
    void testReverseEmpty() {
        assertEquals("", StringUtil.reverse(""));
    }

    @Test
    void testReverseNull() {
        assertNull(StringUtil.reverse(null));
    }
}
