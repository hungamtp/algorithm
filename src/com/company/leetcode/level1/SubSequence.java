package com.company.leetcode.level1;

//https://leetcode.com/problems/is-subsequence/?envType=study-plan&id=level-1
public class SubSequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        int currentIndex = 0;
        if(s.length() ==0) return true;
        if(t.length() ==0) return false;
        for (int i = 0; i < t.length(); i++) {

            if(t.charAt(i) == s.charAt(currentIndex)){
                currentIndex ++;
            }
            if(currentIndex == s.length()){
                return true;
            }
        }

        return false;
    }
}
