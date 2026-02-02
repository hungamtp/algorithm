package com.company.HashTable;

import java.util.*;

public class FirstNonRepeat {
    public static void main(String[] args) {
        System.out.println(firstNonRepeat("lleetcode"));
        System.out.println(firstNonRepeat("aabb"));
    }

    public static String firstNonRepeat(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return String.valueOf(entry.getKey());
            }
        }
        return "-1";
    }
}
