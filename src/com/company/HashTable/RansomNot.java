package com.company.HashTable;

public class RansomNot {
    public static void main(String[] args) {

    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        int[] magazineArr = new int[26];
        for (char c : magazine.toCharArray()) {
            magazineArr[c - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (magazineArr[ransomNote.charAt(i) - 'a'] == 0) {
                return false;
            } else {
                magazineArr[ransomNote.charAt(i) - 'a']--;
            }
        }
        return true;
    }
}
