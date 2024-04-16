package com.example.stats;

public class StatService {
    public int calcSum (int [] sales) {
        int sum =0;
        for (int sale : sales) {
            sum += sale;
        }
        return  sum;
    }

    public int findAvg (int [] sales) {
        return calcSum(sales) / sales.length;
    }
    public int findMax (int [] sales) {
      int currentMax = sales[0];
      for (int sale : sales) {
        if (sale > currentMax) {
          currentMax = sale;
      }
    }
        return currentMax;
    }
}
