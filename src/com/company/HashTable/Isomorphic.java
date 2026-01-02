package com.company.HashTable;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("add", "egg"));
        System.out.println(isIsomorphic("badc", "baba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (mapS.containsKey(s.charAt(i))) {
                if (mapS.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                mapS.put(s.charAt(i), t.charAt(i));
            }

            if (mapT.containsKey(t.charAt(i))) {
                if (mapT.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            } else {
                mapT.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}
