package com.sooruth.codingchallenges;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Find the factorial of a number
 */
class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = in.nextInt();

        int result = 1;
        for (int i = number; i > 1; i--) {
            result = result * i;
        }
        System.out.println("Factorial of " + number + " is " + result);

    }
}