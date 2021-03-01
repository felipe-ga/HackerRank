/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercises.strings;

import java.util.regex.Pattern;

/**
 *
 * @author Felipe Galindo
 */
/*
    Build a function that, given a string, sum all the digits that appear in the string
    */
    /*
    Example:
    given "I turn 41 in 9 months", the function should return "50"
    given "Hello word", the function should return 0
    */
public class SumDigits {
    public static int sumAllDigitsOfAString(String statement){
        int sum = 0;
        String[] tokens = statement.split(" ");
        for(String token : tokens){
            if(Pattern.compile("[0-9*]").matcher(token).find()){
                sum += Integer.parseInt(token);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String statement = "Hello word";
        System.out.println(sumAllDigitsOfAString(statement));
    }
}
