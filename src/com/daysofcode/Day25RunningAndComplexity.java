/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daysofcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author anonimo
 */
public class Day25RunningAndComplexity {
    private static final String PATH = "//src//com//daysofcode//test//Day25//";
    
    public static boolean calculatePrime(int a){
        boolean isPrime = true;
        int count = 0;
        if(a == 1){
            return false;
        }else if(a == 2){
            return true;
        }else if(a % 2 == 0){
            return false;
        }else{
            int sqrt =(int) Math.sqrt((double)a);
            for(int j=3; j <= sqrt; j = j + 2){
                if(a % j == 0){
                    count++;
                }
            }
            if(count == 0){
                return true;
            }else{
                return false;
            }
        }  
    }
    
    public static void main(String args[]) throws FileNotFoundException {
        File text = new File("");
        String url  = text.getAbsolutePath().concat(PATH).concat("input00.txt");
        Scanner in= new Scanner(new File(url));
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(int i=0; i < a.length; i++){
            if(calculatePrime(a[i])){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            } 
        } 
    }
}
