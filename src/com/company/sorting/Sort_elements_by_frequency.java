package com.company.sorting;

import java.util.HashMap;
import java.util.Map;

//
// https://www.geeksforgeeks.org/sort-elements-by-frequency/
public class Sort_elements_by_frequency {
    public static void main(String[] args) {
        int arr[] = {2, 5, 2, 8, 5, 6, 8, 8};
        solve(arr);
    }

    public static int[] solve(int[] numbers) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int x : numbers) {
            if (map.get(x) != null) {
                int currentCount = map.get(x);
                map.put(x, currentCount + 1);
            } else {
                map.put(x, 1);
            }
        }
        int[][] mapResult = new int[map.size()][2];
        int index = 0 ;
        for(var keySet :  map.keySet()){
            mapResult[index][0] = keySet;
            mapResult[index][1] = map.get(keySet);
            index ++;
        }
        for(int i = 0 ; i < mapResult.length ; i++){
            for(int j = i+1 ; j < mapResult.length ; j++){
                if(mapResult[i][1] < mapResult[j][1]){
                    int key = mapResult[i][0];
                    int count = mapResult[i][1];
                    mapResult[i][0] = mapResult[j][0];
                    mapResult[i][1] = mapResult[j][1];
                    mapResult[j][0] = key;
                    mapResult[j][1] = count;
                }
            }
        }
        index = 0;
        for (int i = 0 ; i < mapResult.length ; i++){
            for (int j = 0 ; j < mapResult[i][1] ; j++){
                numbers[index] = mapResult[i][0];
                index++;
            }
        }
        return numbers;
    }
}
