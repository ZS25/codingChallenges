package com.sooruth.codingchallenges;

import java.util.Arrays;

/**
 * Reverse a char array
 */
class ReverseString {
    public static void main(String[] args) {
        char[] arrayChar = new char[]{'a', 'b', 'c', 'd', 'e'};

        char[] reversedArray = new char[arrayChar.length];

        for (int i = arrayChar.length - 1, j=0; i >= 0; i--,j++) {
            reversedArray[j] = arrayChar[i];
        }
        System.out.println("The reversed array result is: " + Arrays.toString(reversedArray));
    }
}