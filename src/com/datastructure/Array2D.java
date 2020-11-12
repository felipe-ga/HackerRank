/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datastructure;

/**
 *
 * @author anonimo
 */
public class Array2D {
    public static void main(String arg[]){
        int [][] arr = {
            {1,1,1,0,0,0},
            {0,1,0,0,0,0},
            {1,1,1,0,0,0},
            {0,0,2,4,4,0},
            {0,0,0,2,0,0},
            {0,0,1,2,4,0}};
        int sumMax = 0;
        for(int i = 0;i <= 3;i++){
            for(int j = 0;j <= 3;j++){
                int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(i == 0 && j == 0){
                    sumMax = sum;
                }else{
                    if(sum > sumMax){
                        sumMax = sum;
                    }  
                }
            }
        }
        System.out.println(sumMax);
    }
}
