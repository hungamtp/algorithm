package com.company.HashTable;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public static void main(String[] args) {
        System.out.println(isIsomorphicUsingCharArr("foo", "bar"));
        System.out.println(isIsomorphicUsingCharArr("add", "egg"));
        System.out.println(isIsomorphicUsingCharArr("badc", "baba"));


        // a = 97
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
    public static boolean isIsomorphicUsingCharArr(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sArr = new char[256];
        char[] tArr = new char[256];
        for (int i = 0; i < s.length(); i++) {
            if (sArr[s.charAt(i)] != 0) {
                if (sArr[s.charAt(i)] != t.charAt(i) ) {
                    return false;
                }
            }else{
                sArr[s.charAt(i)] = t.charAt(i);
            }

            if (tArr[t.charAt(i)] != 0) {
                if (tArr[t.charAt(i)] != s.charAt(i) ) {
                    return false;
                }
            }else{
                tArr[t.charAt(i)] = s.charAt(i);
            }
        }
        return true;
    }
}
