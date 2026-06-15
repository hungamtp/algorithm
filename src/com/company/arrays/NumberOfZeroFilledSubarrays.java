package com.company.arrays;

public class NumberOfZeroFilledSubarrays {
    public long zeroFilledSubarray(int[] nums) {

        // n(n+1)/2
        long result =0;
        long zeroContinousCount =0;
        for (int i=0; i < nums.length; i++){
            if (nums[i]!= 0 ){
                if( zeroContinousCount!= 0){
                    result += zeroContinousCount* (zeroContinousCount+1)/2;
                    zeroContinousCount =0;
                }
            }else{
                zeroContinousCount++;
            }
        }
        if( zeroContinousCount!= 0){
            result += zeroContinousCount* (zeroContinousCount+1)/2;
        }
        return result;
    }
}
