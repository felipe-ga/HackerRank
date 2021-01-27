/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.problemsolving;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Felipe Galindo
 * 
 */
public class AppleAndOrange {
    private static final String PATH = "//src//com//problemsolving//appleandorangetests//"; 
    public static int countFruit(int s, int t, int value,int[] fruits){
        int count = 0 ;
        for(int i = 0;i < fruits.length;i++){
            int temp = value + fruits[i];
            if(temp >= s && temp <= t){
               count++; 
            }   
        }
        return count;
    }
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        System.out.println(countFruit(s,t,a,apples));
        System.out.println(countFruit(s,t,b,oranges));
    }
    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("");
        String url  = text.getAbsolutePath().concat(PATH).concat("input00.txt");
        System.out.println(url);
        Scanner sc=new Scanner(new File(url));
        
        String[] st = sc.nextLine().split(" ");
        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);
        
        String[] ab = sc.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = sc.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);
        
        int[] apples = new int[m];

        String[] applesItems = sc.nextLine().split(" ");
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }
        
        int[] oranges = new int[n];

        String[] orangesItems = sc.nextLine().split(" ");
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        sc.close();
    }
}
