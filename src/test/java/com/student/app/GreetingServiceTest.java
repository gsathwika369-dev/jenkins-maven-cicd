package com.student.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GreetingServiceTest {

    @Test
    public void testGetGreeting() {
        GreetingService service = new GreetingService();
        String greeting = service.getGreeting();
        assertNotNull(greeting);
        assertTrue(greeting.contains("Deployed by"));
    }

    @Test
    public void testGetVersion() {
        GreetingService service = new GreetingService();
        assertEquals("1.0", service.getVersion());
    }

    @Test
    public void testAdd() {
        GreetingService service = new GreetingService();
        assertEquals(5, service.add(2, 3));
    }
}
