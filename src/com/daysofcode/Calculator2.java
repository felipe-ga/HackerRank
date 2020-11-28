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
public class Calculator2 implements AdvancedArithmetic{
    public int divisorSum(int n) {
        int sum = 0;
        for(int i = 1;i <= n;i++){
            if((n % i) == 0){
                sum += i;
            }
        }
        return sum;
    }
}
