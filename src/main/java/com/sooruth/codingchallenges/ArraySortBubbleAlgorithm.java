package com.sooruth.codingchallenges;

import java.util.Random;

/**
 * Sort an array which has 10 random int numbers
 */
class ArraySortBubbleAlgorithm {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        // Fill the array with 10 random ints
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Generate random numbers between 0 and 99
        }

        System.out.println("Array before sorting:");
        printArray(array);

        // Sort the array using bubble sort algorithms
        array = bubbleSort(array);

        System.out.println("Array after sorting:");
        printArray(array);
    }

    private static int[] bubbleSort(int[] array) {
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            for (int firstPosition = 0; firstPosition < arrayLength - 1; firstPosition++) {
                int nextPosition = firstPosition + 1;
                if(nextPosition == arrayLength){
                    break;
                }
                if (array[nextPosition] < array[firstPosition]) {
                    int nextElement = array[nextPosition];
                    array[nextPosition] = array[firstPosition];
                    array[firstPosition] = nextElement;
                }
            }
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}