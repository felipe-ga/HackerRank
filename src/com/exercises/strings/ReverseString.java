/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercises.strings;

/**
 *
 * @author Felipe Galindo
 */
/*
Build a function that reverses the given string.
example 
Given "Hello world", that function should return "dlrow olleH"
*/
public class ReverseString {
    public static String reverse(String statement){
        StringBuilder result = new StringBuilder();
        for (int i = statement.length()-1; i >= 0; i--) {
            result.append(statement.charAt(i));
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String statement = "Hello world";
        System.out.println(reverse(statement));
    }
}
