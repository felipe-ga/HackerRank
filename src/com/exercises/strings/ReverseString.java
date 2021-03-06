package com.exercises.strings;

/**
 * Function that reverses the given string.
 * @author Felipe Galindo
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
