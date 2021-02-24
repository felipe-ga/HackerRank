/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms;

/**
 *
 * @author AN-N
 */
public class InsertionPart2 {
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    static void insertionSort2(int n, int[] array) {
        for(int j = 0;j < n-1;j++){  
            if(array[j] < array[j+1]){
                printArray(array);
            }
            else{
                int swap = array[j + 1];
                array[j + 1] = array[j];
                array[j] = swap;
                for (int k = j; k > 0; k--) {
                    if(array[k] < array[k - 1]){
                        int swap2 = array[k];
                        array[k] = array[k - 1];
                        array[k - 1] = swap2;
                    }
                }
                printArray(array);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {8,7,6,5,4,3,2,1};
        insertionSort2(array.length,array);
    }
}
