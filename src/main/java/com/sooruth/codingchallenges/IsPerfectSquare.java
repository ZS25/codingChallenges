package com.sooruth.codingchallenges;

import java.math.BigInteger;
import java.util.Scanner;

//checks if the number entered on console is a perfect square
class IsPerfectSquare {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Please enter a number to check if it is a Perfect square number: ");
        int number = scann.nextInt();

        double squareRootResult = Math.sqrt(number); //if not perfect square, number will contain decimal

        if(squareRootResult - Math.floor(squareRootResult) == 0){
            System.out.println(number + " is a Perfect square number!");
        }
        else {
            System.out.println(number + " is NOT a Perfect square number!");
        }
    }
}