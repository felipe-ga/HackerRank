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
public class Calculator {
    public int power(int base,int n)throws Exception{
        if(base < 0 || n < 0){
            throw new Exception("n and p should be non-negative"); 
        }
        return (int) Math.pow(base, n);
    }
}
