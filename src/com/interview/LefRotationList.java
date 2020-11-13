/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anonimo
 */
public class LefRotationList {
    public static void main(String arg[]){
        int noRotation = 2;
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(0, 1);
        array.add(1, 2);
        array.add(2, 3);
        array.add(3, 4);
        array.add(4, 5);
        int dimension = array.size();
        for(int i = 0;i < noRotation;i++){
             int temp = array.get(0);
             array.remove(0);
             array.add(dimension - 1, temp);
              
         }
         
         for(Integer i : array){
             System.out.print(i + " ");
         }
    }
    
}
