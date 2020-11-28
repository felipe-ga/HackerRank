/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author anonimo
 */
public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int countVallet = 0;
        int limit = 0;
        for(int i = 0;i < steps;i++){
            if(path.charAt(i) == 'D'){
                limit--;
            }else{
                limit++;
            }
            if(limit == 0 && path.charAt(i) == 'U'){
                countVallet++;
            }
        }
        return countVallet;
    }
    
    public static void main(String[] args){
        String path = "DDUUDDUDUUUD";
        int steps = path.length();
        int result = countingValleys(steps, path);
        System.out.print(result);
     }
}
