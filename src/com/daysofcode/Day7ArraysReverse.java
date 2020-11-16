/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daysofcode;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author AN-N
 */
public class Day7ArraysReverse {
    private static final Scanner scanner = new Scanner(System.in); 
    public static void reverse(int[] array){
        for(int i = array.length-1;i >= 0;i--){
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
       
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        reverse(arr);
        scanner.close(); 
     }
}
