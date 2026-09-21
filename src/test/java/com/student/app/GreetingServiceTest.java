package com.student.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceTest {
    private GreetingService service;

    @BeforeEach
    void setup() {
        service = new GreetingService();
    }

    @Test
    @DisplayName("Greeting should contain the student's roll number")
    void greetingContainsRollNumber() {
        assertTrue(service.getGreeting().contains("Roll No"));
    }

    @Test
    @DisplayName("Version should never be empty")
    void versionIsNotEmpty() {
        assertNotNull(service.getVersion());
        assertFalse(service.getVersion().isEmpty());
    }

    @Test
    @DisplayName("Addition should work for positive numbers")
    void addPositiveNumbers() {
        assertEquals(9, service.add(4, 5));
    }

    @Test
    @DisplayName("Addition should work for negative numbers")
    void addNegativeNumbers() {
        assertEquals(-3, service.add(-1, -2));
    }
}
