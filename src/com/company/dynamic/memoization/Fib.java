package com.company.dynamic.memoization;

import java.util.HashMap;
import java.util.Map;

public class Fib {
    public static Map<Integer, Integer> fibResult = new HashMap<>();

    public static void main(String[] args) {
        fibResult.put(8, 23);

        //System.out.println(fib(50));
        System.out.println(fib2(10));
    }

    public static int fib(int i) {
        if (fibResult.containsKey(i)) {
            return fibResult.get(i);
        } else {
            return fib(i - 1) + fib(i - 2);
        }
    }
    public static int fib2(int i){
        if (i <= 1) {
            return i;
        }
        return fib2(i - 1) + fib2(i - 2);
    }
}
