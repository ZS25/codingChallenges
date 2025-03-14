package com.sooruth.codingchallenges;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target
 * nums = [2,7,11,15], target = 9
 */
class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, 2};
        int target = 9;

        for (int firstPosition = 0; firstPosition < arr.length; firstPosition++) {
            for (int secondPosition = firstPosition + 1; secondPosition < arr.length; secondPosition++) {
                if (arr[firstPosition] + arr[secondPosition] == target) {
                    System.out.println(firstPosition+ " " + secondPosition);
                }
            }
        }
    }
}