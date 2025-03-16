package com.sooruth.codingchallenges;

/**
 * Given an array nums of type Integer, return true if any value appears at least twice in the array.
 * Return false if every element is distinct.
 * Test data1: Integer[] nums = {1,2,3,4,5,6,1,7,8,9};
 * Test data2: Integer[] nums = {1,2,3,4,5,6,7,8,9};
 */
class ContainsDuplicate {
    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5,6,7,8,9};

        boolean result = false;
        int secondPositionCounter = 1;
        OUTER_LOOP: for(int pos = 0; pos < nums.length-1; pos++){
            INNTER_LOOP: for(int pos2 = secondPositionCounter; pos2 < nums.length; pos2++){
                if(nums[pos].intValue() == nums[pos2].intValue()){
                    result = true;
                    System.out.println(result);
                    return;
                }
            }
            secondPositionCounter++;
        }
        System.out.println(result);
    }
}