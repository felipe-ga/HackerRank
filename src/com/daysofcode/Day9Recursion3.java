/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daysofcode;

/**
 *
 * @author AN-N
 */
public class Day9Recursion3 {
    
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * Day9Recursion3.factorial(n-1);
    }
    
    public static void main(String arg[]){
        int result = Day9Recursion3.factorial(3);
        System.out.println(result);
    }
}
