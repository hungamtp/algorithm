package com.company.slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC","ABC"));
    }

    public static String minWindow(String s, String t) {

        // find first letter
        // till last
        // if fulfill all
        // sliding
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i <= s.length() - t.length(); i++) {

        }
        return "";
    }
}
