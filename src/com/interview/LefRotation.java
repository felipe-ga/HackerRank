/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview;

/**
 *
 * @author anonimo
 */
public class LefRotation {
     public static void main(String[] args) {
         int[] array = {1,2,3,4,5};
         int noRotation = 2;
         for(int i = 0;i < noRotation;i++){
             int temp = array[0];
             for(int j = 0;j < array.length-1;j++){
                 array[j] = array[j+1];
             }
             array[array.length-1] = temp;
              
         }
         
         for(int i = 0;i< array.length;i++){
             System.out.print(array[i] + " ");
         }
         
     }
}
