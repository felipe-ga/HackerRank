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
public class Day1DataTypes {
    public static void main(String arg[]){
        int iEntero = 12;
        float dDecimal = 4.0f;
        String sString = "is the best place to learn and practice coding!";
        
        int i = 4;
        float d = 4.0f;
        String s = "HackerRank ";

        iEntero = 12;
        dDecimal = 4.0f;
        sString = "is the best place to learn and practice coding!";
        /* Print the sum of both integer variables on a new line. */
        int sum = iEntero + i;
        System.out.println(sum);
        /* Print the sum of the double variables on a new line. */
		float fSum = dDecimal + (float)d;
        System.out.println(fSum);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        String concatenate = s + sString;
        System.out.println(concatenate);
    }
}
