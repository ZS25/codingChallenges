package com.sooruth.codingchallenges;

import java.util.Scanner;

/**
 * Given the number of branches, create a simple Christmas tree
 */
class ChristmasTree {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of branches for your christmas tree: ");
        int branches = in.nextInt();

        int lines = branches;
        int starsToPrint = 1;
        while (lines > 0) {
            for(int spacesToPrint = lines; spacesToPrint > 0; spacesToPrint--) {
                System.out.print(" ");
            }
            for(int star = 0; star < starsToPrint; star++) {
                System.out.print("*");
            }

            for(int star = 0; star < starsToPrint-1; star++) {
                System.out.print("*");
            }

            System.out.println();
            starsToPrint++;
            lines--;
        }
        if(lines == 0){
            for(int spacesToPrint = branches; spacesToPrint > 0; spacesToPrint--) {
                System.out.print(" ");
            }
            System.out.println("^");
        }
    }
}