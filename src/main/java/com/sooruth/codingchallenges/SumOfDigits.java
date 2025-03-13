package com.sooruth.codingchallenges;

import java.util.Scanner;

/**
 * Find the sum of the digits of a number
 * Test data: 567890
 */
class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        String numbers = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < numbers.length(); i++) {
            sum += Integer.parseInt(numbers.charAt(i)+"");
        }
        System.out.println("Sum of the digits is: " + sum);

    }
}