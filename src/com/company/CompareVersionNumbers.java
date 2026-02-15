package com.company;

public class CompareVersionNumbers {
    public static void main(String[] args) {
        System.out.println(new CompareVersionNumbers().compareVersion("1.01", "1.001"));
        System.out.println(new CompareVersionNumbers().compareVersion("1.1", "1.10"));
        System.out.println(new CompareVersionNumbers().compareVersion("1.2", "1.10"));
        System.out.println(new CompareVersionNumbers().compareVersion("1.0", "1.0.0.0"));
        System.out.println(new CompareVersionNumbers().compareVersion("1.2", "1.0.0.0"));
    }

    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int length = Math.max(v1.length, v2.length);
        for (int i = 0; i < length; i++) {
            int v1Num = 0;
            int v2Num = 0;
            if (i < v1.length) {
                v1Num = Integer.parseInt(v1[i]);
            } else {
                v1Num = 0;
            }

            if (i < v2.length) {
                v2Num = Integer.parseInt(v2[i]);
            } else {
                v2Num = 0;
            }
            if (v1Num > v2Num) {
                return 1;
            }
            if (v1Num < v2Num) {
                return -1;
            }
        }
        return 0;
    }

}
