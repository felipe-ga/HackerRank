/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daysofcode;

/**
 *
 * @author AN-N
 */
public class Day112DArrays {
    private final static int ZERO = 0;
    private final static int ONE = 1;
    private final static int TWO = 2;
    private final static int FOUR = 4;
    
    public static int maxHourGlasses(int [][] array){
        int maxHourGlass = array[ZERO][ZERO] + array[ZERO][ONE] + array[ZERO][TWO];
        maxHourGlass += array[ONE][ONE]+ array[TWO][ZERO] + array[TWO][ONE] + array[TWO][TWO];
        for(int i = ZERO; i < FOUR;i++){
            for(int j = ZERO; j < FOUR; j++){
                int sum = array[i][j] + array[i][j + ONE] + array[i][j + TWO];
                sum += array[i+ONE][j+ONE];
                sum += array[i+TWO][j] + array[i+TWO][j + ONE] + array[i+TWO][j + TWO];
                if(sum > maxHourGlass){
                    maxHourGlass = sum;
                }
            }
        }
        return maxHourGlass;
    } 
    
    
    public static void main(String[] args) {
        int [][] arr = {
            {1,1,1,0,0,0},
            {0,1,0,0,0,0},
            {1,1,1,0,0,0},
            {0,0,2,4,4,0},
            {0,0,0,2,0,0},
            {0,0,1,2,4,0}};
        int result = maxHourGlasses(arr);
        System.out.println(result);
    }
}
