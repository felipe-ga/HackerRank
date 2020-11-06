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
public class ArrayDs {
    public static void main(String arg[]){
        int[] array = {1,4,3,2};
        int[] res = reverseArray(array);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
    
    public static int[] reverseArray(int[] array){
        //System.out.println(array.length);
        int[] b = new int[array.length];
        for(int i = b.length; i-1 > -1 ; i--){
            b[array.length - i] = array[i-1];
            /*if(i-1 > -1){
                b[array.length - i] = array[i-1];
            }*/
        }
        return b;
    }
}
