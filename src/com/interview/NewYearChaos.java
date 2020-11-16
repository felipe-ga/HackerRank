/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeArray.map;

/**
 *
 * @author anonimo
 */
public class NewYearChaos {
    static void minimumBribes(int[] q) {
        int countBribed = 0;
        int numfounded = 0;
        int countCoutic = q[q.length-1];
        for(int i = q.length-1;i > 0;i--){
            
            if(numfounded == q[i]){
                countCoutic++; 
            }
            
            if(countCoutic > 2){
                System.out.print("Too chaotic");
                return;
            }
            
            if (q[i] != i+1) {
                int swap = q[i];
                q[i-1] = q[i];
                q[i] = swap;
                numfounded = q[i];
                countCoutic++; 
                countBribed++;
            } 
        }   
        System.out.println(countBribed);
    }
    public static void main(String[] args) {
        int t = 1;
        for (int tItr = 0; tItr < t; tItr++) {
            int[] qItems = {2,1,5,3,4};
            //int[] qItems = {2,5,1,3,4};
            minimumBribes(qItems);
        }
    }
}
