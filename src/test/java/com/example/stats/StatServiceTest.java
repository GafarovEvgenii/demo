package com.example.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatServiceTest {

    @Test
    void shouldCalcSum() {
        StatService service = new StatService();
        int [] managerSales = { 10, 80, 13, 27, 51, 19};
        int expected = 200;

        int actual = service.calcSum(managerSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMax() {
        StatService service = new StatService();
        int [] managerSales = { 10, 80, 13, 27, 51, 19};
        int expected = 80;

        int actual = service.findMax(managerSales);

        assertEquals(expected, actual);
    }
}