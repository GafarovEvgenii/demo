package com.example.sqrt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiServiceTest {

    @Test
    void shouldSqrtCeil() {
        MultiService multiService = new MultiService();
        int number = 9;
        int expected = 3;
        int actual = multiService.sqrtCeil(number);
        assertEquals(expected, actual);
    }
}