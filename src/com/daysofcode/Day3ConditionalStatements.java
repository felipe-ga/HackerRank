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
public class Day3ConditionalStatements {
    public static void main(String arg[]){
        int N = 4;
        int residuo = N % 2;
        if(residuo > 0){
            System.out.println("Weird");
        }else if(N >= 2 && N <= 5){
            System.out.println("Not Weird");
        }else if(N >= 6 && N <= 20){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird ");
        }
    }
}
