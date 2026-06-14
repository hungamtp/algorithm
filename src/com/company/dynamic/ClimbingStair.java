package com.company.dynamic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClimbingStair {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println(climbStairsWithMemory(4000,map));
        System.out.println(climbStairs(40));
        System.out.println(climbStairTabulation(40));

    }

    public static int climbStairsWithMemory(int n, HashMap<Integer, Integer> map) {

        if (map.containsKey(n)) {
            return map.get(n);
        }
        if (n == 1 || n == 2) {
            return n;
        }
        //memorize
        int result = climbStairsWithMemory(n - 1, map) + climbStairsWithMemory(n - 2, map);
        if (result < 100) {
            map.put(n, result);
        }
        return result;
    }
    public static int climbStairs(int n) {

        if (n == 1 || n == 2) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
    public static int climbStairTabulation(int n){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        for (int i = 3; i <= n; i++) {
            list.add(list.get(i - 2) + list.get(i - 3));
        }
        return list.get(n-1);
    }
}
