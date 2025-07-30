package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoginServiceTest {
    LoginService service = new LoginService();

    @Test
    void testValidLogin() {
        assertTrue(service.validate("admin", "1234"));
    }

    @Test
    void testInvalidLogin() {
        assertFalse(service.validate("admin", "wrong"));
    }

    @Test
    void testNullOrEmpty() {
        assertFalse(service.validate(null, "1234"));
        assertFalse(service.validate("admin", null));
        assertFalse(service.validate("", ""));
    }
}
