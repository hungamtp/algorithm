package com.company.dynamic;

public class HouseRobber {
    public static void main(String[] args) {
        System.out.println(hsRobber(new int[]{1,2,3,1}));
    }

    public static int hsRobber(int[] n) {
        int firstPlace = n[0];
        int secondPlace = Math.max(firstPlace, n[1]);
        int temp =0;
        for (int i = 2; i < n.length; i++) {
            temp = Math.max(secondPlace, firstPlace + n[i]);
            firstPlace = secondPlace;
            secondPlace = temp;
        }
        return Math.max(firstPlace, secondPlace);
    }
}
