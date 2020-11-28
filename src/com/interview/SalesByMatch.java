/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview;

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
        String[] arItems = {"10", "20", "20", "10", "10", "30", "50", "10", "20"};
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
