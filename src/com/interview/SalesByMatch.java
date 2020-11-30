/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author anonimo
 */
public class SalesByMatch {
    private static final Scanner scanner = new Scanner(System.in);
    static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        int count = 0;
        int i = 0;
        while(i < ar.length){
            if((i+1) < ar.length && ar[i] == ar[i+1]){
                count++;
                i+=2;
            }else{
                i++;
            }
        }
        return count;
    }
    static int sockMerchant2(int n, int[] ar) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0;i< ar.length;i++){
            if(map.containsKey(ar[i])){
                int value = map.get(ar[i]);
                map.put(ar[i],++value);
                if(value == 2){
                    count++;
                    map.put(ar[i],0);
                }
            }else{
                map.put(ar[i],1);
            }
        }
        return count;
    }
    public static void main(String arg[]){
        System.out.println("Give a number:");
        int n = scanner.nextInt();
        int[] ar = new int[n];
        String[] arItems = {"1", "1", "3", "1", "2", "1", "3", "3", "3","3"};
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
        scanner.close();
    }
}
