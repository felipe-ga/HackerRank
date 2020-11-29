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
public class Day21Generics {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number");
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Give a number in the position ["+i+"]");
            intArray[i] = scanner.nextInt();
        }
        
       System.out.println("Give a number");
        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Give a string in the position["+i+"]");
            stringArray[i] = scanner.next();
        }
        
        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    } 
}
