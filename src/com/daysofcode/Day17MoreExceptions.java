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
public class Day17MoreExceptions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give a number:");
        int t = in.nextInt();
        while (t-- > 0) {
            System.out.println("Give a base:");
            int n = in.nextInt();
            System.out.println("Give a power:");
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
