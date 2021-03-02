/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview.sorting;

/**
 *
 * @author Felipe Galindo
 */
public class SortingBubbleSort {
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    static void countSwaps(int[] array) {
        int len = array.length;
        int countSwap = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if(array[j] > array[j+1]){
                    int swap = array[j];
                    array[j] = array[j+1];
                    array[j+1] = swap;
                    countSwap++;
                }
                printArray(array);
            }
        }
        System.out.println(String.format("Array is sorted in %d swaps.",countSwap));
        System.out.println(String.format("First Element: %d",array[0]));
        System.out.println(String.format("Last Element: %d",array[len-1]));
        
    }
    public static void main(String[] args) {
        int[] array = {1,4,3,2,6,5,2,3,4};
        countSwaps(array);
    }
}
