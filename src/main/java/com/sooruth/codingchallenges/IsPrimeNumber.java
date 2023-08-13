package com.sooruth.codingchallenges;

import java.math.BigInteger;
import java.util.Scanner;

//checks if the number entered on console is a prime number
class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Please enter a number to check if it is a Prime number: ");
        int number = scann.nextInt();

        BigInteger bigInteger = BigInteger.valueOf(number); //because isProbablePrime is an instance method

        if(bigInteger.isProbablePrime(number)){
            System.out.println(number + " is a Prime number!");
        }
        else {
            System.out.println(number + " is NOT a Prime number!");

        }
    }
}