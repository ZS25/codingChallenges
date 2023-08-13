package com.sooruth.codingchallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one.  Find that single one
 */
class FindOne {
    public static void main(String[] args) {
        Integer[] nums = new Integer[]{1, 2, 9, 3, 4, 5, 6, 7, 8, 3, 1, 5, 6, 9, 4, 2, 7};

        List<Integer> integerList = new ArrayList<>(Arrays.asList(nums));
        
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];

            integerList.remove(Integer.valueOf(element));

            if (!integerList.contains(element)) {
                System.out.println("The non duplicated number is: " + element);
                return;
            }
        }
    }
}