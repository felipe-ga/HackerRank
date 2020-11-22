/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daysofcode;

import java.util.Scanner;

/**
 *
 * @author anonimo
 */
public class Day14Scope {
    public static void main(String arg[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a N:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Give a number:");
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

