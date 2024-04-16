package com.example.sqrt;

public class MultiService {
    public int sqrtCeil (int num) {
       for (int i = 0; i <= num; i++) {
           if (i * i >= num) {
               return i;
           }
       }
       return 0;
    }
}
