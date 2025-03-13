package com.sooruth.codingchallenges;

import java.util.Arrays;
import java.util.List;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one.  Find that single one
 */
class FindOneAttempt2 {
    public static void main(String[] args) {Integer[] nums = new Integer[]{1, 2, 9, 3, 4, 5, 6, 7, 8, 3, 1, 5, 6, 9, 4, 2, 7};

        List<Integer> list = Arrays.asList(nums);

        for (int i = 0; i < nums.length; i++) {
            Integer element = nums[i];
            int index = list.indexOf(element);
            int index2 = list.lastIndexOf(element);

            if (index2 == index){
                System.out.println("The single one is:" + element);
            }
        }
    }
}