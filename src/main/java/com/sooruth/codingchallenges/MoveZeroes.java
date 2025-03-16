package com.sooruth.codingchallenges;

import java.util.Arrays;

/**
 * Given an array nums of type Integer,move all 0's to the end of it while maintaining the relative order of non-zeroes.
 * Do not make a copy of the array.
 * Test data: Integer[] nums = {0,1,0,3,12};
 */
class MoveZeroes {
    public static void main(String[] args) {
        Integer[] nums = {0,1,0,3,12};

        for(int pos = 0; pos < nums.length; pos++) {

            if(nums[pos] == 0 && pos < nums.length-1){
                int temporaryPos = pos;
                for(int pos2 = pos+1; pos2 < nums.length; pos2++){
                    nums[temporaryPos] = nums[pos2];
                    temporaryPos++;

                    if(pos2 == nums.length-1){
                        nums[pos2]=0;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}