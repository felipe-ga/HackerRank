/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author anonimo
 */
public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
        int count = 0;
        int max = 0;
        for(Integer value : candles){
            if(value > max){
                max = value;
                count = 1;
            }else if(value == max){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(4);
        list.add(1);
        list.add(3);
        System.out.println(birthdayCakeCandles(list));
    }
}
