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
public class Printer <T>{
    public static <T> void printArray(T[] array){
        for (T o : array) {
            System.out.println(o);
        }
    }
}
