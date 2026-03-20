package com.company.search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[103];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = i;
        }
        int x = 55;
        System.out.println(binarySearch(arr, x));
    }
    public static boolean binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == x) return true;
            if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    // Variation 1: Find First Occurrence , array is sorted in non-decreasing order and include duplicate elements
    public static int findFirstOccurrence(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                result = mid; // Store the index of the found element
                high = mid - 1; // Continue searching in the left half
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result; // Returns -1 if not found, otherwise returns the index of the first occurrence
    }

    // Variation 2: Find Last Occurrence
    int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;      // record this position
                low = mid + 1;     // keep searching RIGHT for later occurrence
            }
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return result;
    }

    //Variation 3: Find Floor (Largest element ≤ target)
    int floor(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return arr[mid];
            else if (arr[mid] < target) {
                result = arr[mid];     // candidate for floor
                low = mid + 1;         // try to find something closer
            }
            else high = mid - 1;
        }
        return result;
    }
    // Variation 4: Find Ceiling (Smallest element ≥ target)
    int ceiling(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return arr[mid];
            else if (arr[mid] > target) {
                result = arr[mid];     // candidate for ceiling
                high = mid - 1;        // try to find something closer
            }
            else low = mid + 1;
        }
        return result;
    }
    // Variation 5: Search in Rotated Sorted Array
    int searchRotated(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;

            // left half is sorted
            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target < arr[mid])
                    high = mid - 1;   // target in left half
                else
                    low = mid + 1;    // target in right half
            }
            // right half is sorted
            else {
                if (target > arr[mid] && target <= arr[high])
                    low = mid + 1;    // target in right half
                else
                    high = mid - 1;   // target in left half
            }
        }
        return -1;
    }

    // Variation 6: Find Peak Element
    int findPeak(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[mid + 1])
                high = mid;       // peak is on left side (including mid)
            else
                low = mid + 1;    // peak is on right side
        }
        return low; // low == high == peak index
    }

    // Variation 7: Binary Search on Answer
    // Example:** Find minimum capacity to ship packages in D days.
//    weights = [1,2,3,4,5,6,7,8,9,10], D = 5
//
//    Search space: capacity between max(weights)=10 and sum(weights)=55
//    Binary search on capacity → find minimum that works
    int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt(); // min possible
        int high = Arrays.stream(weights).sum();            // max possible

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canShip(weights, days, mid))
                high = mid;        // try smaller capacity
            else
                low = mid + 1;     // need more capacity
        }
        return low;
    }

    boolean canShip(int[] weights, int days, int capacity) {
        int daysNeeded = 1, currentLoad = 0;
        for (int w : weights) {
            if (currentLoad + w > capacity) {
                daysNeeded++;
                currentLoad = 0;
            }
            currentLoad += w;
        }
        return daysNeeded <= days;
    }
}
