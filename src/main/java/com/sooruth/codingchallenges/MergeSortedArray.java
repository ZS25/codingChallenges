package com.sooruth.codingchallenges;

import java.util.Arrays;

/**
 * Given two integer arrays num1 and num2, where m and n represent their sizes respectively, merge them into a single
 * sorted array.
 * num1 = [1,2,3,0,0,0] , m =3
 * num2 = [2,5,6] , n= 3
 * Output: [1,2,2,3,5,6]
 */
class MergeSortedArray {
    public static void main(String[] args) {

        int[] num1 = {1,2,3,0,0,0};
        int m = 3;

        int[] num2 = {2,5,6};
        int n=3;

        int i2=0;
        mergeArrays(num1, i2, num2);

        int position2 = 1;
        sortArrays(num1, position2);
        System.out.println(Arrays.toString(num1));
    }

    private static void sortArrays(int[] num1, int position2) {
        for(int pos1 = 0; pos1< num1.length-1; pos1++){
            for(int pos2 = position2; pos2 < num1.length; pos2++){
                int e1 = num1[pos1];
                int e2 = num1[pos2];

                if(e2 < e1){
                    num1[pos1] = e2;
                    num1[pos2] = e1;
                }
            }
            position2++;
        }
    }

    private static void mergeArrays(int[] num1, int i2, int[] num2) {
        for(int i1 = 0; i1 < num1.length; i1++){
            if(num1[i1] == 0 && i2 < num2.length){
                num1[i1] = num2[i2];
                i2++;
            }
        }
    }
}