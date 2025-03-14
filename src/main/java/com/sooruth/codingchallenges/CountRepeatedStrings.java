package com.sooruth.codingchallenges;

import java.util.HashSet;

/**
 * Count how many Strings are repeated in a String array
 */
class CountRepeatedStrings {
    public static void main(String[] args) {
        String[] stringsArray = {"eight", "eight", "eight", "one", "two",
                "three", "four", "three", "five", "six", "seven", "eight", "nine", "two"};

        int count = 0;
        HashSet<String> hashSet = new HashSet<>();

        for (String element : stringsArray) {
            if (!hashSet.add(element)) {
                count++;
            }
        }
        System.out.println(count + " Strings were repeated in the String array");
    }
}