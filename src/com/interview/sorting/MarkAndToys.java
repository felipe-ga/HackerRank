/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview.sorting;

/**
 * Given a list of toy prices and an amount to spend, determine the maximum number of gifts he can buy.
 * @author Felipe Galindo
 */
public class MarkAndToys {
    static int maximumToys(int[] prices, int k) {
        int maximum = 0;
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            if(sum + prices[i] <= k){
                maximum++;
                sum += prices[i];
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        int[] prices = {3,7,2,9,4};
        int k = 15;
        System.out.println(maximumToys(prices,k));
    }
}
