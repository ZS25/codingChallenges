package com.sooruth.codingchallenges;

import java.util.Scanner;

/**
 * Write a program that outputs the string representation of numbers from 1 to n.  Instead of the number, for multiples
 * of 3, it should print "Fizz", for multiples of 5 it should print "Buzz" and for both it should print "FizzBuzz".
 */
class FizzBuzz {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scann.nextInt();

        for(int i = 1; i <= number; i++){
            if(i % 3 == 0 && i % 5 ==0){
                System.out.print("FizzBuzz");
            }
            else if (i % 3 ==0){
                System.out.print("Fizz");
            }
            else if(i % 5 == 0 ){
                System.out.print("Buzz");
            }
            else {
                System.out.print(i);
            }
        }

    }
}