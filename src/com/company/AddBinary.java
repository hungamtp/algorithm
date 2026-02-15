package com.company;

import java.util.HashMap;

public class AddBinary {
    public static void main(String[] args) {

    }

    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int reminder = 0;
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            if (i >= 0) {
                sum += a.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
            }
            sb.append((sum + reminder) % 2);
            reminder = (sum + reminder) / 2;
            sum = 0;
            i--;
            j--;
        }
        if (reminder == 1) {
            sb.append(1);
        }
        i = 0;
        j = sb.length() - 1;
        while (i < j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        return sb.toString();

    }
}
