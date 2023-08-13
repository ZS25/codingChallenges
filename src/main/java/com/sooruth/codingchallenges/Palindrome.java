package com.sooruth.codingchallenges;

import java.util.Scanner;

/**
 * Check if an input number is a Palindrome
 */
class Palindrome {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter your number to check if it is a Palindrome: ");
        String number = scann.next();

        int numberOfElementsToTraverse = number.length() / 2;
        boolean isPalindrome = false;
        for (int i = 0, j = number.length() - 1; i < numberOfElementsToTraverse && j > numberOfElementsToTraverse; i++, j--) {
            String frontElement = String.valueOf(number.charAt(i));
            String backElement = String.valueOf(number.charAt(j));

            if (frontElement.equals(backElement)) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("It is " + isPalindrome + " that the number " + number + " is a Palindrome.");
    }
}