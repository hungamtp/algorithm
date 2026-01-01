package com.company.string;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome1("A man, a plan, a canal: Panama"));


    }

    //
    public static boolean isPalindrome(String s) {
        char currentLeftChar = '}';
        char currentRightChar = '}';
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (s.isEmpty() || s.length() == 1) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {

            currentRightChar = s.charAt(right);
            currentLeftChar = s.charAt(left);
            if (currentLeftChar - currentRightChar != 0) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome1(String s) {

        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right &&!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right &&!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (!String.valueOf(s.charAt(left)).toLowerCase().equals(String.valueOf(s.charAt(right)).toLowerCase())) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}
