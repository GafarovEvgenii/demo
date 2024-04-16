package com.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayFruitTest {

    @Test
    void shouldPrintFruits() {
        String apple = "Яблоко";
        String pear = "Груша";
        String pineapple = "Ананас";

        String [] fruits = {apple, pear, pineapple};

        ArrayFruit arrayFruit = new ArrayFruit();
        arrayFruit.printFruits(fruits);
    }
}