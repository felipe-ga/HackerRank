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
        for(int i = q.length-1;i > 0;i--){
            
            //System.out.println("q[i] "+q[i]);
            //System.out.println("j "+(i+2));
            /*if (q[i] != (i+1)) {
                int swap = q[i-1];
                q[i] = q[i-1];
                q[i-1] = swap;
                countBribed++;
            }else if(q[i] == (i + 2)){
                System.out.println("Too chaotic");
                return;
            }
            for(int d = 0; d < q.length;d++){
                System.out.print(q[d] + " ");
            }*/
            System.out.println();
        }   
        System.out.println(countBribed);
    }
    /*
    static void minimumBribes(int[] q) {
        int countBribed = 0;
        for(int i = q.length-1;i > 0;i--){
            int num = i+3;
            System.out.println("q[i] "+q[i]);
            System.out.println("j "+(i+2));
            if (q[i] != (i+1)) {
                int swap = q[i-1];
                q[i] = q[i-1];
                q[i-1] = swap;
                countBribed++;
            }else if(q[i] == (i + 2)){
                System.out.println("Too chaotic");
                return;
            }
            for(int d = 0; d < q.length;d++){
                System.out.print(q[d] + " ");
            }
            System.out.println();
        }   
        System.out.println(countBribed);
    }*/
    public static void main(String[] args) {
        int t = 1;
        for (int tItr = 0; tItr < t; tItr++) {
            //int[] qItems = {2,1,5,3,4};
            int[] qItems = {2,5,1,3,4};
            minimumBribes(qItems);
        }
    }
}
