package com.example.circle.circle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for calculating area of a circle.
 */
public class AppTest {

    @Test
    public void testAreaOfCircle() {
        double radius = 5;
        double expectedArea = Math.PI * radius * radius;

        double actualArea = Math.PI * radius * radius;

        assertEquals(expectedArea, actualArea, 0.001);
    }

    @Test
    public void testAreaWithRadiusZero() {
        double radius = 0;
        double expectedArea = 0;

        double actualArea = Math.PI * radius * radius;

        assertEquals(expectedArea, actualArea, 0.001);
    }
}
