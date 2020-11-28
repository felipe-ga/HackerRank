/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daysofcode;

/**
 *
 * @author anonimo
 */
public class Day20Sorting {
    public static void main(String[] args) {
        
        int[] a = {3,2,1};
        // Write Your Code Here
        int count = 0;
        int len = a.length;
        for(int i = 0;i < len;i++){
            for(int j = 0;j < len - i - 1;j++){
                if(a[j] > a[j+1]){
                    int swap = a[j];
                    a[j] = a[j+1];
                    a[j + 1] = swap;
                    count++;
                }
            }
        }
        System.out.println("Array is sorted in "+count+" swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[len-1]);
    }
}
