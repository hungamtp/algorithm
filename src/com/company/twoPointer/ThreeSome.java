package com.company.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ThreeSome {
    public static void main(String[] args) {
//        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
//        System.out.println(threeSum(new int[]{0, 0, 0}));
//        System.out.println(threeSum(new int[]{0, 0, 0, 0}));
        System.out.println(threeSum(new int[]{2,-3,0,-2,-5,-5,-4,1,2,-2,2,0,2,-4,5,5,-10}));
        //System.out.println(removeDuplicateNumber(new int[]{1, 2,2,2, 3, 4, 5,5}));
    }

    public static boolean isDuplicate(List<Integer> arr1, List<Integer> arr2) {
        for (int i = 0; i < arr1.size(); i++) {
            if (!Objects.equals(arr1.get(i), arr2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        if (nums.length < 3) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        int currentTarget = 0;
        int left = 0;
        int right;
        int currentSum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            currentTarget = -nums[i];
            left = i + 1;
            right = nums.length - 1;
            while (left < right) {
                currentSum = nums[left] + nums[right];
                if (currentTarget == currentSum) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    result.add(list);
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (currentSum < currentTarget) {
                    left++;
                } else {
                    right--;
                }

            }
        }
        return result;
    }


    public static List<Integer> removeDuplicateNumber(int[] nums) {
        List<Integer> distinceListNumber = new ArrayList<>();
        distinceListNumber.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != distinceListNumber.get(distinceListNumber.size() - 1)) {
                distinceListNumber.add(nums[i]);
            }
        }
        return distinceListNumber;
    }
}
