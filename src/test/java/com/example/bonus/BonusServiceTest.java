package com.example.bonus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    @ParameterizedTest
    @CsvSource (value = {"'registered user, bonus under limit', 100060, true, 30",
            "'registered user, bonus over limit', 100000060, true, 500"})
    void shouldCalculate(String name, int amount, boolean registered, int expected) {
        BonusService service = new BonusService();
        int actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

}