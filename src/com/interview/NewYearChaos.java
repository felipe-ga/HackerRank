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
public class NewYearChaos {
    static void minimumBribes2(int[] q) {
        int bribe = 0;
        for(int i = 0;i < q.length-1;i++){
            int value = q[i] - (i+1);
            if(value > 2){
                System.out.println("Too chaotic");
                return;
            }
            if(value > 0){
                bribe += value;
            }
        }
        System.out.println(bribe);
    }
    static void minimumBribes(int[] q) {
        int ans = 0;
        for(int i=q.length-1;i>=0;i--){
            int ch_pos = q[i]-(i+1);
            if(ch_pos>2) { 
                System.out.println("Too chaotic");
                return; 
            }
            else{
                int st = Math.max(0,q[i]-2);
                for(int j=st;j<i;j++){
                    if(q[j]>q[i]) ans++;
                }
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int[] q = {1, 2 ,5 ,3 ,7 ,8 ,6 ,4};
        minimumBribes(q);
    }
}