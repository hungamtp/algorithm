package com.company.HashTable;

import java.util.HashMap;
import java.util.Map;

public class FindPair {
    public static void main(String[] args) {
        System.out.println(findPair(new int[]{1, 2, 3, 4, 5}, new int[]{6, 7, 8, 9, 10}, 10));
    }

    public static String findPair(int[] arr, int[] arr2, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < arr.length;i++){
            map.put(arr[i], i);
        }
        for (int i = 0 ; i <arr2.length;i++){
            if (map.containsKey(sum-arr2[i])){
                return i + " " + map.get(sum - arr2[i]);
            }
        }
        return "-1";
    }
}
