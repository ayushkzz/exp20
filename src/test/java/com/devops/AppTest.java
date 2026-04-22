package com.devops;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    App app = new App();

    @Test
    public void testGreet() {
        assertEquals("CI/CD Pipeline Successful", app.greet());
    }
}
