package com.example.best;

public class App {
    public static  void main (String [] args) {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j <5; j++) {
                if (i * j >7) {
                System.out.println("Отдал в подъзде " + i + ", в квартиру " + j);
                }
            }
        }
        System.out.println("Вышли из цикла");
    }
}
