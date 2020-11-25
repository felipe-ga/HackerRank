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
public class SalesByMatch {
    public static void main(String arg[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] array = {1,1,3,1,2,1,3,3,3,3};
        int count = 0;
        for(int i = 0;i< array.length;i++){
            if(map.containsKey(array[i])){
                int value = map.get(array[i]);
                map.put(array[i],++value);
            }else{
                map.put(array[i],1);
            }
            System.out.println(map);
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) 
        {
            count += e.getValue() / 2;
        }
        System.out.println(count);
    }
}
