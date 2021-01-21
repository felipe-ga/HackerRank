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
public class MinimumSwaps {
    static int minimumSwaps(int[] array) {
        int count = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]==i+1) continue;
            count++;
            int tmp = array[i];
            array[i] = array[tmp-1];
            array[tmp-1] = tmp;
            i--;
        }
        return count;
    }
    public static void main(String[] args) {
        int [] array = {4,3,1,2};
        int res = minimumSwaps(array);
        System.out.println(res);
    }
    
}
