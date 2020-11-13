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
public class Day5Loops {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i = 1; i <= 10;i++){
            int value = n * i;
            System.out.println(n + " x " + i + " = "+ value);
        }
        scanner.close();
    }
}
