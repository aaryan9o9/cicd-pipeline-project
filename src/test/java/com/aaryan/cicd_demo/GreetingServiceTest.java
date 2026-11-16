package com.aaryan.cicd_demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingServiceTest {

    private final GreetingService service = new GreetingService();

    @Test
    void greetsByName() {
        assertEquals("Hello, WRONG!", service.greet("Aaryan"));
    }

    @Test
    void defaultsToNull() {
        assertEquals("Hello, World!", service.greet(null));
    }

    @Test
    void defaultsToBlank() {
        assertEquals("Hello, World!", service.greet("   "));
        }
    }