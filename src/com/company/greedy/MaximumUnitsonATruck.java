package com.company.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumUnitsonATruck {
    public static void main(String[] args) {
        System.out.println(maximumUnits(new int[][]{{1, 3}, {2, 2}, {3, 1}}, 4));
    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        int capacity = truckSize ;
        int result =0;
        Arrays.sort(boxTypes, new ItemComparator());
        for (int i = 0; i < boxTypes.length; i++) {
            if (capacity >= boxTypes[i][0]) {
                result += boxTypes[i][1] * boxTypes[i][0];
                capacity -= boxTypes[i][0];
            } else {
                result += capacity * boxTypes[i][1];
                break;
            }
        }
        return result;
    }

    static class ItemComparator implements Comparator<int[]> {
        public int compare(int[] a, int[] b) {
            return Integer.compare(b[1],a[1]);
        }
    }
}
