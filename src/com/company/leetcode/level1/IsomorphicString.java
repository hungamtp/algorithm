package com.company.leetcode.level1;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/isomorphic-strings/?envType=study-plan&id=level-1
public class IsomorphicString {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("qwe", "asd"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("badc", "baba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> charMap = new HashMap<>();
        Map<Character, Character> charMap2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (charMap.containsKey(s.charAt(i))) {
                if (!charMap.get(s.charAt(i)).equals(t.charAt(i))) {
                    return false;
                }
            } else {
                charMap.put(s.charAt(i), t.charAt(i));
            }

            if (charMap2.containsKey(t.charAt(i))) {
                if (!charMap2.get(t.charAt(i)).equals(s.charAt(i))) {
                    return false;
                }
            } else {
                charMap2.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}
