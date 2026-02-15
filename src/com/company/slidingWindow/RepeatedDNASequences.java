package com.company.slidingWindow;

import java.util.*;

public class RepeatedDNASequences {
    public static void main(String[] args) {
        System.out.println(findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
        System.out.println(findRepeatedDnaSequences("AAAAAAAAAAAAA"));
        System.out.println(findRepeatedDnaSequences("AAAAAAAAAAA"));
        System.out.println(findRepeatedDnaSequences("CAAAAAAAAAC"));
    }

    public static List<String> findRepeatedDnaSequences(String s) {
        if (s.length() < 10) {
            return List.of();
        }
        Map<String, Integer> set = new HashMap<>();
        List<String> res = new ArrayList<>();
        set.put(s.substring(0, 10), 1);
        for (int i = 10; i < s.length(); i++) {
            String current = s.substring(i - 9, i+1);
            if (set.containsKey(current)) {
                if (set.get(current) < 2) {
                    res.add(current);
                }
                set.put(current, set.getOrDefault(current, 0) + 1);
            } else {
                set.put(current, set.getOrDefault(current, 0) + 1);
            }

        }
        return res;

    }
}
