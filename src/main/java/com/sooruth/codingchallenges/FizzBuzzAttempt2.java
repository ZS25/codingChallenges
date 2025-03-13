package com.sooruth.codingchallenges;

import java.util.Scanner;

/**
 * Write a program that outputs the string representation of numbers from 1 to n.  Instead of the number, for multiples
 * of 3, it should print "Fizz", for multiples of 5 it should print "Buzz" and for both it should print "FizzBuzz".
 */
class FizzBuzzAttempt2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();

        int counter = 1;

        while(counter <= number) {
            if(counter % 3 == 0 && counter % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if(counter % 3 == 0) {
                System.out.println("Fizz");
            }
            else if(counter % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(counter);
            }
            counter++;
        }
    }
}